public class Task23 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i=0;i<array.length/2+1;i++){
            for (int j=i;j< array.length-i;j++){
                array[i][j]=0;
                array[array.length-1-i][j]=0;
                array[i][j]=1;
                array[array.length-1-i][j]=1;
            }
        }


        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
}
