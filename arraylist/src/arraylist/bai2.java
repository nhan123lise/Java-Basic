/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
Viết chương trình nhập vào danh sách Sinh viên (String) cho đến khi nhập chuỗi exit hoặc Exit thì dừng. (không phân biệt chữ hoa hay chữ thường) 
In danh sách vừa nhập ra màn hình
Nhập chuỗi con và in ra vị trí tìm thấy đầu tiên trong danh sách. Nếu không tìm thấy, chèn chuỗi đó vào giữa danh sách
Nhập chuỗi con và in ra vị trí tìm thấy cuối cùng trong danh sách. Nếu không tìm thấy, tách chuỗi con thành 2 phần, sau đó chèn vào đầu và cuối danh sách (nếu chuỗi con chỉ có một ký tự, chèn chuỗi con vào giữa danh sách)
Nhập chuỗi con và in ra tất cả các vị trí có chứa chuỗi con đó. Nếu không tìm thấy vị trí nào, nối chuỗi con vào cuối tất cả các phần tử của danh sách

 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrStr = new ArrayList<>();
        String str;
        String exit = "exit";
        do {
            System.out.print("Import name: ");
            str = sc.nextLine();
            if (!str.equalsIgnoreCase("exit") && !str.equalsIgnoreCase("Exit")) {
                arrStr.add(str);
            }
        } while (!str.equalsIgnoreCase("exit") && !str.equalsIgnoreCase("Exit"));
        System.out.println(arrStr);
        //2
        System.out.print("Import substring: ");
        String sub = sc.nextLine();
        if (arrStr.indexOf(sub) != -1) {
            System.out.println("Found at: "+arrStr.indexOf(sub));
        } else {
            arrStr.add(arrStr.size() / 2, sub);
        }
        System.out.println(arrStr);
        //3
        if (arrStr.lastIndexOf(sub) != -1) {
            System.out.println(arrStr.indexOf(sub));
        } else {
            if (sub.length() == 1) {
                arrStr.add(arrStr.size() / 2, sub);
                System.out.println("New array: "+arrStr);
            } else {
                String sub_first = sub.substring(0, sub.length() / 2);
                String sub_second = sub.substring(sub.length() / 2);
                arrStr.add(0, sub_first);
                arrStr.add(sub_second);
                System.out.println("New array: "+arrStr);
            }

        }
        //4
        if (arrStr.indexOf(sub) != -1) {
            System.out.print("The position of the sub in list is: ");
            for (int i = 0; i < arrStr.size(); i++) {
                if (arrStr.get(i).equals(sub)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = 0; i < arrStr.size(); i++) {
                arrStr.set(i, arrStr.get(i) + sub);
            }
            System.out.println("New Array: " + arrStr);
        }

    }
    
    
}
