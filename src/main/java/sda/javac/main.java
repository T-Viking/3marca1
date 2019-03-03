package sda.javac;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzen: ");
        int wartosc = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<wartosc; i++){
            System.out.println("Hello world!");
        }
    }
}
