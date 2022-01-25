package com.mycompany.app;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;  
import java.util.stream.IntStream;
public class App 
{
    /**
     * here we get 2 int from the user and then print the array
     * time complexity O(n) we go over the array 2 different times, location complexity O(n) for the array we create.
     * another method to solve it is by two for lops in order to randomly go over the array and assign different
     * index's to the number, but then its O(n^2)
     * @param args
     */
    public static void main( String[] args )
    {
        System.out.println("Welcome to our Shuffel app, please enter the max range:" );
        Scanner sc= new Scanner(System.in); 
        int a= sc.nextInt();  
        System.out.println("please enter the min range");
        int b= sc.nextInt();
        System.out.println("here is your shuffeld arry:");
        printArrayRandom(a, b);  

    }

    /**
    * Get a random integer in range
    * @param min - the min number in the range
    * @param max - the max number in the range
    * @return - a random integer number between the min number and max number inclusive.
    */
    public static int randomInRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
    * Shuffel a given arry, a basic switch in places
    * @param min - the min number in the range
    * @param max - the max number in the range
    * @param arry- the arry we shuffel
    */
    public static void shuffel(int[] array, int min, int max){
        for(int i = 0; i < array.length -1; i++){
            int index = randomInRange(min-1, max-1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    /**
    * create an arry from the given range, shuffel then print it
    * @param min - the min number in the range
    * @param max - the max number in the range
    */
    public static void printArrayRandom(int max, int min){
        int[] ArrayInRange = IntStream.rangeClosed(min, max).toArray();
        shuffel(ArrayInRange, min, max);
        for (int number: ArrayInRange) {
            System.out.println(number);
        }
    }
}
