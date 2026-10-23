package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight in Pounds");	
		
		double weightinPounds = scanner.nextDouble();
		
		System.out.println("Enter your height in meters");
		
		double height = scanner.nextDouble();
		
		//To convert pounds to ks
		double weightInKgs = weightinPounds*0.45359237;
		
		//BMI formula = weight (kg) / height (m)squared
		
	double bmi = weightInKgs/(height*height);
	System.out.println(bmi);
	
	if (bmi<18.5)
	{
			System.out.println("You are Underweight");
	}
	else if (bmi>=18.5 && bmi<24.9)
	{
		System.out.println("You are Normal");
	}
	else if (bmi>=25 && bmi<29.9)
	{
		System.out.println("You are Overweight");
	}
	else
	{
		System.out.println("You are Obese");
		}
	
	}
}
