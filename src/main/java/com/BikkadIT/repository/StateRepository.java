package com.BikkadIT.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.entity.StatesMasterEntity;
@Repository
public interface StateRepository extends JpaRepository<StatesMasterEntity, Serializable> {

}
