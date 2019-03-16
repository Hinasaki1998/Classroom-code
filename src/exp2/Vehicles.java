package exp2;

public class Vehicles {
	public String brand;
	public String color;
	public void run() {
		System.out.println("我已经开动了");
	}
	public void showInfo(String brand,String color) {
		System.out.println("商标："+brand);
		System.out.println("颜色："+color);
	}
	Vehicles (String newBrand,String newColor){
		this.brand=newBrand;
		this.color=newColor;
	}
}
