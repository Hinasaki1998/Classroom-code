package Model2;
public class Product extends Subject {
    public Product(){}
    public void notifys(){
    	System.out.println("����������£�֪ͨ�۲��߸���");
    	System.out.println("------------------");
        for (Observer obs : list){
            obs.update();
        }
    }
}