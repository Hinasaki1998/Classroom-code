package exp4;
//��дһ��Java��������Ļ�����1��+2��+3��+����+10���ĺ͡���ѭ����
public class Numadd {
	public static void main(String[] args) {
		int num;
		int sum=0;
		for(int i=1;i<=10;i++) {
			num=1;
			for(int j=1;j<=i;j++)
				num=num*j;
			sum+=num;
		}
		System.out.println("1��+2��+3��+����+10��="+sum);
	}		
}
