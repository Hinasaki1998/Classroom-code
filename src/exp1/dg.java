package exp1;

import java.util.Scanner;

public class dg {
	public static void main(String[] args) {  

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number of the drink:");
		int drinkType=input.nextInt();
		Drink drink = Drink.getDrink(drinkType);
		if(drinkType>3){
			System.out.println("对不起！没有你要的饮料类型。");
			
		}
		else {
			System.out.println(drink.taste());
		}
	}
}
