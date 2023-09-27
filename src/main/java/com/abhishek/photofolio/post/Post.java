package com.abhishek.photofolio.post;

import java.util.List;
import java.util.Objects;

public class Post {

    private String postName;
    private Long postId;
    private String postDescription;
    private List<String> postTags;
    private String postImageLink;

    public Post(Long postId, String postName, String postDescription, List<String> postTags, String postImageLink) {
        this.postId = postId;
        this.postName = postName;
        this.postDescription = postDescription;
        this.postTags = postTags;
        this.postImageLink = postImageLink;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public List<String> getPostTags() {
        return postTags;
    }

    public void setPostTags(List<String> postTags) {
        this.postTags = postTags;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Post(String postImageLink) {
        this.postImageLink = postImageLink;
    }

    public String getPostImageLink() {
        return postImageLink;
    }

    public void setPostImageLink(String postImageLink) {
        this.postImageLink = postImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(postImageLink, post.postImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postImageLink);
    }
}
