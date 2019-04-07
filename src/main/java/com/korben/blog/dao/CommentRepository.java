package com.korben.blog.dao;

import com.korben.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName CommentRepository
 * @Description TODO
 * @Author gy
 * @Date 2019-04-06 21:17
 **/

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
