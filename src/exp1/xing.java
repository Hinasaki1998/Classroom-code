package exp1;

import java.util.Scanner;

public class xing {
	public static void main(String[] args) {
		int floor;
		Scanner input = new Scanner(System.in);
		System.out.printf("���������");
		floor=input.nextInt();
		for(int i=0;i<floor;i++){
			int time=2*i+1;
			int n=0;
			while(n!=(floor-i)){
				System.out.printf("   ");			
				n++;
			}	
			while(time!=0){
				System.out.printf("��");
				time--;
			}
			System.out.println();
		}
	}
}
