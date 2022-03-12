package Task21;

public class Main {
    public static void main(String[] args) {
        int[] array = new  int[10];
        for (int i=0;i< array.length;i++)
            array[i]=(int)(Math.random()*50);
        printArray(array);
        final int result = sum(array);
        if(result!=-1)
            System.out.println("Сумма элементов между максимальным и минимальным элементом — "+result);

    }

    public static void printArray(int[] array){
        System.out.print("Искомый массив: ");
        for (int i=0;i< array.length;i++)
            System.out.print(array[i]+" ");

    }
    public static int sum(int[] array){
        int sum=0;
        if (array == null || array.length==0){
            System.out.println("Массив пустой!");
            return -1;
        }
        FunctionOfArray functionOfArray = new FunctionOfArray();
        int index1 = functionOfArray.IndexOfMax(array);
        int index2 = functionOfArray.IndexOfMin(array);
        if (Math.abs(index2-index1) < 2){
            System.out.println("Минимальный элемент стоит рядом с максимальным");
            return -1;
        }
        if (index2>index1){
            System.out.println("Максимальный элемент стоит перед минимальным");
            return -1;
        }
        for (int i=index2+1;i<index1;i++)
            sum+=array[i];
        return sum;
    }
}
