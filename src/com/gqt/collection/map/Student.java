package com.gqt.collection.map;

public class Student {
	int id;
	String name;
	Address address;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name,Address a) {
		this(id,name);
		this.address=a;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object o) {
		if((o==null)|| !(o instanceof Address))return false;
		Student s=(Student)o;
		return s.name.equals(this.name)&&s.address.equals(this.address);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
