# BMI-Calculator
BMI Calculator (Java)

Project Overview

This is a beginner-friendly Java console application that calculates Body Mass Index (BMI) from a user's weight in pounds and height in meters. It converts pounds to kilograms, calculates BMI, and displays a weight category.

Features

- Accepts weight in pounds and height in meters.
- Converts pounds to kilograms.
- Calculates BMI using the standard metric formula.
- Prints the calculated BMI and a weight-category message.
- Uses Java's Scanner class for user input and if/else if statements for decisions.

Technologies Used

- Java
- java.util.Scanner
- Console input/output

How to Run

1. Install a Java Development Kit (JDK).
2. Save the source code as BMICalculator.java.
3. From the folder containing the file, compile it:
   javac -d . BMICalculator.java
4. Run the application (the source declares the day3 package):
   java day3.BMICalculator
5. Enter your weight in pounds and height in meters when prompted.

Example Output

Enter your weight in Pounds
180
Enter your height in meters
1.75
26.660122971428574
You are Overweight
The displayed BMI is not rounded by the current program.

How It Works

1. Read the user's weight in pounds and height in meters using Scanner.
2. Convert pounds to kilograms:
   double weightInKgs = weightinPounds * 0.45359237;
3. Calculate BMI:
   double bmi = weightInKgs / (height * height);
4. Display the BMI and select a category with conditional statements.

BMI Categories in the Current Code

Condition in code	Displayed message
BMI < 18.5	You are Underweight
BMI >= 18.5 and BMI < 24.9	You are Normal
BMI >= 25 and BMI < 29.9	You are Overweight
Any other result	You are Obese


Important code note: The current conditional ranges leave gaps from 24.9 to below 25 and from 29.9 to below 30. Values in these gaps fall into the final else branch and display You are Obese. This describes the program as written, not the intended standard BMI classification.

Possible Future Improvements

- Update the category conditions to use continuous BMI ranges (for example, boundaries at 18.5, 25, and 30).
- Round the displayed BMI to two decimal places.
- Validate inputs to reject zero or negative height and weight.
- Handle nonnumeric input gracefully.
- Let users enter height in feet/inches as an alternative to meters.
- Add unit tests for the BMI calculation and boundary cases.

Learning Objectives

This project practices reading console input, working with double values, converting units, applying mathematical formulas, and controlling program flow with if/else if/else.

Disclaimer

BMI is a screening measure, not a diagnosis or a complete measure of health.
