package com.bdqn.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
//		/**
//		 * static修饰的变量或方法 随类的加载而加载
//		 * 非静态随对象的创建而存在
//		 * 能
//		 * 能
//		 * 能
//		 * */	
//		Dog.eat();
		
		/**
		 * 1、获得字节码对象
		 * 通过类名   通过对象   通过Class类内置方法
		 * */
		//通过类名获得字节码对象 --需要知道类名
//		Class clazz = Dog.class;
//		System.out.println(clazz);
		
		//通过对象获得 --需要创建对象 失去反射本质
//		Class clazz = new Dog().getClass(); //new Dog() -- 匿名对象
//		System.out.println(clazz);
		
		//通过Class类内置方法获得 
		Class clazz = Class.forName("com.bdqn.fanshe.Dog");//参数为 全  限定  类名
		
//		System.err.println(dd);
		/**
		 *2、获得构造方法
		 * 
		 * */
		
		Constructor[] cons = clazz.getConstructors();//获得public权限的 所有构造方法
//		for (Constructor constructor : cons) {
//			v
//			}
		Constructor<?> con = clazz.getConstructor(); //获得指定public权限构造方法
//		System.out.println(con);
		
		Constructor[] conss = clazz.getDeclaredConstructors();//获得全部权限  所有构造
//		for (Constructor constructor : conss) {
//			System.out.println(constructor);
//		}
		
		Constructor conn = clazz.getDeclaredConstructor(String.class);//注意参数
		
		/**
		 * 通过构造器 创建对象
		 * */
		conn.setAccessible(true); //暴力反射  使Java跳过代码检查
		
		Dog d = (Dog)conn.newInstance("二哈");//创建对象
		
		
		/**
		 * 通过字节码对象 获得指定类的 方法
		 * 语法：
		 * 		字节码对象.getMethod();
		 * */
		
	//	Method[] m = clazz.getMethods();//获得 所有 public权限方法 包括父类的
//		for (Method method : m) {
//			System.out.println(method);
//		}
		
//		Method m = clazz.getMethod("eat"); //获得指定public修饰 方法
//		System.out.println(m);
		
//		Method [] m = clazz.getDeclaredMethods(); //获得所有方法  自动过滤父类方法
//		for (Method method : m) {
//			System.out.println(method);
//		}
		
		Method m = clazz.getDeclaredMethod("play"); //获得全部权限 指定方法
//		System.out.println(m);
//		m.setAccessible(true); //暴力反射
//		m.invoke(d);//执行接收到的 方法
		
		
		/**
		 * 3、通过字节码对象  获得制定类变量
		 * */
		
	//	Field[] f = clazz.getFields(); //获得所有public变量
//		for (Field field : f) {
//			System.out.println(field);
//		}
//		
//		Field f =clazz.getField("name");//指定获得public变量
//		System.out.println(f);
		
//		Field[] f = clazz.getDeclaredFields();//获得全部权限的所有变量
//		for (Field field : f) {
//			System.err.println(field);
//		}
		
		
		Field f = clazz.getDeclaredField("age");//获得指定全部权限的变量
		f.setAccessible(true);
		f.set(d, "50"); //改变指定变量的值
		System.out.println(f.get(d)); //获得指定方法的 值 语法：获得的变量.get(对象名)
	}
}
