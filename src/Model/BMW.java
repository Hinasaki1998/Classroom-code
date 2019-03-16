package Model;
public class BMW extends CarBrand {
    public BMW() {
    	System.out.print("宝马安装了");
    }

    public void install(NavigatorBrand navigator) {
        this.navigator=navigator;
    }
    public void open() {
    	navigator.work();
    }
}