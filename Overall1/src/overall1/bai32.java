/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 32.	Nhập số nguyên n. Hãy kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không
 */
public class bai32 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();
        int tmp = n;
        boolean isIncreasing = true;
        int before = n % 10;
        n /= 10;
        while ( n != 0 ){
            if ( n % 10 >= before ){
                isIncreasing = false;
                break;
            }
            before = n % 10;
            n /= 10;
        }
        if (isIncreasing){
            System.out.print(tmp + " is increasing");
        }else{
            System.out.print(tmp + " is not increasing");
        }
        
    
    }
}
