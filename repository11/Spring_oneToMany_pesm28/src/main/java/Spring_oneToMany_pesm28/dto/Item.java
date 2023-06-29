package Spring_oneToMany_pesm28.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value = "prototype")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private double prise;

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

	public double getPrise() {
		return prise;
	}

	public void setPrise(double prise) {
		this.prise = prise;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", prise=" + prise + "]";
	}
	

}
