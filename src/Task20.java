public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=0;i< array.length;i++)
            array[i]=(int) (Math.random()*50);
        System.out.println("Максимальный элемент в массиве "+array[IndexMAxOfArray(array)]+" стоит под "+IndexMAxOfArray(array)+" номером");
    }

    public static int IndexMAxOfArray(int[] a){
        int maxIndex=0, max=a[maxIndex];
        for (int i=0;i<a.length;i++)
            if (a[i]>max){
                max=a[i];
                maxIndex=i;
            }
        return maxIndex;
    }
}
