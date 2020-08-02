/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{
        System.out.print("enter n");
        int n = sc.nextInt();
        for ( int i = n; i > 0; i--){
            for ( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }
    
}
