/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 	Nhập số nguyên n > 0. Tính S =1/2 + 1/4 + … + 1/2n
 */
public class bai3 {
    public static void main(String[] args){
        System.out.print("Nhap so nguyen n>0");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float s = 0;
        for (int i = 1; i <= n; i++){
             s +=  1.0/(2*i);
        }
        System.out.println("Tong s la" + s);
        
    }
    
}
