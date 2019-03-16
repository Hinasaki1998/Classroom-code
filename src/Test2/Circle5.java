package Test2;

public class Circle5 extends GeometricObject1{
	private double radius;
	public Circle5() {
	}
	public Circle5(double radius) {
		this.radius=radius;
	}
	public Circle5(double radius,String color,boolean filled) {
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void printCirle() {
		System.out.println("The circle is created "+getDateCreated()+"and the radius is "+radius );
	}
}
