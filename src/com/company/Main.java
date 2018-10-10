package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your numerber1");
	int num1 = sc.nextInt();
	System.out.println("Enter your number2");
	int num2 = sc.nextInt();

	int sum = givenbytheusers(num1, num2);
	System.out.println(sum);
    }
    public static int givenbytheusers(int num1, int num2){
       int total = num1 + num2;
    return total;
    }


}
