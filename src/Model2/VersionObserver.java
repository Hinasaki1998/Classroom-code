package Model2;
public class VersionObserver implements Observer {
    public VersionObserver() {}
	public void update() {
        System.out.println("软件已更新");
	}
}