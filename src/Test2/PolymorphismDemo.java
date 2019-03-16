package Test2;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new Circle5(1,"red",false));
		displayObject(new Rectangle1(1,1,"rblack",true));
	}
	public static void displayObject(GeometricObject1 object) {
		System.out.println("Created on "+object.getDateCreated()+". Colors is "+object.getColor());
	}
}
