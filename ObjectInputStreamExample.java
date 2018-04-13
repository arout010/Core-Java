package com.journaldev.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Employee{

}
public class ObjectInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("EmployeeObject.ser");
			ObjectInputStream ois = new ObjectInputStream(is);
			Employee emp = (Employee) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
