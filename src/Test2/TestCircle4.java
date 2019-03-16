package Test2;

public class TestCircle4 {
	public static void main(String[] args) {
		Circle4 myCircle=new Circle4(5.0);
		System.out.println("The area of the circle of radius " +myCircle.getRadius()+" is "+myCircle.getArea());
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius " +myCircle.getRadius()+" is "+myCircle.getArea());
		System.out.println("The number of objects created is "+Circle4.getNumberOfObjects());
	}
}
