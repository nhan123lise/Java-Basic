/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Write a program to enter a string. Write the following methods:
Returning the sum of characters (that are not space character) of the input string
Print out the reserve string of the input string

 */
public class bai15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = sc.nextLine();
        System.out.print("Sum of characters is "+ countChar(str));
        System.out.println();
        inverseString(str);
        
    }
    static int countChar(String str){
        int count = 0;
        for ( int i = 0; i < str.length(); i++){
            if ( !Character.isWhitespace(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    static void inverseString(String str){
        String inverse = "";
        for (int i = str.length()-1 ; i >= 0; i--){
            inverse+=str.charAt(i);
        }
        System.out.print("Inverse String is "+ inverse);
    }
}
