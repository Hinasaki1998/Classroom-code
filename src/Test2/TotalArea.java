package Test2;

public class TotalArea {
	public static void main(String[] args) {
		Circle4[] circleArray;
		circleArray=creatCircleArray();
		printCircleArray(circleArray);
	}
	public static Circle4[] creatCircleArray() {
		Circle4[] circleArray=new Circle4[5];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle4(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(Circle4[] circleArray) {
		System.out.printf("%-30s%-15s\n", "radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("--------------------------------");
		System.out.printf("%-30s%-15f\n","The total area of circles is ",sum(circleArray));
	}
	public static double sum(Circle4[] circleArray) {
		double sum=0;
		for(int i=0;i<circleArray.length;i++)
			sum+=circleArray[i].getArea();
		return sum;
	}
}
