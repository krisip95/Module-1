package edu.smg;

import java.util.Scanner;

public class ColorRange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String color="";

		double wavelength;

		System.out.print("enter a wavelenght in nm (380-750) ? "); 

		wavelength = input.nextDouble();

		if ((wavelength >= 380) && (wavelength <= 750))

			if (wavelength < 450)

				color = "violet";

			else if (wavelength < 495)

				color = "blue";

			else if (wavelength < 570)

				color = "green";

			else if (wavelength < 590)

				color = "yellow";

			else if (wavelength < 620)

				color = "orange";

			else if (wavelength <= 750)

				color = "red";

		System.out.println( wavelength + " is a " + color);

	}

}
