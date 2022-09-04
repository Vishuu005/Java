// package com.package;
import java.util.Scanner;
class Calculator

{
     static double result;
    public static void main(String[] args) 
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        // nextDouble() reads the next double from the keyb
        double first = reader.nextDouble();
        double second =   reader.nextDouble();
        System.out.println("Enter an operator (+,-,*,/) :");
        char operator = reader.next().charAt(0);
        // double result;
        // switch case for each of the operations
        
        switch(operator)
        {
            case '+' :
            result=first+second;
            break;

            case '-' :
            result=first-second;
            break;

            case '*' :
            result=first*second;
            break;

            case '/' :
            result=first/second;
            break;

            //operator doesn't match an case constant (+,-,*,/)
            

            default:
            System.out.println("Error! operator is not correct");
            // return 0;
            

        }
        //printing the result of the operations
        System.out.println("%.1f %c %.1f= %.1f", first, operator, second, result );
    }
}