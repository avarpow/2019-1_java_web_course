package myinteger;

import java.util.Scanner;

public class w2_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        MyInteger mi = new MyInteger(a);
        MyInteger ni = new MyInteger(b);
        System.out.println(mi.isEven());
        System.out.println(mi.isOdd());
        System.out.println(mi.isPrime());
        System.out.println(mi.isPrime(c));
        System.out.println(mi.isPrime(ni));
        System.out.println(mi.equals(c));
        System.out.println(mi.equals(ni));
        x.close();
    }
}

