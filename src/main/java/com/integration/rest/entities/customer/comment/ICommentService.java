package com.integration.rest.entities.customer.comment;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface ICommentService extends IEntityService<Comment, Long> {

}
