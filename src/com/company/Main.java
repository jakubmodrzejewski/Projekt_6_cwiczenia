package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {
        System.out.println("Program, ktory pobiera od uzytkownika liczbe calkowita dodatnia,");
        System.out.println("a nastepnie wyswietla na ekranie kolejno wszystkie jej dzielniki.");
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbe.");
        int a = liczba.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
            System.out.println("Koniec programu.");
        }
    }
}