package com.greatlearning.corejava;

import java.util.Scanner;

public class AreaCircle {

	static double pi = 22 / 7;
	double radius;

	public static void main(String[] args) {
		AreaCircle ac = new AreaCircle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of radius: ");
		ac.radius = sc.nextDouble();

		double Area = (ac.pi * ac.radius * ac.radius);
		System.out.println("The Area of the Circle is: " + Area);
	}

}
