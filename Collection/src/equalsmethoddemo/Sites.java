package equalsmethoddemo;

import java.util.Objects;

/* Program to demonstrate */
public class Sites {
	private String name;
	private Integer id;
	
	
	// overriding hashcode() and equals() method
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	/* only using equals() method when we comapre teo object we will not get 
	 * the comparison as true for that we need to override equals method*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sites other = (Sites) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public Sites(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
