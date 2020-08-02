package com.myworks.jpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myworks.jpa.model.RunResults;
import com.myworks.jpa.repository.RunResultsRepository;

@Service
public class RunResultsService {
	@Autowired
	RunResultsRepository runResultsRepository;
	
	public List<RunResults> findAll(){
		List<RunResults> results=new ArrayList<>();
		runResultsRepository.findAll().forEach(results::add);
		return results;
	}
	public RunResults save(RunResults results){
		return runResultsRepository.save(results);
	}
}
