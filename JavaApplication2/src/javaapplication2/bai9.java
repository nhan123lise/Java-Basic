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
public class bai9 {
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x < y && x < z)
        {
            System.out.println("Smallest number is:"+x);
        }
        else if(y < z)
        {
            System.out.println("Smallest number is:"+y);
        }
        else
        {
            System.out.println("Smallest number is:"+z);
        }
 
    }
    
}
