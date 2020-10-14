package com.post.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String username;

    private String email;

}
