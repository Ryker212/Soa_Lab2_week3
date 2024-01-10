import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement; 

@XmlRootElement
public class Customer {
	private String name;
	private ArrayList<PhoneNumber> phone;
	
	public Customer() {
		this.phone = new ArrayList();
	}
	public Customer(String name) {
		this.name =name;
		this.phone = new ArrayList();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="phone-number")
	public ArrayList<PhoneNumber> getPhoneNumbers() {
		return this.phone;
	}
	

}