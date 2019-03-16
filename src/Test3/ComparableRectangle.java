package Test3;

public class ComparableRectangle extends Rectangle implements Comparable{
	public ComparableRectangle(double width,double height) {
		super(width,height);
	}
	public int compareTO(Object o) {
		if(getArea()>((ComparableRectangle)o).getArea())
			return 1;
		else if(getArea()<((ComparableRectangle)o).getArea())
			return -1;
		else
			return 0;
	}
	//public static void main(String[] args) {
	//	ComparableRectangle rectangle1 = new ComparableRectangle(4,5);
	//	ComparableRectangle rectangle2 = new ComparableRectangle(3,6);
	//	System.out.println(rectangle1);
	//	System.out.println(rectangle2);
	//}
}

