package com.post.resolver;

import com.post.model.Post;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EntityMutationResolver implements GraphQLMutationResolver {

    private final String REST_URL = "https://jsonplaceholder.typicode.com/";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Update Post by given Id
     *
     * @param id     the id of the entity.
     * @param title  the title of the entity.
     * @param body   the body of the entity.
     * @param userId the body of the entity.
     * @return the entity.
     */
    public Post updatePost(Long id, String title, String body, Long userId) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Post> entity = new HttpEntity<>(new Post(id, title, body, userId), headers);
        return restTemplate.exchange(REST_URL + "posts/" + id, HttpMethod.PUT, entity, Post.class).getBody();
    }

    /**
     * Delete Post by given Id
     *
     * @param id the id of the entity.
     * @return entity deleted or not
     */
    public boolean deletePost(Long id) throws Exception {
        restTemplate.delete(REST_URL + "posts/" + id);
        return true;
    }
}
