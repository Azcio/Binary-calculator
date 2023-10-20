/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4work2;

import java.util.Scanner;

/**
 *
 * @author erikc
 */
public class Week4work2 {

    /**
     * @param args the command line arguments
     *
     * 4.11
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary digits (0000 - 1111)");
        String num = sc.nextLine().trim();

        if (num.length()
                != 4) {
            System.out.println("Invalid input");
            System.exit(0);
        }

//4 chars
        //   char eightBit = num.charAt(0);
        // char fourBit = num.charAt(1);
        //char twoBit = num.charAt(2);
        //char firstBit = num.charAt(3);
        int sum = 0;
        int addBit = 8;

        for (int i = 0; i < 4; i++) {

            switch (num.charAt(i)) {

                case '1':
                    sum = sum + addBit;
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Invalid input");
                    System.exit(0);
            }

addBit = addBit / 2;

        }

        System.out.println("The decimal value is " + sum);

        /*

        switch (eightBit) {

            case '1':
                sum = sum + 8;
                break;
            case '0':
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }

        switch (fourBit) {

            case '1':
                sum = sum + 8;
                break;
            case '0':
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);

        }

        switch (twoBit) {

            case '1':
                sum = sum + 8;
                break;
            case '0':
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }

        switch (firstBit) {

            case '1':
                sum = sum + 8;
                break;
            case '0':
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        } 
         */
    }

}
