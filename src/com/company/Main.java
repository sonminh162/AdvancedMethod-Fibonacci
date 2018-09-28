package com.company;

import java.util.Scanner;

public class Main {
    public static int findValue(int index){
        if(index<3)return 1;
        return findValue(index-2)+findValue(index-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao vi tri so muon tim trong day Fibonaci:");
        int index;
        index = scanner.nextInt();
        int value = findValue(index);
        System.out.print(value);
    }
}
