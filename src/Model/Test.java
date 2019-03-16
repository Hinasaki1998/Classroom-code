package Model;
public class Test {
	public static void main(String []args) {
		NavigatorBrand beidou = new Beidou();
		NavigatorBrand free = new Freelander();
		//宝马安装北斗导航
		CarBrand bmw = new BMW();
		bmw.install(beidou);
		bmw.open();
		//奔驰安装了神行者导航
		CarBrand benz = new Benz();
		benz.install(free);
		benz.open();
	}
}
