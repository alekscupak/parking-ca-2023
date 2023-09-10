package com.aleksandr.blogca2023.service;

import com.aleksandr.blogca2023.entities.Comment;
import com.aleksandr.blogca2023.repo.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void addCommentToTopic(Comment comment) {
        commentRepository.save(comment);
    }
}