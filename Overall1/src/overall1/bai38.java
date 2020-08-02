/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 38.	Liệt kê tất cả các số nguyên tố nhỏ hơn n
 */
public class bai38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        for(int j = 1; j<n ; j++){
            int s = 0;
            for ( int i = 1; i <= Math.sqrt(j); i++)
                if ( j % i == 0 ){
                    s++;
                }
            if ( s == 2 ){
                System.out.print(j+" ");
            }
        }
        
        
    }
        
    
}
