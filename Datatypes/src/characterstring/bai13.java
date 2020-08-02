/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Write a program to enter a string that has numerals. Write the following
methods:
● Checking whether the input string is a valid string or not?
● Supposing the input string is a 1 a 2 … a n , compute square sum of numerals:
a 1 2 + a 2 2 + … + a n 2 .
 */
public class bai13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = sc.nextLine();
        if ( isNumeric(str)){
            System.out.print("valid string");
            System.out.println();
            System.out.print("square sum is " + computeSquare(str));
        }else{
            System.out.print("invalid string");
            System.out.println();
            System.out.print("N/A");
        }    
    }
    static boolean isNumeric(String str){
        String []strArr = str.split(" ");
        for ( int i = 0; i < strArr.length; i++){
            try{
                Float num = Float.parseFloat(strArr[i]);
            } catch (Exception e){
                return false;
            }
        }
        return true;
    }
    static float computeSquare(String str){
        float n = 0;
        String []strArr = str.split(" ");
        for ( int i = 0; i < strArr.length; i++){
            Float num = Float.parseFloat(strArr[i]);
            n += num*num;
        }
        return n;
    }
    
    
}
