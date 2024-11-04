import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("sum of array of the data points are: " + sum);
        System.out.println("average of array of the data points are: " + average);

        int userValue = SafeInput.getRangedInt("enter an integer between 1 and 100: ", 1, 100);

        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) {
                count++;
            }
        }
        System.out.println("value " + userValue + " was found " + count + " amount of times in the array.");

        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position + ".");
        } else {
            System.out.println("the value " + userValue + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int val : dataPoints) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                min = val;
            }
        }
        System.out.println("the min value in the array is: " + min);
        System.out.println("the max value in the array is: " + max);

        System.out.println("avg of data points is: " + getAverage(dataPoints));

    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }







}