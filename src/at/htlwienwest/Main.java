package at.htlwienwest;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Herzlich willkommen");
        System.out.println("Es freut mich sehr, dass ihr hier seid");

        Person person = new Person("Peter", "M",
                LocalDate.of(1990, 01, 01), "Hauptstrasse 1");
    }
}
