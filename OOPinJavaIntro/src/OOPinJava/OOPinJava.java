/* Mosammad Kabir
        CUS 1115
        Professor DeBello
        Feb 28, 2021
        */


        package OOPinJava;

import java.util.Scanner;

public class OOPinJava {
    public static void main(String[] args)
    {
        String s1=new String("OOP in Java");

        String word="goodbye";
        System.out.println("The length of "+word+" is "+word.length());

        String sentence="This month is February";
        System.out.println("The length of '"+sentence+"' is "+sentence.length());

        String wordUpper=word.toUpperCase();
        System.out.println();//gives an extra line in console
        System.out.println(word+" converted to upper case is "+wordUpper);

        String sentenceLower= sentence.toLowerCase();// all lower case
        System.out.println("'"+sentence+"' converted to lower case is "+sentenceLower);

        String month="February";
        System.out.println("The length of "+month+" is "+month.length());



    }
}

/*
 * The length of goodbye is 7
The length of 'This month is February' is 22

goodbye converted to upper case is GOODBYE
'This month is February' converted to lower case is this month is february
The length of February is 8
*/