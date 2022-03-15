package Task22;

public class FunctionOfArray {
    public void reverseArray(int[] array){
        int swap;
        for(int i=0;i<array.length/2;i++){
            swap=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=swap;
        }
    }
}