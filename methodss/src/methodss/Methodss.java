/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
  Nhập số nguyên n > 1. Viết hàm tính S =1^2+2^2 + 3^2 + ... + n^2 
 */
public class Methodss {
    //Nhập số nguyên n > 1.
    static int inputIntNumber() {
        int n;
        Scanner sc = new Scanner(System.in);
        do{            
            n = sc.nextInt();
            if(n <= 1) {
                System.out.print("Pleas input a number > 1. Again: ");
            }
        } while(n <= 1);
        
        return n;
    }
    
    //Viết hàm tính S =1^2+2^2 + 3^2 + ... + n^2 
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i*i;
        }
        return s;
    }
    
    public static void main(String[] args) {   
        int n;
        System.out.print("n = ");
        n = inputIntNumber();
        
//        System.out.print("m = ");
//        int m = inputIntNumber();
        int s = sum(n);
        System.out.println("Sum = " + s);
    } 
}

    
    

