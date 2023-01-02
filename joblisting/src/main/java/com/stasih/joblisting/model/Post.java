package com.stasih.joblisting.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String description;
    private int experience;
    private List<String> technologies;
}
