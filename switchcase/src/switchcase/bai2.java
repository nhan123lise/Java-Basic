/*
 Viết chương trình nhập vào số nguyên 4 (1 → 4) và in ra mùa tương ứng
Ví dụ:
n = 1 → XUAN
n = 2 → HA
n = 3 → THU
n = 4 → DONG
n = 5 → UNKNOW
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("x = ");
        x = sc.nextInt(); 
switch (x) {
  case 1:
    System.out.println("Xuan");
    break;
  case 2:
    System.out.println("Ha");
    break;
  case 3:
    System.out.println("Thu");
    break;
  case 4:
    System.out.println("Dong");
    break;
  case 5:
    System.out.println("Unknown");
    break;
}
}}
