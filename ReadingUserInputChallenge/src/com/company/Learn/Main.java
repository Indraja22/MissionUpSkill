package com.company.Learn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true){
            int order = count + 1;
            System.out.println("Enter number #"+ order + ": ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count++;
                sum = sum + number;
                if(count == 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();//handle end of line (Enter key)

        }
        System.out.println("Sum = " +sum);
        scanner.close();

    }
}
