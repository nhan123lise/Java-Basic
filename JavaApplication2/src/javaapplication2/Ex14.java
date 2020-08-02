/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author mac
 */

public class Ex14 {
    public static void main(String[] args) {
        int x;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("x = ");
        x = sc.nextInt(); 
       
        if (x % 2 == 0) {
            System.out.println(x + " la so chan");
        } else {
            System.out.println(x + " la so le");
        }
        
    }
}