package com.spaghetticodejungle;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //isBlank()
        String s = "SpaghettiCodeJungle";
        System.out.println(s.isBlank());

        s = " ";
        System.out.println(s.isBlank());

        s  = "\t\t\t";
        System.out.println(s.isBlank());
        //lines()
        String s1 = "I\nLove\nSpaghettiCodeJungle";
        List list1 = s1.lines().collect(Collectors.toList());
        System.out.println(list1);

        String s2 = " Code ";
        //strip()
        System.out.print("Spaghetti");
        System.out.print(s2.strip());
        System.out.println("Jungle");

        //StripLeading()
        System.out.print("Spaghetti");
        System.out.print(s2.stripLeading());
        System.out.println("Jungle");

        //stripTrailing()
        System.out.print("Spaghetti");
        System.out.print(s2.stripTrailing());
        System.out.println("Jungle");

        //repeat()
        System.out.println(s2.repeat(3));
    }
}
