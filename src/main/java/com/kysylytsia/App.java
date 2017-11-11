package com.kysylytsia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //App.checkSubstring(); // Task1
        //App.read();           // Task2
        //App.auditName();      // Task3

    }


    //*******************************************************************************//

    /**
     * Task 1
     */
    public static void checkSubstring(){
        String s1 = "IT";
        String s2 = "IT ACADEMY";
        System.out.println( s2.contains(s1) );
    }


    //*******************************************************************************//

    /**
     * Task 2
     */
    public static void read (){

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Input your Surname");
        stringBuilder.append( scanner.nextLine() );

        System.out.println("Input your Name");
        stringBuilder.append(" " + scanner.nextLine() );

        System.out.println("Input your Patronymic");
        stringBuilder.append(" " + scanner.nextLine() );

        scanner.close();
        String str = stringBuilder.toString(); //str my main String

        System.out.println();
        System.out.println("My String:  " + str); //starting line

        String str1 = str.substring( 0, str.indexOf(" ") ); //substring Surname

        String[] temp = str.split(" ");

        str1 += " ";

        for(String s: temp){
            str1 += s.substring(0, 1); //add the initials
        }

        // Surname + initials
        System.out.println();
        System.out.println("Surname + initials:  " + str1);

        // Name
        System.out.println();
        System.out.println("Only name:  " + temp[1]);

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(temp[1]+" ");
        stringBuilder1.append(temp[2]+" ");
        stringBuilder1.append(temp[0]);

        //name + patronymic + Surname
        System.out.println();
        System.out.println("Name + Patronymic + Surname:  " + stringBuilder1);
    }


    //*******************************************************************************//

    /**
     * Task 3
     */
    public static void auditName (){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            System.out.println("Input name: ");
            String name = scanner.nextLine();

            Pattern pattern = Pattern.compile("([()A-Za-z_]){3,15}");
            Matcher matcher = pattern.matcher(name);
            boolean isFlag = matcher.matches();
            System.out.println("Name: " + name + " is " + isFlag);
        }
    }




}
