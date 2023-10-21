package com.example.OSSG_INVENTORY.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "INVENTORY")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SID")
	private int SID;

	@Column(name = "SERVER_NAME")
	private String SERVER_NAME;

	@Column(name = "PHYSICAL_IP")
	private String PHYSICAL_IP;

	@Column(name = "OS")
	private String OS;

	@Column(name = "ENVIRONMENT")
	private String ENVIRONMENT;

	@Column(name = "LOCATION")
	private String LOCATION;

	@Column(name = "PUNE_NAT_IP")
	private String PUNE_NAT_IP;

	@Column(name = "BLR_NAT_IP")
	private String BLR_NAT_IP;

	@Column(name = "POWER_STATUS")
	private String POWER_STATUS;

	@Column(name = "OWNER")
	private String OWNER;

	@Column(name = "PID")
	private int PID;
	
	@ManyToOne(targetEntity = Projects.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "PID", insertable = false, updatable = false)
	private Projects pname;

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(int sID, String sERVER_NAME, String pHYSICAL_IP, String oS, String eNVIRONMENT, String lOCATION,
			String pUNE_NAT_IP, String bLR_NAT_IP, String pOWER_STATUS, String oWNER, int pID, Projects pname) {
		super();
		SID = sID;
		SERVER_NAME = sERVER_NAME;
		PHYSICAL_IP = pHYSICAL_IP;
		OS = oS;
		ENVIRONMENT = eNVIRONMENT;
		LOCATION = lOCATION;
		PUNE_NAT_IP = pUNE_NAT_IP;
		BLR_NAT_IP = bLR_NAT_IP;
		POWER_STATUS = pOWER_STATUS;
		OWNER = oWNER;
		PID = pID;
		this.pname = pname;
		
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public String getSERVER_NAME() {
		return SERVER_NAME;
	}

	public void setSERVER_NAME(String sERVER_NAME) {
		SERVER_NAME = sERVER_NAME;
	}

	public String getPHYSICAL_IP() {
		return PHYSICAL_IP;
	}

	public void setPHYSICAL_IP(String pHYSICAL_IP) {
		PHYSICAL_IP = pHYSICAL_IP;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getENVIRONMENT() {
		return ENVIRONMENT;
	}

	public void setENVIRONMENT(String eNVIRONMENT) {
		ENVIRONMENT = eNVIRONMENT;
	}

	public String getLOCATION() {
		return LOCATION;
	}

	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}

	public String getPUNE_NAT_IP() {
		return PUNE_NAT_IP;
	}

	public void setPUNE_NAT_IP(String pUNE_NAT_IP) {
		PUNE_NAT_IP = pUNE_NAT_IP;
	}

	public String getBLR_NAT_IP() {
		return BLR_NAT_IP;
	}

	public void setBLR_NAT_IP(String bLR_NAT_IP) {
		BLR_NAT_IP = bLR_NAT_IP;
	}

	public String getPOWER_STATUS() {
		return POWER_STATUS;
	}

	public void setPOWER_STATUS(String pOWER_STATUS) {
		POWER_STATUS = pOWER_STATUS;
	}

	public String getOWNER() {
		return OWNER;
	}

	public void setOWNER(String oWNER) {
		OWNER = oWNER;
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public Projects getPname() {
		return pname;
	}

	public void setPname(Projects pname) {
		this.pname = pname;
	}



}
