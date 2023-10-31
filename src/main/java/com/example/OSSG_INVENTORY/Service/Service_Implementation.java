package com.example.OSSG_INVENTORY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OSSG_INVENTORY.Entity.Inventory;
import com.example.OSSG_INVENTORY.Entity.Projects;
import com.example.OSSG_INVENTORY.persistance.InventoryRepository;
import com.example.OSSG_INVENTORY.persistance.ProjectsRepository;

import jakarta.transaction.Transactional;

@Service
public class Service_Implementation implements Service_Declarations {

	private InventoryRepository ir;
	private ProjectsRepository pr;

	@Autowired
	public Service_Implementation(InventoryRepository ir, ProjectsRepository pr) {
		super();
		this.ir = ir;
		this.pr = pr;
	}

	@Override
	@Transactional
	public List<Inventory> getAllServers() {
		return ir.getAllServers();
	}

	@Override
	@Transactional
	public List<Projects> getAllProjects() {
		return pr.findAll();
	}

	@Override
	@Transactional
	public void addProject(Projects project) {
		pr.save(project);
		
	}

	@Override
	@Transactional
	public void addServer(Inventory inventory) {
		ir.save(inventory);
		
	}

	@Override
	@Transactional
	public void deleteServer(int sid) {
		ir.deleteById(sid);
	}

	@Override
	@Transactional
	public void deleteProject(int pid) {
		pr.deleteById(pid);
	}
}
