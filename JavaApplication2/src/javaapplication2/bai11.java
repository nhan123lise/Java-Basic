/*
 Nhà bạn hàng tháng phải đóng tiền điện và được tính như sau:
● Từ 0 - 50 kwh đơn giá 1 480 vnđ/kwh
● Từ 51 kwh trở đi đến 100 kwh đơn giá 1 500 vnđ/kwh
● Từ 101 kwh trở đi đến 200 kwh đơn giá 1 700 vnđ/kwh
● Từ 201 kwh trở lên đơn giá 2 800 vnđ/kwh
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai11 {
    public static void main(String[] args) {
        Integer a;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so chi dien ");
        a=input.nextInt();
        if ( a <= 50 )
        {
            System.out.println("Tien dien la" + a*1480);
        }
        else if ( a <= 100 )
        {
            System.out.println("Tien dien la" + a*1500);
        }
        else if ( a <= 200 )
        { 
            System.out.println("Tien dien la" + a*1700);
        }
        else 
        {
            System.out.println("Tien dien la" + a*2000);
        }}
}
    

