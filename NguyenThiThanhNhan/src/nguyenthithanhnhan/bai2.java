/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenthithanhnhan;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai2 {
    public static void main(String[] args){
        System.out.print("Enter n ");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        double s = 0;
        while ( n <= 0 || n > 10){
            System.out.print("Please, re-enter n ");
            n = sc.nextInt();
        }
        for ( int i = 1; i <= n; i++){
            s += Math.pow(-1,(i+1))/(2*i-1);
        }
        System.out.print("Result is "+s);
    }
    
}
