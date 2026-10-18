import java.util.Random;
import java.util.Scanner;
public class Step1 {
    static void main() {
        int count = 0;
        int sum = 0;
        double avg = 0;
        int userInput = 0;
        int breakValue = -1;
        int min = 0;
        int max = 0;
        Scanner in = new Scanner(System.in);
        String prompt = "Pick a number between 1 and 100";

        userInput = SafeInput.getRangedInt(in, prompt, 1, 100);

        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
            System.out.print(" | ");
        }
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
        }
        avg = (double)sum / dataPoints.length;
        for (int i = 0; i < dataPoints.length; i++)
        {
          if (dataPoints[i] == userInput)
          {
              count = count + 1;
          }
        }



        System.out.println();
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + avg);
        System.out.println("The users value " + userInput + " was found " + count + " time(s)");

        userInput = SafeInput.getRangedInt(in, prompt, 1, 100);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userInput)
            {
                breakValue = i;
                break;
            }
        }
        System.out.println();
        if (breakValue > -1){
        System.out.println("The value " + userInput + " was found at index " + breakValue);}
        else {
            System.out.println("The value " + userInput + " was not found");
        }

        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
        }
        System.out.println();
        System.out.println("The minimum value is " + min + "and the maximum value is " + max);
    }
}
