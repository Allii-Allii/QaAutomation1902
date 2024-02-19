package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 25};

        int sum = 0;

       /* for (int i = 0; i < array.length; i++) {
            sum += array[i];*/

        for (int num : array) {
            sum += num;
        }
        int avarage = sum / array.length;
        System.out.println(avarage);
    }
}
