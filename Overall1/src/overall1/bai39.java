/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 39.	Liệt kê tất cả các số chính phương nhỏ hơn n
 */
public class bai39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        for ( int i = 1; i < Math.sqrt(n); i ++){
            System.out.print(i*i +" ");
        }
            
    }
    
}
