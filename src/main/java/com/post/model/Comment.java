package com.post.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Comment {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String email;

    private String body;

    private Long postId;
}
