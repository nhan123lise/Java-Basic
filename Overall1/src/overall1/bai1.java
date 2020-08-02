/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 	Nhập số nguyên n > 1. Tính S =1^2+2^2  + 3^2  + ...+ n^2  
 */
public class bai1 {
    public static void main(String[] args){
        System.out.println("Nhan so nguyen n");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++){
            s+=i*i;
            
        }
        System.out.print("Tong S la" +s);

    }
    
}
