package module4;

import java.util.Scanner;

public class Practice {
    public static int getMaxIndex(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значения массива через пробел: ");

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            array[i] = Integer.parseInt(numbers[i]);
        }

        int max = array[0];
        int maxI = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxI = i;
            }
        }
        return maxI;
    }

    public static int getMax(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значения массива через пробел: ");

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            array[i] = Integer.parseInt(numbers[i]);
        }

        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int pow(int x, int n){
        if(n <= 1){
            return x;
        }
        return x * pow(x, n - 1);
    }

    public static String getRaised(int a, int b) {
            if(a < b) {
                if (a == b) {
                    return Integer.toString(a);
                }
                return a + " " + getRaised(a + 1, b);
            }else{
                if(a == b){
                    return Integer.toString(a);
                }
                return a + " " + getRaised(a - 1, b);
            }
        }

    public static void main(String[] args) {
        System.out.println(getMaxIndex());
        System.out.println(getMax());
        System.out.println(pow(8, 4));
        System.out.println(Math.pow(8, 4));
        System.out.println(getRaised(40, 20));
    }
}
