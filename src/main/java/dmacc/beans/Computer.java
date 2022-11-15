/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Nov 14, 2022
*/
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author krazy
 *
 */
@Entity
public class Computer {
	@Id
	@GeneratedValue
	private int id;
	private String model;
	private int manufactureDate;
	private String company;
	private String operatingSystem;
	
	public Computer() {
		super();
		this.operatingSystem = "windows";
	}
	
	public Computer(String model) {
		this.model = model;
	}
	
	public Computer(String model, int manufactureDate, String company, String operatingSystem) {
		this.model = model;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.operatingSystem = operatingSystem;
	}
	
	public Computer(int id, String model, int manufactureDate, String company, String operatingSystem) {
		this.id = id;
		this.model = model;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.operatingSystem = operatingSystem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(int manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", model=" + model + ", manufactureDate=" + manufactureDate + ", company="
				+ company + ", operatingSystem=" + operatingSystem + "]";
	}
	
	
}
