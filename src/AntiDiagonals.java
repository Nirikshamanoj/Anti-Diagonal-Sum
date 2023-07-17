import java.util.Scanner;
public class AntiDiagonals {
    public static void findAntiDiagonals(int[][] array,int n){
        for (int i = 0 ;i < n; i++){
            int y = i;
            int x = 0 ;
            while (x < n && y >= 0){
                System.out.print(array[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }
        for (int i = 0 ; i < n ;i++){
            int y = n- 1;
            int x = i;
            while (x < n && y >= 0){
                System.out.print(array[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] A=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=scanner.nextInt();
            }
        }
        findAntiDiagonals(A,n);
    }
}
