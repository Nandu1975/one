package Increment_decrement_op;

import java.util.Scanner;

public class ifelse_st2 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        System.out.println(age);

        System.out.println("enetr the value");
        double int_double=scanner.nextDouble();
        System.out.println(int_double);

        System.out.println("enetr float");
        float int_float=scanner.nextFloat();
        System.out.println(int_float);

        if(age>=18)
        {
            System.out.println("you can vote");
        }
        else
        {
            System.out.println("Not allowed");
        }
    }
}
