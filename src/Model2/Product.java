package Model2;
public class Product extends Subject {
    public Product(){}
    public void notifys(){
    	System.out.println("软件发布更新，通知观察者更新");
    	System.out.println("------------------");
        for (Observer obs : list){
            obs.update();
        }
    }
}