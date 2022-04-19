package Task43;

import Task44.MyException;

public class Exception {

    public double divide(Integer a, Integer b){
        return a/b;
    }

    public void makeException(String message) throws MyException {
        try {
            createMyException(message);
        } catch (MyException e) {
            System.out.println("Thi is higher level exception");
            e.printStackTrace();
        }
    }



    public void createMyException(String message) throws MyException {
        throw new MyException(message);
    }
}
