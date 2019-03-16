package Model2;
import java.util.ArrayList;
import java.util.List;
public class Subject {
    public Subject() {}
    List<Observer> list = new ArrayList<Observer>();
    public void attach(Observer obs){
        list.add(obs);
    }
    public void detach(Observer obs){
        list.remove(obs);
    }
    public void notifys() {}
}