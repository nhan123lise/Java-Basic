/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
40.	Viết chương trình nhập số n và in ra  màn hình tam giác sau
	Ví dụ n = 4
*
* *
* * *
* * * *

 */
public class bai40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{
        System.out.print("enter n");
        int n = sc.nextInt();
        for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    }
    
}
