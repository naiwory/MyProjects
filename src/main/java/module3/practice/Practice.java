
package practice;

import java.util.Scanner;

public class Practice {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        
        System.out.println("Введите первое число:");
        int y = sc.nextInt();
        System.out.println("Введите второе число:");
        int x = sc.nextInt();
        
        System.out.println("Введите первое дробное число:");
        double z = sc.nextDouble();
        System.out.println("Введите второе дробное число:");
        double d = sc.nextDouble();
        
        //Задание 1
        
        System.out.println(z + " + " + d + " = " + (z + d));
        
        //Задание 2
        
        System.out.println("Площадь прямоугольника: " + a * b);
        
        //Задание 3
        
        int p = a + b + c;
        System.out.println("Площадь треугольника: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        
        //Задание 4
        
        System.out.println("y + x: " + (y == x));
        System.out.println("y делится без остатка на x: " + (y % x == 0));
        System.out.println("y > x: " + (y > x));
        
        //Задание 5
        
        System.out.println("a больше c и b: " + (c < a && a > b));
        System.out.println("b больше a и c: " + (c < b && b > a));
        System.out.println("c больше a и b: " + (b < c && c > a));
        
        System.out.println("a меньше c и b: " + (c > a && a < b));
        System.out.println("b меньше a и c: " + (c > b && b < a));
        System.out.println("c меньше a и b: " + (b > c && c < a));
        
        System.out.println("a промежуточное число между c и b: " + (c < a && a < b || b < a && a < c));
        System.out.println("b промежуточное число между a и c: " + (c < b && b < a || a < b && b < c));
        System.out.println("c промежуточное число между a и b: " + (b < c && c < a || a < c && c < b));
        
        //Задание 6
        
        System.out.println("a равняется хотя бы одному числу: " + (c == a || a == b));
        System.out.println("b равняется хотя бы одному числу: " + (c == b || b == a));
        System.out.println("c равняется хотя бы одному числу: " + (b == c || c == a));
        
        System.out.println("a больше хотя бы одного числа: " + (c < a || a > b));
        System.out.println("b больше хотя бы одного числа: " + (c < b || b > a));
        System.out.println("c больше хотя бы одного числа: " + (b < c || c > a));
        
        
        
}
    }
        
        

    
    
    

