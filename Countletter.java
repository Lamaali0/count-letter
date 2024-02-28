/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compundinterest.java;

import java.util.Scanner;

public class Countletter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a line of string: ");
         String a =in.nextLine();
         System.out.print("enter a single letter: ");
         char letter = in.next().charAt(0);
         int x = a.length();
         int numLetters = 0 , count = 0;
         while(count < x )
         {
         
             if(a.charAt(count++) != letter)
             {
                 continue;
                 
             }
             numLetters++;  
         }
         System.out.println(" found " + numLetters + " " +letter+ "'s in the string.");
         
        
        
    }
} 
