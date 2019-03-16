package exp4;
//使用冒泡排序（数组）
public class Sort {
	public static void main(String[] args) {
		int[] a= {2,4,6,8,9,51,0,12,23,56,89};
		Sort sort = new Sort();
		sort.sortpaixu(a);
	}
	public void sortpaixu(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++) 
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		showsort(a);
	}
	public void showsort(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		} 
	}
}
