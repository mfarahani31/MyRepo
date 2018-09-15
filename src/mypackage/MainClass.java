package mypackage;

import java.util.Arrays;
import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {

        int A[] = {1, 4, 45, 6, 10, 8, 15};
        int n = 16;
        printpairs(A, n);
    }

    private static void printpairs(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int anArr : arr) {
            int temp = sum - anArr;

            // checking for condition
            if (temp >= 0 && s.contains(temp)) {
                System.out.println("Pair with given sum " +
                        sum + " is (" + anArr +
                        ", " + temp + ")");
            }
            s.add(anArr);
        }
    }


}
