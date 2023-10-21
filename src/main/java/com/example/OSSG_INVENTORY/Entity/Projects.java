package com.example.OSSG_INVENTORY.Entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "PROJECTS")
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PID")
	private int PID;

	@Column(name = "PROJECT_NAME")
	private String PROJECT_NAME;

	@OneToMany(mappedBy = "pname")
	private Set<Inventory> proId;

	public int getPID() {
		return PID;
	}

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(int pID, String pROJECT_NAME) {
		super();
		PID = pID;
		PROJECT_NAME = pROJECT_NAME;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public String getPROJECT_NAME() {
		return PROJECT_NAME;
	}

	public void setPROJECT_NAME(String pROJECT_NAME) {
		PROJECT_NAME = pROJECT_NAME;
	}
}
