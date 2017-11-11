package com.kysylytsia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        //Tas1
        //App.deleteSpaces();


        //Task2
        App.myFormating( App.read() );

    }


    // Task 1
    public static void deleteSpaces(){
        String str = "I    am      learning     Java   Core";

        System.out.println( str );

        System.out.println(str.replaceAll("[\\s]+", " "));
    }


    //Task 2
    public static void myFormating(float x){

        System.out.printf("$"+"%.2f", x);

    }


    public static float read(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float x;

        try {
            x = Float.parseFloat( br.readLine() );
        } catch (IOException e) {
            System.out.print("Repeat the input");
            return App.read();
        }

        return x;
    }



}
