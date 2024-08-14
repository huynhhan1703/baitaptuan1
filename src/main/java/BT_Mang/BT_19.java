/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Mang;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class BT_19 {
    
    public static void main(String[] args) {
//khai bao mang luu so nguyen
        int[] a;
        int n;
        int x;
        Scanner sc = new Scanner(System.in);
        n = docSoPT(sc);
        //cap phat so phan tu cho mang
        a = new int[n];
//Mang phat sinh
        phatSinhMang(a);
        System.out.print("Mang duoc phat sinh: ");
//Đọc số phần tử từ bàn phím
        xuatMang(a);


//a.xuat mang ra man hinh
        sapXepTangDan(a);
        System.out.print("===Mang a=====");
        xuatMang(a);

//b.liet ke phan tu
        
        System.out.print("Nhap x: ");
        x = sc.nextInt();
        System.out.print("Cac phan tu la uoc so cua x: ");
        lietKePT(a, x);
        
    }

//dinh nghia phuong thuc nhap mang
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    
    public static int docSoPT(Scanner sc) {
        int n = 0;
        do {
            System.out.print("Cho biet so phan tu mang (1<=n<=20)");
            n=sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }

//dinh nghia phuong thuc xuat mang
    public static void xuatMang(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    
    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
    }
    
    public static void sapXepTangDan(int[] a) {
        Arrays.sort(a);
    }
    
    public static void lietKePT(int[] a, int x) {
        for (int item : a) {
            if (x % item == 0) {
                System.out.print(item + " ");
            }
        }
    }
}
