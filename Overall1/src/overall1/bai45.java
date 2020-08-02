/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 46.	Nhập n và in ra tam giác cân rỗng chiều cao n sau
	Ví dụ n = 5
*
* *
*   *
*      *
* * * * *

 */
public class bai45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter h");
        int h = sc.nextInt();
        for ( int i = 1; i <= h; i++){
            if ( i == 1 || i == 2 || i == h ){
                for ( int j = 1; j <= i; j++){
                System.out.print("* ");
                
            }
            }else {
                    for ( int k = 1; k <= i; k++ ){
                        if ( k == 1 || k == i ){
                                System.out.print("* ");
                         }
                        else { 
                                System.out.print("  ");
                        }
                    }
                 }
              System.out.println();  
            }
            
        }
    }
    
    

