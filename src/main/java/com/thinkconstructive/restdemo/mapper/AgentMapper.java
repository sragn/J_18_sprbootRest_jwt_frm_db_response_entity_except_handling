package com.thinkconstructive.restdemo.mapper;

import java.util.List;

import org.mapstruct.*;

import com.thinkconstructive.restdemo.dto.AgentDto;
import com.thinkconstructive.restdemo.model.Agent;

@Mapper(componentModel = "spring")
public interface AgentMapper {

	AgentDto toDto(Agent agent);
	Agent toEntity(AgentDto agentDto);
	
	List<AgentDto> toDtoList(List<Agent> agent);
	
}
