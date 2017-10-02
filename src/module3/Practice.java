package module3;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Задача 1

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        String s = String.valueOf(a);
        String s1 = String.valueOf(b);

        String x = new StringBuffer(s).reverse().toString();
        String x1 = new StringBuffer(s1).reverse().toString();

        a = Integer.parseInt(x);
        b = Integer.parseInt(x1);

        System.out.println(a);
        System.out.println(b);

        //Задача 2

        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Заполните массив:");
        for(int i = 0; i < n; i++){
            System.out.print("Индекс номер " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Введите размер массива:");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Заполните массив:");
        for(int i = 0; i < n1; i++){
            System.out.print("Индекс номер " + i + ": ");
            array1[i] = sc.nextInt();
        }

        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

        //Задача 3

        int[] array2;
        if(array.length > array1.length){
            array2 = new int[array1.length];
        } else if(array.length <= array1.length){
            array2 = new int[array.length];
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array1.length; j++){
                if(array[i] == 0){
                    break;
                }if(array1[j] == 0){
                    break;
                }
                array[i] += array1[j];
            }
        }

        for(int arr : array){
            System.out.println(arr);
        }

        //Задача 4

        for (int j = 0; j < array.length; j++)
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] < array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        for(int arr : array){
            System.out.println(arr);
        }
    }
}
