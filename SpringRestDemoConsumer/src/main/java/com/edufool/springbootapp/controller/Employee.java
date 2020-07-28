package com.edufool.springbootapp.controller;


public class Employee {

	private int eId;
	private String eName;
	private String eDesignation;
	
	public Employee() {}

	public Employee(int eId, String eName, String eDesignation) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDesignation = eDesignation;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return new Employee(this.eId, this.eName, this.eDesignation);
	}
}
