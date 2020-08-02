/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 43.	Vẽ hình chữ nhật đặc kích thước n x m
	Ví dụ n = 4, m = 5
		* * * * *
		* * * * *		
		* * * * *
		* * * * *

 */
public class bai43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        System.out.print("Enter m");
        int m = sc.nextInt();
        int i = 1;
        while (i <= n){
            for (int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
    
}
