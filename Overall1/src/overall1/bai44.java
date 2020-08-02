/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 44.	Vẽ hình chữ nhật rỗng kích thước n x m
	Ví dụ h = 4, w = 5
		* * * * *
		*       *		
		*       *
		* * * * *

 */
public class bai44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter h");
        int h = sc.nextInt();
        System.out.print("Enter w");
        int w = sc.nextInt();
        for (int i = 1; i <= h; i++){
            if ( i == 1 || i == h){
                for ( int j = 1; j <= w; j++){
                    System.out.print("* ");
                }
            }else{
                for ( int k = 1; k <= w; k++){
                    if ( k == 1 || k == w ){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
