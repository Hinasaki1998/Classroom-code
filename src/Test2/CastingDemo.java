package Test2;
public class CastingDemo {
	public static void main(String[] args) {
		Object object1 = new Circle5(1);
		Object object2 = new Rectangle1(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if(object instanceof Circle5) {
			System.out.println("The circle area is " + ((Circle5)object).getArea());
			System.out.println("The diameter area is " + ((Circle5)object).getDiameter());
		}
		else if(object instanceof Rectangle1) {
			System.out.println("The rectangle area is " + ((Rectangle1)object).getArea());
		}
	}
}
