package org.randall.teagan;

import java.util.Scanner;

public class GreetingApp{

    public static void main(String[] args){
        greet();
    }

    protected static void greet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your student number: ");
        String name = scanner.next();
        System.out.println("Welcome " + name + ", to the world of Java programming!");
    }
}
