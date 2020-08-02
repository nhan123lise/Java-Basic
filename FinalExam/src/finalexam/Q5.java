/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int charCount = 0;
        for ( int i = 0; i < str.length(); i++){
            if(!Character.isWhitespace(str.charAt(i))){
                charCount++;
            }
        }
        System.out.print("Sum of character: " + charCount);
        System.out.println();
        inverseString(str);
    }
    static void inverseString(String str){
        String inverse = "";
        for (int i = str.length()-1 ; i >= 0; i--){
            inverse+=str.charAt(i);
        }
        System.out.print("Reserve String is: "+ inverse);
    }
}
