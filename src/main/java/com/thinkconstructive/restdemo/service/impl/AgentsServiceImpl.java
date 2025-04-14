package com.thinkconstructive.restdemo.service.impl;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkconstructive.restdemo.dto.AgentDto;
import com.thinkconstructive.restdemo.exceptions.AgentAlreadyExistsException;
import com.thinkconstructive.restdemo.exceptions.ResourceNotFoundException;
import com.thinkconstructive.restdemo.mapper.AgentMapper;
import com.thinkconstructive.restdemo.model.Agent;
import com.thinkconstructive.restdemo.repository.AgentsRepository;
import com.thinkconstructive.restdemo.service.AgentsService;
import com.thinkconstructive.restdemo.dto.*;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
@Service
public class AgentsServiceImpl implements AgentsService{
	
	
	private final  AgentsRepository agentsRepo;
	private final AgentMapper agentMapper;
	
    private static final Logger log = LoggerFactory.getLogger(AgentsServiceImpl.class);

	public AgentsServiceImpl(AgentsRepository agentsRepo,AgentMapper agentMapper) {
		
		this.agentsRepo = agentsRepo;
		this.agentMapper=agentMapper;
	}


	@Override
	public List<AgentDto> getAllAgents() {
		/* using direct Entity to return 
		//return agentsRepo.findAll();	*/
		/* using mapstruct to return */
		return agentMapper.toDtoList(agentsRepo.findAll());
		
		/* using stream to return */
		//List<Agent> agent = agentsRepo.findAll();
		//return agent.stream()
                //.map(agentMapper::toDto)
                //.collect(Collectors.toList());
	}
	
    public List<AgentDto> getAllUsers() {
    	
    	List<Agent> agent = agentsRepo.findAll();
        
        if (agent.isEmpty()) {
            throw new ResourceNotFoundException("No users found");
        }

        return agent.stream()
                    .map(agentMapper::toDto)
                    .collect(Collectors.toList());
        
/* working without exception handling */        
//        return agentsRepo.findAll().stream()
//                .map(agent -> new AgentDto(
//                		agent.getAgentNo(),	
//                		agent.getAgentGateway(),	
//                		agent.getAgentType(),
//                		agent.getAgentName(),
//                		agent.getClient(),
//                		agent.getClientCrm(),
//                		agent.getCuserid()                		
//                		))
//                .collect(Collectors.toList());
    
    }
    
    public AgentDto createAgent(AgentDto agentDto)
    {
        log.info("saveCustomer(-) started");
    	if(agentsRepo.existsById(agentDto.getAgentNo())) {
    		throw new AgentAlreadyExistsException("AgenNo Already Exist");
    	}    	
    	Agent agent = agentMapper.toEntity(agentDto);
    	Agent savedAgent = agentsRepo.save(agent);
    	return agentMapper.toDto(savedAgent);
    }
    
}




