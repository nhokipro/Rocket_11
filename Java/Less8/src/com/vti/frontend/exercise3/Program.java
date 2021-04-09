package com.vti.frontend.exercise3;

import com.vti.entity.exercise3.Employee;
import com.vti.entity.exercise3.MyMap;
import com.vti.entity.exercise3.Phone;

public class Program<T> {

	public static void main(String[] args) {
		Employee<Integer> a = new Employee<Integer>();
		Employee<Float> b = new Employee<Float>();
		Employee<Double> c = new Employee<Double>();
		MyMap <Integer, String> a1 = new MyMap<Integer, String>(1, "sơn");
		MyMap <Integer, String> a2 = new MyMap<Integer, String>(2, "b");
		Phone <Integer, String> b1 = new Phone <Integer, String>(1, "0123456789");
		Phone <String, String> b2 = new Phone <String, String>("abc@abc.abc", "0123456789");
		Phone <String, String> b3 = new Phone <String, String>("abc", "0123456789");
	}
}
