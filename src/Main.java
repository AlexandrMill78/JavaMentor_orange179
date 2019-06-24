import java.util.Scanner;

public class Main {
    byte by = 127;
    short sh = 1234;

    int i = 98374593;
    long ii = 2452355554555559233L;

    float a = 3.43434f;
    double aa = 3.42342444444444;

    char ch = 'c';
    boolean bool = true;

    String name;


    public static void main(String[] args) {
        String name = "Alex";
        prrintHelloWorld(name);
        printDivisionResult(2.324234234, 1.232333333);

        System.out.println("getMaxInt() = " + getMaxInt());

        //System.out.println("rainfal(l) = " + determineRainfall(1.0, 24.0));

        System.out.println("What's your name?");
        System.out.println("Morning! " + myScanner());






        // далее из приведенного в Git тоже вопросов пока не вызывает, пока тратим время
    }

    //------------------------------------------------------------
    static void prrintHelloWorld(String name){
        System.out.println("Hello, " + name);
    }

    static void printDivisionResult(double x, double y){
        System.out.println("x=" + x + " / y= " + y + " is: " + x/y);
    }

    static int getMaxInt(){
        int a = 343434, b = 34;
        int maxResult;
        if (a > b) {
            maxResult = a;
        } else {
            maxResult = b;
        }
        return maxResult;
    }

    static int sum(int x, int y){               // no question..(return 0)
        return 0;
    }

    static int incrementIfPositive(){
        return 0;
    }

    static void printJavaWord(int count){
    }

    static long determineRainfall(double area, double rainfallAmount){
        double s;
        s = (long) (rainfallAmount*1000000*rainfallAmount/2);

        return (long) s;
    }

    static String myScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
