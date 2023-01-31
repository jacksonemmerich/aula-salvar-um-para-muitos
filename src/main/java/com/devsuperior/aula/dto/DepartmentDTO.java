package com.devsuperior.aula.dto;

public class DepartmentDTO {
	
	private Long id;
	private String name;
	
	public DepartmentDTO() {
		
	}
	
	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
}
