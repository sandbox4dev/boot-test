package com.springboot.repository;

import com.springboot.common.UserRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReopsitory extends JpaRepository<UserRoot,Long> {
}
