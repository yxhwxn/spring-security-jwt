package com.security.springJWT.domain.repository;

import com.security.springJWT.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username);

    //username을 받아 DB에서 해당 유저를 조회하여 반환
    UserEntity findByUsername(String username);

}
