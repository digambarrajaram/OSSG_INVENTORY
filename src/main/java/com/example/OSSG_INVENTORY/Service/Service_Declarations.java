package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.Projects;


public interface Service_Declarations {
	
	public List<Inventory> getAllServers();
	public List<Projects> getAllProjects();
	
	public void addProject(Projects project);
	public void addServer(Inventory inventory);
	
	public void deleteServer(int sid);
	public void deleteProject(int pid);
	
	public void updateServer(Inventory inventory);
	
}
