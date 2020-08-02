/*
 Viết chương trình in menu và thực hiện chức năng

-------------------------TINH DIEN TICH--------------------------
An 1. Dien tich hinh chu nhat
An 2. Dien tich hinh tam giac
An 3. Dien tich hinh vuong
An 4. Dien tich hinh tron
An 5. Dien tich hinh thang
Chọn:
Mỗi chức năng nhập các hệ số tương ứng để thực hiện
Ví dụ: Chọn: 1
Chieu dai: 3
Chieu rong: 4
Dien tich hinh chu nhat la: 12
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai3 {
    public static void main(String[] args) {
    char operator;
    	Double number1, number2, result;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter operator (either +, -, * or /): ");
    	operator = scanner.next().charAt(0);
    	System.out.print("Enter number1 and number2 respectively: ");
    	number1 = scanner.nextDouble();
    	number2 = scanner.nextDouble();
    	
    	switch (operator) {
         case '+':
           result = number1 + number2;
    	   System.out.print(number1 + "+" + number2 + " = " + result);
           break;

         case '-':
           result = number1 - number2;
           System.out.print(number1 + "-" + number2 + " = " + result);
           break;

         case '*':
           result = number1 * number2;
           System.out.print(number1 + "*" + number2 + " = " + result);
           break;

         case '/':
           result = number1 / number2;
           System.out.print(number1 + "/" + number2 + " = " + result);
           break;

         default: 
           System.out.println("Invalid operator!");
           break;
        }       
    }

    
}
