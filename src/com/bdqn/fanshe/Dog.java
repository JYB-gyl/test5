package com.bdqn.fanshe;

public class Dog {

	public String name="С��";
	private String age="2";
	protected String address="���˼���";
	String weight = "20kg";
	
	// public����  �޲ι���
	public Dog() {
		
	}
	//private ����  �вι���ccc
	//publicgong
	private Dog(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public   void eat() { 
	System.out.println("С�����ڳ�");
	}
	
	private void play()  { 
		System.out.println("С��������");
	}
	 
}
