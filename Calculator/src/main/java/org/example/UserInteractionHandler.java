package org.example;

import java.util.Scanner;

public class UserInteractionHandler{

    private Calculator calc;
    private int operation;
    private int firstParam;
    private int secondParam;
    private Scanner in = new Scanner(System.in);

    public UserInteractionHandler(Calculator calculator){
        calc = calculator;
        operation = 0;
        firstParam = 0;
        secondParam = 0;
    }

    public void run(){
        welcome();
        askParams();
        displayResult();
    }

    private void welcome(){
        System.out.print("Welcome to the calculator app, " +
                "which operation do you want to perform? \n"+
                "1. Addition \n" +
                "2. Multiplication \n"+
                "3. Division \n"+
                "Your Choice: ");
        operation = in.nextInt();
    }

    private void askParams(){
        System.out.print("Please enter your first parameter (Only integer)\n" +
                "First parameter: ");
        firstParam = in.nextInt();
        System.out.print("Please enter your second parameter (Only integer) \n"+
                  "Second parameter: ");
        secondParam = in.nextInt();
    }

    private void displayResult(){
        System.out.print("Your result is: ");
        switch (operation){
            case 1:
                System.out.println(calc.add(firstParam,secondParam));
                break;

            case 2:
                System.out.println(calc.multiply(firstParam,secondParam));
                break;

            case 3:
                System.out.println(calc.divide(firstParam,secondParam));
                break;

            default:
                System.out.print("Something went wrong, please retry and " +
                        "add insert only integers. "+
                        "If the problem persits, please contact Application support.");
                break;
        }


    }










}
