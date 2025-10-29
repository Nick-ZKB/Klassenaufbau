package finalExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean aktiv = true;
        Scanner sc = new Scanner(System.in);
        Company company = new Company("Nick", "Zürichstrasse 55", 5, 4);

        while (aktiv) {

            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("                       Menu                       ");
            System.out.println("--------------------------------------------------");
            System.out.println("1. Raum hinzufügen");
            System.out.println("2. Räume suchen");
            System.out.println("3. freie Räume anzeigen");
            System.out.println("4. Raum buchen");
            System.out.println("5. exit");
            System.out.println("--------------------------------------------------");
            System.out.print("Eingabe -> ");
            int eingabe = sc.nextInt();
            System.out.println();

            while (eingabe != 1 && eingabe != 2 && eingabe != 3 && eingabe != 4  && eingabe != 5) {
                System.out.println("Fehler geben sie eine gültige Eingabe ein");
                System.out.print("Eingabe -> ");
                eingabe = sc.nextInt();
            }

            if (eingabe == 1) {
                System.out.println("Für wie viele Personen ist der neue Raum gedacht?");
                int capacity = sc.nextInt();
                company.addRoom(capacity);
            }
            if (eingabe == 2) {
                System.out.println("Für wie viele Personen sollte der Raum sein?");
                int capacity = sc.nextInt();
                company.searchRoom(capacity);
            }
            if (eingabe == 3) {
                company.freeRooms();
            }
            if (eingabe == 4) {
                company.freeRooms();
                if (company.rooms.size() != 0) {
                    System.out.println("Welchen Raum wollen sie buchen?");
                    System.out.print("Raumnummer: ");
                    int raumnummer = sc.nextInt();
                    company.bookRoom(raumnummer);
                }
            }
            if (eingabe == 5) {
                aktiv = false;
                System.out.println("Das Programm wurde erfolgreich beendet");
            }

        }

    }
}
