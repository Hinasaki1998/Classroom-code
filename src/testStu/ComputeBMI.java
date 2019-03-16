package testStu;
import java.util.Scanner;
public class ComputeBMI {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight in pounds:");
		double weight=input.nextDouble();
		System.out.print("Enter height in inches:");
		double height=input.nextDouble();
		final double KILOGRAMS_PER_INCH=0.45359237;
		final double METERS_PER_INCH=0.0254;
		double weightKilograms=weight*KILOGRAMS_PER_INCH;
		double heightMeters=height*METERS_PER_INCH;
		double bmi=weightKilograms/(heightMeters*heightMeters);
		System.out.println("Your BMI is"+bmi);
		if(bmi<16)
			System.out.println("Your are seriously underweight");
		else if(bmi<18)
			System.out.println("Your are underweight");
		else if(bmi<24)
			System.out.println("Your are normal weight");
		else if(bmi<29)
			System.out.println("Your are overweight");
		else if(bmi<35)
			System.out.println("Your are seriously overweight");
		else
			System.out.println("Your are gravely overweight");
	}
}
