
public class Q1 {
    public static void generatePascalTriangle(int n) {
        //write your code here
        for (int i=0;i<n;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            int num =1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num =num *(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}

