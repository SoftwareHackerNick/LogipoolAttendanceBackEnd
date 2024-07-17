package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.UserMaster;

public interface UserMasterRepository extends JpaRepository<UserMaster, Integer>{

}
