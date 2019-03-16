package Test3;

public class OptBST {
    /*
     * ����P����ʾ1~n���ڵ�Ĳ��Ҹ��ʡ�����P[0] = 0��������
     * �������ܣ�����������BST�в��ҵ�ƽ���Ƚϴ�������C[][]���Լ�����BST�������ĸ���R
     */
    public void getBestTree(double[] P) {
        int lenP = P.length;
        double[][] C = new double[lenP+1][lenP];   //��������BST�ĳɹ����ҵ�ƽ���Ƚϴ���
        int[][] R = new int[lenP+1][lenP];   //��������BST�������ĸ���R
        for(int i = 1;i < lenP;i++) {
            C[i][i] = P[i];
            R[i][i] = i;
        }
        
        for(int d = 1;d < lenP;d++) {
            for(int i = 1;i < lenP-d;i++) {
                int j = i + d;
                double minval = Double.MAX_VALUE;     //��double���͵����ֵ����ʾminval���������
                int kmin = 0;
                for(int k = i;k <= j;k++) {
                    if(C[i][k-1] + C[k+1][j] < minval) {
                        minval = C[i][k-1] + C[k+1][j];
                        kmin = k;
                    }
                }
                R[i][j] = kmin;
                double sum = P[i];
                for(int s = i+1;s <= j;s++)
                    sum += P[s];
                C[i][j] = minval + sum;
            }
        }
        
        System.out.println("������BST�в��ҵ�ƽ���Ƚϴ�������Ϊ��");
        for(int i = 1;i <C.length;i++) {
            for(int j = 0;j < C[0].length;j++)
                System.out.printf("%.4f\t",C[i][j]);
            System.out.println();
        }
        
        System.out.println("������BST�������ĸ���RΪ��");
        for(int i = 1;i < R.length;i++) {
            for(int j = 0;j < R[0].length;j++)
                System.out.print(R[i][j]+"\t");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        OptBST test = new OptBST();
        double[] P = {0,0.375,0.375,0.125,0.125};
        test.getBestTree(P);
    }
    
}