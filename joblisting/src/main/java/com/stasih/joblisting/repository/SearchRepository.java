package com.stasih.joblisting.repository;

import com.stasih.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
