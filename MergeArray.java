package FridayExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {

        int [] arr1 = {1,3,4,5};
        int [] arr2 = {2,6,7,8};

        List<Integer>arr3 = new ArrayList<>();
        for(int myArray: arr1){
            arr3.add(myArray);
        }
        for (int theArray: arr2){
            arr3.add(theArray);
        }
        System.out.println(arr3.toString());

        Collections.sort(arr3);
        System.out.println(arr3);
    }
}
