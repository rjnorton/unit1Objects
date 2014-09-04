import java.util.Random;

public class RandomNum
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int number = generator.nextInt(6);
        System.out.println(number);
    }
}