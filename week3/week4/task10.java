import java.util.*;

class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int layers = Math.min(m,n)/2;
        
        for(int layer=0; layer<layers; layer++){
            List<Integer> elements = new ArrayList<>();
            
            for(int i=layer;i<n-layer;i++)
                elements.add(matrix[layer][i]);
            
            for(int i=layer+1;i<m-layer-1;i++)
                elements.add(matrix[i][n-layer-1]);
            
            for(int i=n-layer-1;i>=layer;i--)
                elements.add(matrix[m-layer-1][i]);
            
            for(int i=m-layer-2;i>layer;i--)
                elements.add(matrix[i][layer]);
            
            int size = elements.size();
            int rotation = r % size;
            
            Collections.rotate(elements, -rotation);
            
            int index = 0;
            
            for(int i=layer;i<n-layer;i++)
                matrix[layer][i] = elements.get(index++);
            
            for(int i=layer+1;i<m-layer-1;i++)
                matrix[i][n-layer-1] = elements.get(index++);
            
            for(int i=n-layer-1;i>=layer;i--)
                matrix[m-layer-1][i] = elements.get(index++);
            
            for(int i=m-layer-2;i>layer;i--)
                matrix[i][layer] = elements.get(index++);
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}