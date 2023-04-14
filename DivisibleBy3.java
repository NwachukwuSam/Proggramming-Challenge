package FridayExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer>divisibles = new ArrayList<>();
        int number =30;

        int sum=0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 ==0){
                sum+=i;
                divisibles.add(i);
            }
        }
        System.out.println(divisibles);
        System.out.println(sum);

    }
}
