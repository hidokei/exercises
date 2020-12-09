
import java.util.Arrays;

public class Exercise3 {

    public void createVariable(){
        int[] numbers = {1,3,5,7,9};
        int temp;
        int avg = 0;
        int result;
         temp  = numbers[0];
        numbers[0] = numbers[4];
        numbers[4] = temp;
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            avg += number;

        }
        avg/= numbers.length;

        result = numbers[0] + avg;
        System.out.println(result);
        }


    }

