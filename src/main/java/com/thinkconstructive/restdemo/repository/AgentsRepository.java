package com.thinkconstructive.restdemo.repository;

import com.thinkconstructive.restdemo.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agent,Long>{

}
