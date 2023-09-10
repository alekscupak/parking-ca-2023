package com.aleksandr.blogca2023.repo;

import com.aleksandr.blogca2023.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
