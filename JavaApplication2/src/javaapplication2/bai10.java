/*
 *Bạn có thời gian rảnh và đi làm thêm cho một cửa hàng tạp hóa. Bạn được
nhận tiền hoa hồng dựa vào doanh số bán hàng như sau:
● 5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
● 10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
● 20 % nếu tổng doanh số là lớn hơn 300 triệu.
Viết chương trình nhập vào tổng doanh số bạn bán được và tính số tiền hoa hồng
bạn nhận được.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai10 {
    public static void main(String[] args) {
        int x;
        System.out.println("Nhap doanh thu ban hang ");
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        if ( x <= 100000000 )
        { 
            System.out.println("Tien hoa hong la" + x*0.05*.1f );
       
        }
        else if ( x <= 300000000 )
        {
            System.out.println("Tien hoa hong la" + x*0.1*.1f );
        }
        else if ( x > 300000000 )
        {
            System.out.println("Tien hoa hong la" + x*0.2*0.1f );
        }
    }
            
}
