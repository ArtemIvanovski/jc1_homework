public class Task23 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int k=0;
        for (int i=0;i<5;i++){
            k=i;
            for (int j=0;j<5;j++)
                array[i][j+k]=1;
        }
    }
}
