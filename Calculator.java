package Util;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculate();
    }

    public static double calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();

        System.out.println("operationi daxil edin: + 1, - 2, * 3, / 4");
        int operation = sc.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                result = -1;
                System.out.println("Operation duzgun secilmeyib");
        }
        class MathUtil {
            public static double topla (double a, double b){
                return a+b;
            }
            public static double cix (double a, double b){
                return a-b;
            }
            public static double vur(double a, double b){
                return a*b;
            }
            public static double bol(double a, double b){
                return a/b;
            }
        }
        return result;
            }
        }

