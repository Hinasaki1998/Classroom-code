package Model;
public class Benz extends CarBrand {
    public Benz() {
    	System.out.print("���۰�װ��");
    }
    public void install(NavigatorBrand navigator) {
        this.navigator=navigator;
    }
    public void open() {
    	navigator.work();
    }
}