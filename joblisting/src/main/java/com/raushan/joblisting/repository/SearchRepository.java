package com.raushan.joblisting.repository;

import com.raushan.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
