package tw.leonchen.model;

import org.springframework.stereotype.Component;

@Component(value = "animal") //<bean id="animal" class="tw.leonchen.model.Animal"/>

public class Animal {
	
	private int id;
	private String name;
	private String contient;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContient() {
		return contient;
	}
	public void setContient(String contient) {
		this.contient = contient;
	}

}
