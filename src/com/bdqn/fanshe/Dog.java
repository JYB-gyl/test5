package com.bdqn.fanshe;

public class Dog {

	public String name="小哈";
	private String age="2";
	protected String address="主人家中";
	String weight = "20kg";
	
	// public修饰  无参构造
	public Dog() {
		
	}
	//private 修饰  有参构造ccc
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
	System.out.println("小狗正在吃");
	}
	
	private void play()  { 
		System.out.println("小狗正在玩");
	}
	 
}
