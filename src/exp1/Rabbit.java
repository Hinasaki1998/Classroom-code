package exp1;

import java.util.Scanner;

public class Rabbit {
	public static void main(String[] args) {
		int num=1;
		int temp;
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		for(int i=1,m=1,n=1;i<x;i++){
				if(i<=2)
					System.out.println("兔子数目为："+num*2);
				else{
					
					num=m+n;
					temp=num;
					System.out.println("兔子数目为："+num*2);
					m=n;
					n=temp;
				}
		}	
	}
}
