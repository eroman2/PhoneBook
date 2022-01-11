package phoneBook;

public class Person{

	String city;
	String state;
	String street;
	String firstName;
	String lastName;
	String phoneNumber;	
	
	public Person(String firstNam, String lastName, String phoneNumber, String street, String city, String state) {
		firstName = firstNam;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		
	}
	public Person() {
		
	}
	public void printPerson() {
		System.out.print(firstName + " " + lastName + ", " + street + ", " + city + ", " + state + ", ");
		printNumber();
		System.out.println();
	}
	public void printNumber() {
		System.out.print("(" + phoneNumber.charAt(0) + phoneNumber.charAt(1) + phoneNumber.charAt(2) + ")-" + phoneNumber.charAt(3) + phoneNumber.charAt(4) + phoneNumber.charAt(5) + "-" + phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9));
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	


}
