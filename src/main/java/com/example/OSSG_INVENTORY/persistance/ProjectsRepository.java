package com.example.OSSG_INVENTORY.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.*;


import com.example.OSSG_INVENTORY.Entity.Projects;


public interface ProjectsRepository extends JpaRepository<Projects, Integer> 
{
	//public List<Projects> getAllProjects();
}
