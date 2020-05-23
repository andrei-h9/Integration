package com.integration.rest.entities.customer.comment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/comment")
public class CommentController implements IEntityController<Comment, Long> {

	@Autowired
	private ICommentService commentService;

	public Optional<Comment> findById(@PathVariable("id") Long commentId) {
		return commentService.findById(commentId);
	}

	public List<Comment> getAll() {
		return commentService.findAll();
	}

	public void insert(@RequestBody Comment comment) {
		commentService.insert(comment);
	}

	public void update(@RequestBody Comment comment) {
		commentService.update(comment);
	}

	public void delete(@PathVariable("id") Long commentId) {
		commentService.deleteById(commentId);
	}

}
