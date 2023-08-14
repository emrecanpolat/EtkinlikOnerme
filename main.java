package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        heat = input.nextInt();

        if (heat<5){
            System.out.println("Kayak Yapınız");
        } else if (heat < 10) {
            System.out.println("Sinemaya Gidiniz");

        }else if (heat<15){
            System.out.println("Sinemaya Gidiniz Veya Pikniğe Gidiniz");
        }else if (heat<25){
            System.out.println("Pikniğe gidiniz.");
        }else {
            System.out.println("Yüzmeye Gidiniz");
        }

    }
}
