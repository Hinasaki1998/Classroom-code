package exp1;
public class zhuan {
	public static void main(String[] args) {
		for(int a=10000;a<99999;a++) {
			int x=a/10000%10;
			int y=a/1000%10;
			int z=a/100%10;
			int j=a/10%10;
			int k=a/1%10;
			if((x+y+z+j+k)%9==0||a%9==0) {
				System.out.println(a);
			}
		}
	}
}
