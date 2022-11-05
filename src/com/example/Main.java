package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }
    public static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {return true;}
        else{return false;}
    }
}
