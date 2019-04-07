package com.korben.blog.service;

import com.korben.blog.po.Comment;

import java.util.List;

/**
 * @ClassName CommentService
 * @Description TODO
 * @Author gy
 * @Date 2019-04-06 21:16
 **/

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
