package module4;

import java.util.Scanner;

public class Task7 {

    //Задача 1

    public static void count(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, до которого нужно считать:");
        int x = sc.nextInt();

        for(int i = 0; i <= x; i++)
            System.out.println(i);
    }

    //Задача 2

    public static String drawRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника:");
        int width = sc.nextInt();
        System.out.println("Введите высоту прямоугольника:");
        int height = sc.nextInt();

        String result = "";
        for(int i = 0; i < height; i++){
            String line = "";
            for(int j = 0; j < width; j++){
                line += "+";
            }
            result += line + "\n";
        }
        return result;
    }

    //Задача 3

    public static String drawSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину стороны квадрата:");
        int width = sc.nextInt();

        String result = "";
        for(int i = 0; i < width; i++){
            String line = "";
            for(int j = 0; j < width; j++){
                line += "+";
            }
            result += line + "\n";
        }
        return result;
    }

    //Задача 4

    public static int getMaxInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();

        if (a > b)
            return a;
        else
            return b;
    }

    //Задача 5

    public static String recursionCount(int x){
        if (x <= 1) {
            return "1";
        }
        return recursionCount(x - 1) + "\n" + x;
    }

    //Задача 6 (не до конца решена)


    public static String recursionDrawRectangle(int width, int height){
        if(width <= 1){
            return "+";
        }if(height <= 1) {
            return "+";
        }
        return recursionDrawRectangle(width, height - 1) + "+" + "\n" + "+";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Какую задачу вы хотите решить? Введите число от 1 до 6. Если вы больше не хотите решать задачи, введите 0:");
            int a = sc.nextInt();

            if(a == 0){
                break;
            }else if (a == 1) {
                count();
            } else if (a == 2) {
                System.out.println(drawRectangle());
            } else if (a == 3) {
                System.out.println(drawSquare());
            } else if (a == 4) {
                System.out.println(getMaxInt());
            } else if (a == 5) {
                System.out.println("Введите число, до которого нужно считать:");
                int x = sc.nextInt();

                System.out.println(recursionCount(x));
            } else if (a == 6) {
                System.out.println("Введите ширину прямоугольника:");
                int width = sc.nextInt();
                System.out.println("Введите высоту прямоугольника:");
                int height = sc.nextInt();

                System.out.println(recursionDrawRectangle(width, height));
            } else {
                System.out.println("Вы ввели неверное значение. Перезапустите программу и попробуйте снова.");
            }

        }
    }
}
