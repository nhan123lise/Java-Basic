/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 49.	Nhập n và in ra tam giác cân chiều cao n sau
Ví dụ n = 5
           *
         * *
      * * *
   * * * *
* * * * *

 */
public class bai49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }
            for ( int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
