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
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a;
        a = sc.nextFloat();
        System.out.print("b = ");
        float b;
        
        b = sc.nextFloat();
        if ( a == 0 )
            if ( b == 0 ) { System.out.println("x co vo so nghiem");}
            else { System.out.println("x vo nghiem");}
        else { System.out.println("x bang" + (-b/a));}
       
        
    }
    
}
