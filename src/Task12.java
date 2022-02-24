public class Task12 {
    public static void main(String[] args) {
        long fact=1;
        int i=0;
        while (i++<10){
            fact*=i;
        }
        System.out.println("10! = "+fact);
    }
}
