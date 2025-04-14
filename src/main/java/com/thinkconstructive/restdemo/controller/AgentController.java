package com.thinkconstructive.restdemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restdemo.dto.AgentDto;
import com.thinkconstructive.restdemo.model.Agent;
import com.thinkconstructive.restdemo.service.AgentsService;
import com.thinkconstructive.restdemo.service.CloudVendorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/agents")
public class AgentController {

	@Autowired
	private final AgentsService agentsService;
	
	public AgentController(AgentsService agentsService) {
        this.agentsService = agentsService;
    }
	@GetMapping("/")
	public List<AgentDto> getAgents()
	{
		return agentsService.getAllAgents();
		//return "Inside get agents";
	}
	
	@GetMapping("/agResp")
	public ResponseEntity<List<AgentDto>> getAllUsers() {
	     List<AgentDto> agents = agentsService.getAllUsers();
	     return ResponseEntity.ok(agents); // 200 OK with body
	}
	
	@PostMapping("/addAgent")
	public ResponseEntity<Map<String, String>> createUser(@RequestBody AgentDto agentDto)
	{		
		AgentDto createdAgent = agentsService.createAgent(agentDto);
		//return new ResponseEntity<AgentDto>(createdAgent, HttpStatus.CREATED);	
		
		Map<String, String> response = new HashMap<>();
	    response.put("message", "Agent created successfully");

	    return ResponseEntity.status(HttpStatus.CREATED).body(response);
	    
	}
	
	
}
