package com.bdqn.fanshe;

public class Test2 {
	
	public String name = "static—› æ";
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Class clazz =	Test2.class;
	 	Test2 tt = (Test2)clazz.newInstance();
	 	System.out.println(tt.name);
	}

}
