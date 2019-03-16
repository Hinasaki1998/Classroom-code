package Model2;
public class Test {
	public static void main(String[] args){
		Subject sub = new Product();
		Observer obs= new VersionObserver();
		sub.attach(obs);
	    sub.notifys();
    }
}
