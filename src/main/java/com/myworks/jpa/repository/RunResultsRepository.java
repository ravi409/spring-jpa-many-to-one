package com.myworks.jpa.repository;

import org.springframework.stereotype.Repository;

import com.myworks.jpa.model.RunResults;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RunResultsRepository extends JpaRepository<RunResults, Long>{
}
