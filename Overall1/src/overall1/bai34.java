/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 34.	Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
 */
public class bai34 {
    public static void main(String[] args){
       int s = 0;
       int n = 0;
       while ( s < 10000 ){
           s += n;
           n++;
       }
       System.out.print(n-1);
    }
    
}
