package com.bdqn.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
//		/**
//		 * static���εı����򷽷� ����ļ��ض�����
//		 * �Ǿ�̬�����Ĵ���������
//		 * ��
//		 * ��
//		 * ��
//		 * */	
//		Dog.eat();
		
		/**
		 * 1������ֽ������
		 * ͨ������   ͨ������   ͨ��Class�����÷���
		 * */
		//ͨ����������ֽ������ --��Ҫ֪������
//		Class clazz = Dog.class;
//		System.out.println(clazz);
		
		//ͨ�������� --��Ҫ�������� ʧȥ���䱾��
//		Class clazz = new Dog().getClass(); //new Dog() -- ��������
//		System.out.println(clazz);
		
		//ͨ��Class�����÷������ 
		Class clazz = Class.forName("com.bdqn.fanshe.Dog");//����Ϊ ȫ  �޶�  ����
		
//		System.err.println(dd);
		/**
		 *2����ù��췽��
		 * 
		 * */
		
		Constructor[] cons = clazz.getConstructors();//���publicȨ�޵� ���й��췽��
//		for (Constructor constructor : cons) {
//			v
//			}
		Constructor<?> con = clazz.getConstructor(); //���ָ��publicȨ�޹��췽��
//		System.out.println(con);
		
		Constructor[] conss = clazz.getDeclaredConstructors();//���ȫ��Ȩ��  ���й���
//		for (Constructor constructor : conss) {
//			System.out.println(constructor);
//		}
		
		Constructor conn = clazz.getDeclaredConstructor(String.class);//ע�����
		
		/**
		 * ͨ�������� ��������
		 * */
		conn.setAccessible(true); //��������  ʹJava����������
		
		Dog d = (Dog)conn.newInstance("����");//��������
		
		
		/**
		 * ͨ���ֽ������ ���ָ����� ����
		 * �﷨��
		 * 		�ֽ������.getMethod();
		 * */
		
	//	Method[] m = clazz.getMethods();//��� ���� publicȨ�޷��� ���������
//		for (Method method : m) {
//			System.out.println(method);
//		}
		
//		Method m = clazz.getMethod("eat"); //���ָ��public���� ����
//		System.out.println(m);
		
//		Method [] m = clazz.getDeclaredMethods(); //������з���  �Զ����˸��෽��
//		for (Method method : m) {
//			System.out.println(method);
//		}
		
		Method m = clazz.getDeclaredMethod("play"); //���ȫ��Ȩ�� ָ������
//		System.out.println(m);
//		m.setAccessible(true); //��������
//		m.invoke(d);//ִ�н��յ��� ����
		
		
		/**
		 * 3��ͨ���ֽ������  ����ƶ������
		 * */
		
	//	Field[] f = clazz.getFields(); //�������public����
//		for (Field field : f) {
//			System.out.println(field);
//		}
//		
//		Field f =clazz.getField("name");//ָ�����public����
//		System.out.println(f);
		
//		Field[] f = clazz.getDeclaredFields();//���ȫ��Ȩ�޵����б���
//		for (Field field : f) {
//			System.err.println(field);
//		}
		
		
		Field f = clazz.getDeclaredField("age");//���ָ��ȫ��Ȩ�޵ı���
		f.setAccessible(true);
		f.set(d, "50"); //�ı�ָ��������ֵ
		System.out.println(f.get(d)); //���ָ�������� ֵ �﷨����õı���.get(������)
	}
}
