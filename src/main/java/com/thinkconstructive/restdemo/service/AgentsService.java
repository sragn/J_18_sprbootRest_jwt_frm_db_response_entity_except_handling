package com.thinkconstructive.restdemo.service;

import java.util.List;

import com.thinkconstructive.restdemo.dto.AgentDto;
import com.thinkconstructive.restdemo.model.Agent;

public interface AgentsService {

	public List<AgentDto> getAllAgents();
	public List<AgentDto> getAllUsers();	
	public AgentDto createAgent(AgentDto agentDto);
}
