package nl.sogeti.vertx.webshop.model;

public class Category {
	private long id;	
	private String name;
	
	public Category(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	
}