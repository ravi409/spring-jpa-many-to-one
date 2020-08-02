package com.myworks.jpa.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myworks.jpa.dto.RunResultsDTO;
import com.myworks.jpa.model.RunResults;
import com.myworks.jpa.service.RunResultsService;

@RestController
public class JpaTestController {
	
	@Autowired
	RunResultsService runResultsService;
	
	@GetMapping("/runresults")
	public List<RunResults> findAll(){
		return runResultsService.findAll();
		
	}

	@GetMapping("/runresults/dto")
	public List<RunResultsDTO> findAllDto(){
		List<RunResults> runResults= runResultsService.findAll();
		return runResults.stream().map(e -> new RunResultsDTO(e)).collect(Collectors.toList());		
	}
	
	@PostMapping("/runresults")
	public RunResults save(@RequestBody RunResults runResults){
		return runResultsService.save(runResults);
	}
	
	@PostMapping("/runresults/dto")
	public RunResultsDTO saveDto(@RequestBody RunResultsDTO runResultsDto){
		RunResults rr=runResultsDto.toEntity();
		return new RunResultsDTO(runResultsService.save(rr));
	}
}
