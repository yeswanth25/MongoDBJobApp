package com.project.jobApp.repository;

import java.util.List;

import com.project.jobApp.model.Post;

public interface SearchRepository {
	List<Post> findByText(String text);
}
