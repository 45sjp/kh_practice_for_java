package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

public class Run {

	public static void main(String[] args) {
		CoffeeManager cm = new CoffeeManager();
		cm.insertData();
		cm.printData();
	}

}
