/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Mang;

import java.util.Scanner;

public class BT_17 {

    public static void main(String[] args) {
//khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

//Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu trong mang 1<=n<=20:");
        n = sc.nextInt();
//cap phat so phan tu cho mang
        a = new int[n];

//Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

//a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);

//b.Tính Trung Bình của mảng
        double tb = tinhTrungBinh(a);
        System.out.println("Trung binh cua mang la: " + tb);
//c.Tìm min
        int min = timMin(a);
        System.out.println("So nho nhat cua mang la: " + min);
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

//dinh nghia phuong thuc tinh tong
    public static double tinhTrungBinh(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x; //s=s+x;
        }
        return sum / a.length;
    }

//phuong thuc tim phan tu nho nhat mang
    public static int timMin(int[] a) {
        int min = a[0];
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
