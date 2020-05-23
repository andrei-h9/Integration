package com.integration.rest.entities.customer.comment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService {

	@Autowired
	private ICommentRepository commentRepository;

	public Optional<Comment> findById(Long commentId) {
		return commentRepository.findById(commentId);
	}

	public List<Comment> findAll() {
		return (List<Comment>) commentRepository.findAll();
	}

	public void insert(Comment comment) {
		commentRepository.save(comment);
	}

	public void update(Comment comment) {
		commentRepository.save(comment);
	}

	public void deleteById(Long commentId) {
		commentRepository.deleteById(commentId);
	}

}
