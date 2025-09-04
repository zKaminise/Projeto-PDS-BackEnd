package com.example.ManagerProjectPDS.Repositorys;

import com.example.ManagerProjectPDS.Entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    User findByResetPasswordToken(String token);
}
