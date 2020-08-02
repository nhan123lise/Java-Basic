/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;
import static methodss.bai16.IntNum;

/**
 Nhập số nguyên n &gt; 100. Viết hàm kiểm tra các chữ số của số nguyên
dương n có giảm dần từ trái sang phải hay không
 */
public class bai17 {
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
    static boolean isDecreasing(int n){
        int tmp = n;
        boolean isDecreasing = true;
        int after = n % 10;
        n /= 10;
        
        while(n != 0) {
            int before = n % 10;
            if(before < after || before == after){
                isDecreasing = false;
                break;
            }
            after = before;
            n /= 10;
        }
        return isDecreasing;
    }
    public static void main(String[] args){
        int n;
        System.out.print("Enter n ");
        n = IntNum();
        boolean a = isDecreasing(n);
        if( a == true ){
            System.out.print(n + " is Decrease "); 
        } else {
            System.out.print(n + " is not Decrease ");
        }
        
    }
    
    
    
}
