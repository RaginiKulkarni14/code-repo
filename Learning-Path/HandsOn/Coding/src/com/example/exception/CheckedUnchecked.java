package com.example.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class ABC {

	// 1)If the superclass method does not declare an exception,
	// 2)If the superclass method declares an exception,
	void msg() throws FileNotFoundException {

	}
}

class XYZ extends ABC {

	// 1)subclass overridden method cannot declare the checked exception but it can
	// declare unchecked exception.
	// 2)subclass overridden method can declare same subclass exception or no
	// exception but cannot declare parent exception.
	void msg() throws FileNotFoundException // ,IOException is checked exp subclass can't throw
	{

	}
}

public class CheckedUnchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
