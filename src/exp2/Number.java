package exp2;

public class Number {
	private double n1;
	private double n2;
	Number(double newn1,double newn2){
		this.n1=newn1;
		this.n2=newn2;
	}
	public double addition() {
		return n1+n2;
	}
	public double subtration() {
		return n1-n2;
	}
	public double multiplication() {
		return n1*n2;
	}
	public double division() {
		return n1/n2;
	}
	public static void main(String[] args) {
		Number x1 = new Number(5.3,2);
		Number x2 = new Number(5.3,9);
		System.out.println("�ӷ���"+x1.addition());
		System.out.println("������"+x1.subtration());
		System.out.println("�˷���"+x1.multiplication());
		System.out.println("������"+x1.division());
		System.out.println("�ӷ���"+x2.addition());
		System.out.println("������"+x2.subtration());
		System.out.println("�˷���"+x2.multiplication());
		System.out.println("������"+x2.division());
	}
}
