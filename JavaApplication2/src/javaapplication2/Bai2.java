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
public class Bai2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("x = ");
        x = sc.nextInt(); 
        if (x > 0 ) {
            System.out.println(x + " la so duong");
        } else {
            System.out.println(x + " la so am");
        }
        
    }
    
}
