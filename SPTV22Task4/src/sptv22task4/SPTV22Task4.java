/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task4;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class SPTV22Task4 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создание массива
        int[] array = new int[100];
        
        // Заполнение массива нечетными случайными числами от 0 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 50) * 2 + 1;
        }
        
        // Вывод массива по десять чисел в одном ряду
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        
        // Сортировка массива
        Arrays.sort(array);
        
        // Подсчет среднего арифметического чисел массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum / array.length;
        
        System.out.println("\nСреднее арифметическое: " + average);
    }
}
