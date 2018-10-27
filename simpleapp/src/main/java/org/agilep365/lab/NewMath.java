package org.agilep365.lab;

//import java.*;
//import java.math.*;
//import java.awt.*;
public class NewMath {
	public int addedValue = 1;

	/**
	 * Add for Calculator
	 * 
	 * @param numbers
	 * @return
	 */
	public int add(String numbers) {
		int sum = 0;
		// trigger
		if (numbers.length() != 0) {

			String[] strNums = numbers.split(",");
			for (String intStrNum : strNums) {
				int intNum = Integer.parseInt(intStrNum);
				sum += intNum;
			}
		}
		return sum;
	}

	// public int add(int x, int y) {
	// // bad smell
	// // for (int i = 0; i < 100; i++) {
	// // for (int j = 0; j < 100; j++) {
	// // for (int k = 0; k < 100; k++) {
	// // // 3 loops
	// // //x = x+ y;
	// // }
	// return x + y;
	// }
	//
	// public int minus(int x, int y) {
	// return x - y;
	// }
	//
	// public int multiply(int x, int y) {
	// return x * y;
	// }
	//
	// public double divide(double x, double y) {
	// return x / y;
	// }
}
