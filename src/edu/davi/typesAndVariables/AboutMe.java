package edu.davi.typesAndVariables;

import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Type your name");
        String name = scanner.next();

        System.out.println("Type your surname");
        String surname = scanner.next();

        System.out.println("Type your age");
        int age = scanner.nextInt();

        System.out.println("Type your height");
        double height = scanner.nextDouble();


        System.out.println("Hello, my name is " + name + surname);
        System.out.println("Now I am " + age + " years old");
        System.out.println("My height is about " + height + " centimeters.");
    }
}
