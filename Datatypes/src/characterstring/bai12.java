/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Write a program to read an integer number (n&gt;0). Write the following
methods:
● Print out correlative binary string of n
● Print out the read of n by English
 */
public class bai12 {
    public static void main(String args[]){
        System.out.print("Enter your string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Correlative binary string " + binaryInteger(str));
        System.out.println();
        for ( int i = 0; i < str.length(); i++){
            readInteger(str.charAt(i));
        }
    }
    static String binaryInteger(String str){
        int b = Integer.parseInt(str);
        String c = Integer.toBinaryString(b);
        return c;
    }
    static void readInteger(char n){
        switch(n){
            case '0' : System.out.print("zero "); 
            break;
            case '1' : System.out.print("one "); 
            break;
            case '2' : System.out.print("two ");
            break;
            case '3' : System.out.print("three ");
            break;
            case '4' : System.out.print("four ");
            break;
            case '5' : System.out.print("five ");
            break;
            case '6' : System.out.print("six ");
            break;
            case '7' : System.out.print("seven ");
            break;
            case '8' : System.out.print("eight ");
            break;
            case '9' : System.out.print("nine ");
            break;
            
        }
                
    }
}
