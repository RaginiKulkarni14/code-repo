package com.example.basicOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal
{
	int i=10;
	Animal()
	{
		System.out.println("Animal const");
	}
}

class Dog extends Animal implements Serializable
{
	int j=20;
	Dog()
	{
		System.out.println("Dog const");
	}
}


public class TestSerial {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Dog dog=new Dog();
		dog.i=888;
		dog.j=999;
		
			FileOutputStream fout=new FileOutputStream("C:\\Users\\rukulkar\\Desktop\\testout.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(dog);
			
			System.out.println("de-serialization");
			
			FileInputStream fin=new FileInputStream("C:\\Users\\rukulkar\\Desktop\\testout.ser");
			ObjectInputStream ois=new ObjectInputStream(fin);
			Dog d2=(Dog) ois.readObject();
			
			System.out.println(d2.i+":"+d2.j);
			
			
			
	}

}
