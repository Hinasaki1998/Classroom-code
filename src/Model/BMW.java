package Model;
public class BMW extends CarBrand {
    public BMW() {
    	System.out.print("����װ��");
    }

    public void install(NavigatorBrand navigator) {
        this.navigator=navigator;
    }
    public void open() {
    	navigator.work();
    }
}