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
	
}
