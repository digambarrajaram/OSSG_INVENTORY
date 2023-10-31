package com.example.OSSG_INVENTORY.controller;


import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.OSSG_INVENTORY.Entity.*;
import com.example.OSSG_INVENTORY.Service.Service_Implementation;

@RestController
@RequestMapping("/inventory")
public class Inventory_Controller {
	private Service_Implementation si;
	
	public Inventory_Controller(Service_Implementation si) {
		this.si = si;
	}
	
	@GetMapping("serverlist")
	public List<Inventory> getAllServers(){
		return si.getAllServers();
	}
	
	@GetMapping("/projectlist")
	public List<Projects> getAllProjects(){
		return si.getAllProjects();
	}
	
	@PostMapping("/addproject")
	public String addProject(@RequestBody Projects project) {
		
		try {
			si.addProject(project);
			return "Project Added";
		} catch (Exception e) {
			return "Project Not Added";
		}
		
		
	}
	
	@PostMapping("/addserver")
	public String addServer(@RequestBody Inventory inventory) {
		
		try {
			si.addServer(inventory);
			return "Server Added";
		} catch (Exception e) {
			return "Server Not Added";
		}
	}
	
	@PostMapping("/deleteserver/{sid}")
	public String deleteServer(@PathVariable("sid") int sid) {
		
		try {
			si.deleteServer(sid);
			return "Server Deleted";
		} catch (Exception e) {
			return "Server Not Deleted";
		}
		
	}
	
	@PostMapping("/deleteproject/{pid}")
	public String deleteProject(@PathVariable("pid") int pid) {
		
		try {
			si.deleteProject(pid);
			return "Project Deleted";
		} catch (Exception e) {
			return "Project Not Deleted";
		}
		
	}
	
	
	
}
