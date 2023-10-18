import java.util.Arrays;
import java.util.Random;

public class HWProgram14 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayNum1 = new int[]{1,1};
        for (int i = 0; i < arrayNum1.length; i++) {
            arrayNum1[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrayNum1) + " 1 число");

        int [] arrayNum2 = new int[]{1,0,0,0,1,1};
        for (int i = 0; i < arrayNum2.length; i++) {
           arrayNum2[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrayNum2) + " 2 число");
        int [] arrayNum3 = new int[]{1,2,3};
        for (int i = 0; i < arrayNum3.length; i++) {
            arrayNum3[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrayNum3) + " 3 число");

        int sum1 = 0;
        for (int i = 0; i < arrayNum1.length; i++) {
            sum1 += arrayNum1[i];
        }
        System.out.println("сума 1 числа" + ": " + sum1);

        int sum2 = 0;
        for (int i = 0; i < arrayNum2.length; i++) {
            sum2 += arrayNum2[i];
        }
        System.out.println("сума 2 числа" + ": " + sum2);

        int sum3 = 0;
        for (int i = 0; i < arrayNum3.length; i++) {
           sum3 += arrayNum3[i];
        }
        System.out.println("сума 3 числа" + ": " + sum3);

    }
}
