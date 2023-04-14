package FridayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber=0;
        int secondLargest = 0;
        int smallestNumber=0;

        System.out.print("How many numbers would you like to input: ");
        int numOfNumbers = input.nextInt();
        int[] array = new int[numOfNumbers];
        int i;
        System.out.println("Enter " + array.length + " numbers: ");
        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i]>largestNumber){
                secondLargest = largestNumber;
                largestNumber = array[i];
            }else if (array[i] > secondLargest && array[i] != largestNumber){
                secondLargest = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Second Largest NUmber is: %d", secondLargest);


    }
}
