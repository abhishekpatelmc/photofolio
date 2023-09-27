package com.abhishek.photofolio.post;

import com.abhishek.photofolio.amazon.AmazonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class PostService {

    private final PostDataAccessService postDataAccessService;
    private final AmazonClient amazonClient;

    @Autowired
    public PostService(PostDataAccessService postDataAccessService, AmazonClient amazonClient) {
        this.postDataAccessService = postDataAccessService;
        this.amazonClient = amazonClient;
    }

    List<Post> getPost() {
        return postDataAccessService.getPosts();
    }

    public void uploadPostImage(MultipartFile file) {
        this.amazonClient.upload(file);
    }

    public List<String> getImages() {
        return this.amazonClient.getImages();
    }
}
