package exp2;

public class Truck extends Vehicles{
	public float load;
	public void showTruck() {
		super.run();
		super.showInfo(brand, color);
		System.out.println("‘ÿ÷ÿ£∫"+load+"∂÷");
	}	
	Truck(String newBrand,String newColor,float newLoad){
		super(newBrand,newColor);
		this.load=newLoad;
	}
}
