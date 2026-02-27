import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int primary = 0, secondary = 0;
        
        for(int i=0;i<n;i++){
            primary += matrix[i][i];
            secondary += matrix[i][n-1-i];
        }
        
        System.out.println(Math.abs(primary - secondary));
    }
}