package cloudwins;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Provider {
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	Provider() {
	}
	
	public Provider(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
