package binarysort;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {33, 16, 45, 92, 7, 22, 63, 87};
        Arrays.sort(array);
        System.out.println(find(45, array));
    }

    public static int find(int searchKey, int[] array){
        int lowerBound = 0;
        int upperBound = array.length - 1;
        int current;

        while(true){
            current = (lowerBound + upperBound)/2;
            if(array[current] == searchKey){
                return current;
            }
            else if(lowerBound > upperBound){
                return  -1;
            }
            else {
                if(array[current] < searchKey){
                    lowerBound = current + 1;
                } else {
                    upperBound = current - 1;
                }
            }
        }
    }
}
