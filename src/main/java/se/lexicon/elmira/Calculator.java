package se.lexicon.elmira;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String again;
        boolean yesOrNo = true;
        calculate();

        Scanner yesOrNo1 = new Scanner(System.in);
        System.out.println(" Do you want to continue ? Enter y/n: ");
        again = yesOrNo1.nextLine();

        do {
            if (again.equals("yes")) {
                yesOrNo = true;
                calculate();
                System.out.println(" Do you want to continue ? Enter y/n: ");
                again = yesOrNo1.nextLine();

            } else if (again.equals("no")) {
                yesOrNo = false;
                System.out.println("welcome back.");
            }
        } while (yesOrNo);


    }

    public static void calculate() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers and press Enter between them:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        Scanner operator = new Scanner(System.in);

        System.out.println("Enter operation symbol:");
        String operation = operator.nextLine();

        switch (operation) {
            case "+":
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case "-":
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case "*":
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case "/":
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
        }
    }


}







