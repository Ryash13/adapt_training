import java.util.*;
import java.lang.*;


interface arithmatic {
    int operation (int a , int b);
}


public class Assignment4Q1 {
    public double addition(int num1,int num2){
        return (num1 + num2);
    }
    public double subtraction(int num1,int num2){
        return (num1 - num2);
    }
    public double multiplication(int num1,int num2){
        return (num1 * num2);
    }
    public double division(int num1,int num2){
        double res = Double.valueOf(num1) / Double.valueOf(num2);
        return res;
    }
    public static void main(String[] args) {
        arithmatic addition = (int a , int b) -> (a + b);
        System.out.println(addition.operation(13,5));
        arithmatic substraction = (int a , int b) -> (a - b);
        System.out.println(substraction.operation(13,5));
        arithmatic multiplication = (int a , int b) -> (a * b);
        System.out.println(multiplication.operation(13,5));
        arithmatic division = (int a , int b) -> (a / b);
        System.out.println(division.operation(13,5));
    }
}
