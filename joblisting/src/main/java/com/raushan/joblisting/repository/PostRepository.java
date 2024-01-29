package com.raushan.joblisting.repository;

import com.raushan.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository  extends MongoRepository<Post,String> {




}
