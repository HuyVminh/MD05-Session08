package com.ra.repository;

import com.ra.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepositoty extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
