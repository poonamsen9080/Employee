package com.hr.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.manager.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
