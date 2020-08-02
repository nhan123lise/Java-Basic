/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author mac
 */
// viet chuong trinh tinh bieu thuc 4sinx + cos(1/2 + 2x)

import java.util.Scanner;

public class JavaApplication2 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhap vao so x");
        long x = input.nextLong();
        double b = Math.toRadians(x);
        float S ;
        S = (float) ( Math.sin(b)*4 + Math.cos(1.0f/2 + b*2)) ;
         System.out.println("Dap an la" + S);
        
                
                
                
        }
    
}
