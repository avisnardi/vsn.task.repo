package br.com.vsn.tsk.domain;

public class Task {
	private Integer id;
	private String name;
	private Owner owner;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(Integer id, String name, Owner owner) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	
}
