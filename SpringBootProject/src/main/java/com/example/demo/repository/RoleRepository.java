package com.example.demo.repository;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Tham so thu nhat trong JpaRepository<Ten repository, Kieu du lieu cua khoa chinh>
//@Component, @Service, @Repository, @Bean thuong duoc khai bao o @Configuration se duoc luu tru tren IOC(Container dung chung).
@Repository
public interface RoleRepository extends JpaRepository<RolesEntity,Integer> {
    List<RolesEntity> findByName(String name);
}
