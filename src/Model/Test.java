package Model;
public class Test {
	public static void main(String []args) {
		NavigatorBrand beidou = new Beidou();
		NavigatorBrand free = new Freelander();
		//����װ��������
		CarBrand bmw = new BMW();
		bmw.install(beidou);
		bmw.open();
		//���۰�װ�������ߵ���
		CarBrand benz = new Benz();
		benz.install(free);
		benz.open();
	}
}
