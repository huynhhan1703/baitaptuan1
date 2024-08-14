/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Mang;

import java.util.Scanner;

public class BT_18 {

    public static void main(String[] args) {
//khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

//Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu trong mang 1<=n<=50:");
        n = sc.nextInt();
//cap phat so phan tu cho mang
        a = new int[n];

//Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

//a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);

//b.Tìm số nguyên tố
        System.out.print("Cac so khong la so nguyen to la: ");
        for (int i = 0; i < n; i++) {
            if (!check(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        int sum=0;
        
        for (int i = 0; i < n; i++) {
            if (!check(a[i])) {
                sum=sum+a[i];
            }
        }
        System.out.print("tong Cac so khong la so nguyen to la: "+sum);
    }

//dinh nghia phuong thuc nhap mang
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }

//dinh nghia phuong thuc xuat mang
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        //Nếu không chia hết thì trả về true
        return true;
    }
}
