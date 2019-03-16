package exp2;

public class Rect1 extends Rect {
	private double h;
	Rect1(double c, double k,double g) {
		super(c, k);
		h=g;
	}
	public double v()
	{
		return s()*h;
	}

}