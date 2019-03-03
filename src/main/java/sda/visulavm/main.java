package sda.visulavm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ticket> ticketList = null;
        String komenda;
        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();       // jedno słowo
            if (komenda.equalsIgnoreCase("dodaja")) {   // array list
                int ilosc = scanner.nextInt();
                ticketList = dodajDoArrayList(ilosc);
            } else if (komenda.equalsIgnoreCase("dodajl")) { // linked list
                int ilosc = scanner.nextInt();
                ticketList = dodajDoLinkedList(ilosc);
            } else if (komenda.equalsIgnoreCase("czysc")) { // usun wszystko z listy
                ticketList.clear();
            } else if (komenda.equalsIgnoreCase("iteruj")) { // iteruj
                iteruj(ticketList);
            } else if (komenda.equalsIgnoreCase("gc")) { // uzyj garbedż kolektora
                Runtime.getRuntime().gc();
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }
    public static void iteruj(List<ticket> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getId();
        }
    }
    public static List<ticket> dodajDoArrayList(int liczba) {
        List<ticket> ticketList = new ArrayList<>();
        for (int i = 0; i < liczba; i++) {
            ticketList.add(new ticket(i));
        }
        return ticketList;
    }
    public static List<ticket> dodajDoLinkedList(int liczba) {
        List<ticket> ticketList = new LinkedList<>();
        for (int i = 0; i < liczba; i++) {
            ticketList.add(new ticket(i));
        }
        return ticketList;
    }
}