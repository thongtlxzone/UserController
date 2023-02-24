package com.example.demo.repository;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,Integer> {
    List<UsersEntity> findByEmailAndPassword(String name, String password);
    List<UsersEntity> findAll();
    @Query("select u from users as u")//Day la cau query viet bang JQL, tuong tac voi class Ent ity
    List<UsersEntity> getAllUser();

    @Query("select u from users as u join roles r on u.roles.id = r.id where u.email = ?1 and r.name = ?2")//Day la cau query viet bang JQL, tuong tac voi class Ent ity
    List<UsersEntity> getUserByEmailAndRoleName(String email, String roleName);
}
