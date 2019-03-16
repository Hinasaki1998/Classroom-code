package Test2;

public class TestCircleRectangl1 {
	public static void main(String[] args) {
		Circle5 circle=new Circle5(1);
		System.out.println("A circle "+circle.toString());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		Rectangle1 rectangle=new Rectangle1(2,4);
		System.out.println("\nA rectangle "+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	}
}
