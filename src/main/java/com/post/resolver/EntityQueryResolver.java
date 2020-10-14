package com.post.resolver;

import com.post.model.Comment;
import com.post.model.Post;
import com.post.model.User;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class EntityQueryResolver implements GraphQLQueryResolver {

    private final String REST_URL = "https://jsonplaceholder.typicode.com/";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Returns a User for the given id
     *
     * @param id Primary key of the User
     * @return An instance of User
     */
    public User getUserById(Long id) {
        return restTemplate.getForObject(REST_URL + "users/" + id, User.class);
    }

    /**
     * Returns an Post for the given id
     *
     * @param id Primary key of the Post
     * @return An instance of Post
     */
    public Post getPostById(Long id) {
        return restTemplate.getForObject(REST_URL + "posts/" + id, Post.class);
    }

    /**
     * Returns a Comment for the given id
     *
     * @param id Primary key of the Comment
     * @return An instance of Comment
     */
    public Comment getCommentById(Long id) {
        return restTemplate.getForObject(REST_URL + "comments/" + id, Comment.class);

    }

    /**
     * Returns an Comments from the given post id
     *
     * @param id Primary key of the Post
     * @return list of comments
     */
    public Comment[] getCommentsFromPostId(Long id) {
        return restTemplate.getForObject(REST_URL + "posts/" + id + "/comments", Comment[].class);

    }
}
