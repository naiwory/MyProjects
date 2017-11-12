
package module3.homework;

import java.util.Scanner;


public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Размер массива
        
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        //Заполнение массива
        
        System.out.println("Заполните массив:");
        for(int i = 0; i < n; i++){
            System.out.print("Индекс номер " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        //Минимальное значение массива
        
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);
        
        //Максимальное значение массива
        
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        
        //Количество повторений числа 5 в массиве
        
        int x = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 5) x++;   
            }
        System.out.println("Число 5 повторяется в массиве " + x + " раз");
        
        //Сортировка массива
        
        for(int j = 0; j < array.length; j++){
            boolean isDone = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    isDone = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
           if(isDone) break; 
        }
        for(int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }
        
    }
}

    

