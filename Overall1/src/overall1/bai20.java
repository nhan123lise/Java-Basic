/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
20.	Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
 */
public class bai20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n ; i++)
            if (i*i == n){
                c++;
                System.out.print("n la so chinh phuong");
                break;
            }
        if ( c == 0 ){
            System.out.print("n ko la so chinh phuong");
        }
    }
    
}
