package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examle.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

