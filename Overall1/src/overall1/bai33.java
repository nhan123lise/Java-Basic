/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 33.	Nhập số nguyên n. Hãy kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không
 */
public class bai33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        int tmp = n;
        int after = n % 10;
        n /= 10;
        boolean IsDecreasing = true;
        while ( n != 0 ){
            int before = n % 10;
            if ( before <= after ){
                IsDecreasing = false;
                break;
            }
            after = before;
            n /= 10;
        }
        if (IsDecreasing ){
            System.out.print(tmp + " is decreasing");
        }else{
            System.out.print(tmp + " is not decreasing");
        }
        
    }
    
}

