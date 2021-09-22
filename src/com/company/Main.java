package com.company;

public class Main {

    public static void main(String[] args) {
	// Think Java - Exercise 7.1
    }
    
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;

        /* BANANA:
         * This method takes an int array and two int variables that are used inside a while loop and returns a value called "kiwi".
         * The integer variable "kiwi" is used as a multiplier inside the while loop and then used as a return value when the loop are terminated.
         * The integer variable "i" are used as the index for the array "a".
         */
    }


    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
       /* GRAPEFRUIT:
        * This method are using a "for" loop to search for a specific element in the array "a" and returns the index value "i".
        * The integer array "a" are being looped through a "for" loop (called Traversal).
        * The integer "grape" are the target the program searches for inside the array, and it will return the index where the value appears.
        * But only if it exists inside the array.
        */


    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

       /* PINEAPPLE:
        * This method are using an "enhanced for loop" also known as a "for each" loop, and it's searching for the value "apple" and
        * every time it finds apple in the array it will increment "pear" value by one. When the loop terminates it will return pear's value.
        */


}
