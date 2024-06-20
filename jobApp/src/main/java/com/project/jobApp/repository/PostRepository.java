package com.project.jobApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.project.jobApp.model.Post;


public interface PostRepository extends MongoRepository<Post,String> {
	
}
