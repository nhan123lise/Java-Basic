/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm kiểm tra các chữ số của số nguyên dương n có
tăng dần từ trái sang phải hay không
 */
public class bai16 {
    static int IntNum(){
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            n = sc.nextInt();
            if ( n <= 0 ){
                System.out.print("Please in put n again. n = ");
            }
        } while( n <= 0 );
        return n;
    }
    static boolean isIncreasing(int n){
        int tmp = n;
        boolean isIncreasing = true;
        int after = n % 10;
        n /= 10;
        
        while(n != 0) {
            int before = n % 10;
            if(before > after || before == after){
                isIncreasing = false;
                break;
            }
            after = before;
            n /= 10;
        }
        return isIncreasing;
    }
    public static void main(String[] args){
        int n;
        System.out.print("Enter n ");
        n = IntNum();
        boolean a = isIncreasing(n);
        if( a == true ){
            System.out.print(n + " is Increase "); 
        } else {
            System.out.print(n + " is not Increase ");
        }
        
    }
    
    
}
