package com.abhishek.photofolio.datastore;

import com.abhishek.photofolio.post.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DummyPhotoPost {

    private static final List<Post> POSTS = new ArrayList<>();

    static {
        POSTS.add(
            new Post(
                1L,
                "Mountain",
                "Sea and Mountain",
                List.of("Mountain","Photography","Nature"),
                "https://images.unsplash.com/photo-1694721804143-7c611fde4b22?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1935&q=80"
            )
        );
        POSTS.add(
            new Post(
                2L,
                "City",
                "Amazing City",
                List.of("City","Building","Beautiful"),
                "https://images.unsplash.com/photo-1694445945858-d7010f74e9b2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1936&q=80"
            )
        );
        POSTS.add(
            new Post(
                3L,
                "River",
                "River and forest",
                List.of("River","Forest","Nature"),
                "https://images.unsplash.com/photo-1694587970265-a6b828d4d1c4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2071&q=80"
            )
        );
        POSTS.add(
            new Post(
                4L,
                "Snow Mountain",
                "Hiking in Snow Mountain",
                List.of("Snow","Mountain","Hiking"),
                "https://images.unsplash.com/photo-1695153374208-1b8382bd6388?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1740&q=80"
            )
        );
        POSTS.add(
            new Post(
                5L,
                "Desert",
                "Desert and mountain",
                List.of("Desert","Mountain","Nature"),
                "https://images.unsplash.com/photo-1682686581427-7c80ab60e3f3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
            )
        );
        POSTS.add(
            new Post(
                6L,
                "SkyScraper",
                "SkyScraper and city",
                List.of("SkyScraper","City","Building"),
                "https://images.unsplash.com/photo-1694732519038-dcc9379eb148?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
            )
        );
        POSTS.add(
            new Post(
                7L,
                "Castle",
                "Castle and forest",
                List.of("Castle","Forest","Nature"),
                "https://images.unsplash.com/photo-1694893501629-7e4b82313e42?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
            )
        );
        POSTS.add(
            new Post(
                8L,
                "Waterfall",
                "Waterfall and forest",
                List.of("Waterfall","Forest","Nature"),
                "https://images.unsplash.com/photo-1694977524091-b5b4520fdc2b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1974&q=80"
            )
        );
    }

    public static List<Post> getPosts() {
        return POSTS;
    }
}
