package pl.zaliczenie.biblioteka;

public class Address {
	private String street;
	private String city;
	private String number;
	private String phoneNumber;

	public Address(String street, String city, String number, String phoneNumber) {
		super();
		this.street = street;
		this.city = city;
		this.number = number;
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", number=" + number + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
