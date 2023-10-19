import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HWProgram14 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100_000) + 11;
        System.out.println(randomNum);
        int sum = 0;
        int count =0;
        for (int i = 0; i < 6; i++) {
            int partNumber = randomNum%10;
            randomNum /= 10;
            sum += partNumber ;
            count ++;
        }
        System.out.println("Сума числа" + ": " + sum);



    }
}
