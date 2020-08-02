/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;
import static methodss.bai4.inputIntNumber;

/**
 Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số hoàn hảo hay
không.
Số hoàn hảo là số có tổng tất cả các ước bé hơn bé hơn n bằng chính nó. Ví dụ 6 là
số hoàn hảo, vì 6 có các ước là 1, 2, 3. Và tổng 1 + 2 +3 = 6
 */
public class bai5 {
    static int Inputnumber(){
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
    static int perfectNum(int n){
        int s = 0;
        for ( int i = 1; i <= n/2; i++ ){
            if ( n % i == 0 ){
                s += i;
            }
        }
        return s;
    }
    public static void main(String[] args){
        int n;
        System.out.print("n = ");
        n = inputIntNumber();
        int s = perfectNum(n);
        if ( s == n ){
            System.out.print(n + " is perfect number");
        }
        else {
            System.out.print ( n + " is not perfect number");
        }
    }
    
}
