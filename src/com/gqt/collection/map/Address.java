package com.gqt.collection.map;

public class Address {
	int dno,pin;
	String street,area,city;
	
	public Address(int dno, String street, String area, String city) {
		this.dno = dno;
		this.street = street;
		this.area = area;
		this.city = city;
	}

	public Address(int dno, int pin, String street, String area, String city) {
		this(dno,street,area,city);
		this.pin = pin;
		
	}

	@Override
	public int hashCode() {
		return this.pin+city.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if(o==null || !(o instanceof Address))return false;
		Address a=(Address)o;
				
		return this.pin==a.pin && this.street.equals(a.street) && this.area.equals(a.area) && this.city.equals(a.city) && this.dno==a.dno;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", pin=" + pin + ", street=" + street + ", area=" + area + ", city=" + city
				+ "]";
	}
	
	
	
	

}
