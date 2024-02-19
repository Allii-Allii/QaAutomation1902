package org.example;

public class Main {
    public static void main(String[] args) {

        // Създаваме на масив с 20 ел. от целоислен тип
        int[] array = new int[20];

        // инициализация на елементите на масива
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }
        //изваждане на елементите на масива в конзолата
        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент " + i + ": " + array[i]);
        }
    }
}