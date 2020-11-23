package EvolentH.EvolentH.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name="phone_number")
    private int phone_number;
    
    @Column (name="status")
    private boolean status;
    
    
    public Employee() {

    }

    public Employee(String firstName, String lastName, String email,int phone_number,boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone_number=phone_number;
        this.status=status;
    }
    public Employee(int id,String firstName, String lastName, String email,int phone_number,boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id=id;
        this.phone_number=phone_number;
        this.status=status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ",phone_number="+phone_number+"]";
    }
}