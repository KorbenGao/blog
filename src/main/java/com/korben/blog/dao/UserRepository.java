package com.korben.blog.dao;

import com.korben.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

    User findByEmailAndPassword(String email, String password);
}
