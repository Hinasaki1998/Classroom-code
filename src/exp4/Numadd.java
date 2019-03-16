package exp4;
//编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和。（循环）
public class Numadd {
	public static void main(String[] args) {
		int num;
		int sum=0;
		for(int i=1;i<=10;i++) {
			num=1;
			for(int j=1;j<=i;j++)
				num=num*j;
			sum+=num;
		}
		System.out.println("1！+2！+3！+……+10！="+sum);
	}		
}
