package module4;

public class Main {

    //Задание 1

    public static void count(int x){
        for(int i = 1; i <= x; i++)
            System.out.println(i);
    }

    //Задание 2

    public static String drawRectangle(int width, int height){
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

    //Задание 3

    public static String drawRectangle(int width){
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

    //Задание 4

    public static int getMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    public static int getMax(float a, float b){
        if(a > b)
            return (int) a;
        else
            return (int) b;
    }

    //Задание 5

    public static String recursionCount(int x){
        if (x <= 1) {
            return "1";
        }
        return recursionCount(x - 1) + "\n" + x;
    }

    //Задание 6 (не до конца решено)

    public static String recursionDrawRectangle(int width, int height){
        if(width <= 1){
            return "+";
        }if(height <= 1) {
            return "+";
        }
        return recursionDrawRectangle(width, height - 1)  + "+" + "\n" + "+";
    }

    public static void main(String[] args) {
        count(5);
        System.out.println(drawRectangle(6, 8));
        System.out.println(drawRectangle(4));
        System.out.println(getMax(100, 5));
        System.out.println(getMax(4.5F, 7.8F));
        System.out.println(recursionCount(5));
        System.out.println(recursionDrawRectangle(5, 4));
    }
}
