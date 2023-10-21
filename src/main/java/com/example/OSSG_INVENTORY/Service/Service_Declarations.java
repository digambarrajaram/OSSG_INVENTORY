package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.Projects;


public interface Service_Declarations {
	
	public List<Inventory> getAllServers();
	public List<Projects> getAllProjects();
	
}
