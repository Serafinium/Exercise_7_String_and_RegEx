package com.kysylytsia;

import javafx.beans.binding.StringBinding;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        App.parse( App.read() );

    }



    public static String read () {

        System.out.println("Enter the sentence: ");

        Scanner scanner = new Scanner(System.in);
        String str ="";
        str += scanner.nextLine() + " ";

        return str;

    }

    public static void parse(String str) {
        String arrays[] = str.split(" ");

        int max = arrays[0].length();
        int maxPos = 0;

        for(int i=0; i<arrays.length; i++){
            if(arrays[i].length() > max){
                max = arrays[i].length();
                maxPos = i;
            };
        }

        System.out.println("the longest word is :  \'" + arrays[maxPos]  + "\' , position: " + maxPos + ",   Number of characters: " + max);


        System.out.println("Second word is:  " + arrays[1]);

        StringBuilder stringBuilder = new StringBuilder( arrays[1] );
        StringBuilder s = stringBuilder.reverse();

        System.out.println("reverse word: " + s);

    }

}
