/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai11 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        int s = 1;
        System.out.print("nhap vao n");
        n = sc.nextInt();
        for (int i = 1; i<=n; i++ ){
            if (n % i == 0){
                s *= i;
            }
        }
            System.out.print("Tong cac so nguyen la" + s);   
        }
        
    }
    
    

