package kuis2;

import java.util.Scanner;

public class F1Standings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create drivers
        Driver[] drivers = {
                new Driver("Max Verstappen"),
                new Driver("Sergio Pérez"),
                new Driver("Charles Leclerc"),
                new Driver("Carlos Sainz"),
                new Driver("Fernando Alonso"),
                new Driver("George Russell"),
                new Driver("Lewis Hamilton"),
                new Driver("Lance Stroll"),
                new Driver("Esteban Ocon"),
                new Driver("Nico Hülkenberg"),
                new Driver("Lando Norris"),
                new Driver("Valtteri Bottas"),
                new Driver("Zhou Guanyu"),
                new Driver("Yuki Tsunoda"),
                new Driver("Alexander Albon"),
                new Driver("Logan Sargeant"),
                new Driver("Kevin Magnussen"),
                new Driver("Oscar Piastri"),
                new Driver("Nyck de Vries"),
                new Driver("Pierre Gasly")
        };

        // Print driver list
        for (int i = 0; i < 10; i++) {
            System.out.printf("\tID: %2d \t| %-20s \t||\t ID: %2d | %-20s%n",
                    i + 1, drivers[i], i + 11, drivers[i + 10]);
        }

        // Input number of races
        System.out.println();
        System.out.print("Masukkan jumlah race dalam satu musim : ");
        int numRaces = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int race = 1; race <= numRaces; race++) {
            RaceResultList raceResults = new RaceResultList();

            System.out.println("============================================");
            System.out.println("");
            System.out.println("Enter results for race " + race + ": ");

            // Input race results
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter driver id (1-20): ");
                int idDrivers = scanner.nextInt() - 1;
                System.out.print("Enter position: ");
                int position = scanner.nextInt();
                raceResults.addResult(new RaceResult(idDrivers, position));
            }

            System.out.println("============================================");

            // Calculate points for the race
            raceResults.calculatePoints(drivers);

            // Print standings after each race
            System.out.println("Standings after race " + race + ": ");
            for (int i = 0; i < 10; i++) {
                System.out.printf("\tID: %2d \t| %-20s \t||\t ID: %2d | %-20s%n",
                        i + 1, drivers[i], i + 11, drivers[i + 10]);
            }
        }

        scanner.close();
    }
}
