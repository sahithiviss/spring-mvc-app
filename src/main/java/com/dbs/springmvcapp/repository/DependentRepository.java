package com.dbs.springmvcapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.springmvcapp.model.Dependent;

@Repository
public interface DependentRepository extends JpaRepository<Dependent, Long>{

}
