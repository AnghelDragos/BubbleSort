// Randomly generated Array
// Bubble sort from low to high

import java.util.Random;

public class Main {

    public static void main (String[] args){
        Random rand = new Random();
        int[] numbersToBeSorted = new int[10]; // Array with 10 elements (0-9)
        System.out.println("The unsorted Array: ");
        for (int i=0; i<numbersToBeSorted.length; i++) {
            int num = rand.nextInt(100); // generates random number between 0 and n-1
            numbersToBeSorted[i] = num; // assigns a random value into the Array
            System.out.println("At position " + i + " is the value: " + numbersToBeSorted[i]);
        }

        System.out.println("\n"); // new line for spacing
        System.out.println("The Array sorted from low to high: ");
        int min = 0;

        for (int i=0; i<numbersToBeSorted.length; i++){
            for (int j=i+1; j<numbersToBeSorted.length; j++){ //j is one value higher than i
                if (numbersToBeSorted[i]>numbersToBeSorted[j]){
                    min=numbersToBeSorted[j];
                    numbersToBeSorted[j] = numbersToBeSorted[i];
                    numbersToBeSorted[i] = min;
                }
            }
        }

        // alternatively: Arrays.sort(numbersToBeSorted); (java.util.Arrays needs to be imported for this to work )

        for (int k=0; k<numbersToBeSorted.length; k++){
            System.out.println("At position " + k + " is the value: " + numbersToBeSorted[k]);
        }


    }



}