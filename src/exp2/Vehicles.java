package exp2;

public class Vehicles {
	public String brand;
	public String color;
	public void run() {
		System.out.println("���Ѿ�������");
	}
	public void showInfo(String brand,String color) {
		System.out.println("�̱꣺"+brand);
		System.out.println("��ɫ��"+color);
	}
	Vehicles (String newBrand,String newColor){
		this.brand=newBrand;
		this.color=newColor;
	}
}
