package Task21;

public class FunctionOfArray {
    public int IndexOfMax(int[] array){
        if(array == null || array.length == 0)
            return 0;
        int index=0, max=array[index];
        for (int i = 0;i < array.length;i++)
            if(array[i]>=max){
                max=array[i];
                index=i;
            }
        return index;
    }
    public int IndexOfMin(int[] array){
        if(array == null || array.length == 0)
            return 0;
        int index=0, min=array[index];
        for (int i = 0;i < array.length;i++)
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        return index;
    }
}
