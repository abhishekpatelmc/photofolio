package com.abhishek.photofolio.post;

import com.abhishek.photofolio.datastore.DummyPhotoPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDataAccessService {

    private final DummyPhotoPost dummyPhotoPost;

    @Autowired
    public PostDataAccessService(DummyPhotoPost dummyPhotoPost) {
        this.dummyPhotoPost = dummyPhotoPost;
    }

    List<Post> getPosts() {
        return DummyPhotoPost.getPosts();
    }
}
