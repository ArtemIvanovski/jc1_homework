package Task51;

import java.util.Random;

public class RandomNumber {
    public int randomNumber(int upperBound, int bottomLine){
        return new Random().nextInt(upperBound) + bottomLine;
    }
}
