public class Task19 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i=0;i< array.length;i++)
            array[i]=(int)(Math.random()*100);
        int i=0;
        System.out.print("Элементы стоящие на четныых позициях: ");
        while (i<10)
        {
            System.out.print(array[i]+" ");
            i+=2;
        }
    }
}
