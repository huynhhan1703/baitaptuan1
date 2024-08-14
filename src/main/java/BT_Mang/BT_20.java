/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Mang;

import java.util.Scanner;
import java.util.Arrays;

public class BT_20 {

    public static void main(String[] args) {
//khai bao mang luu so nguyen
        int[] a;
        int n;
        int x;
        Scanner sc = new Scanner(System.in);
        n = docSoPT(sc);
        //cap phat so phan tu cho mang
        a = new int[n];
        nhapMang(a, sc);

//a.xuat mang ra man hinh
        System.out.print("===Mang a=====");
        xuatMang(a);

//b.liet ke phan tu
        System.out.print("Nhap x: ");
        x = sc.nextInt();

        vitri(a, x);
        tangdan(a);

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
            System.out.print("Cho biet so phan tu mang (1<=n<=20):");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }

//dinh nghia phuong thuc xuat mang
    public static void xuatMang(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void vitri(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                System.out.print(x + " vi tri " + i);
            }
        }
    }

    public static void tangdan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[(i + 1)]) {
                System.out.print("khong tang");
                System.out.print("tang dan");

            }}
        }
    }
