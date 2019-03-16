package exp2;

public class Car extends Vehicles {
	public int seats;
	public void showCar() {
		super.run();
		super.showInfo(brand, color);
		System.out.println("×ùÎ»£º"+seats);
	}
	Car(String newBrand,String newColor,int newSeats){
		super(newBrand,newColor);
		this.seats=newSeats;
	}
}
