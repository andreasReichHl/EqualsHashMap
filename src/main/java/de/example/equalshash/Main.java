package de.example.equalshash;

import java.util.HashMap;

public class Main {

    static HashMap<Buch, Integer> available = new HashMap<>();

    public static void main(String[] args) {
        Buch harryPotter1a = new Buch("Harry Potter und der Stein der Weisen", "J.K. Rowling", "978-3-551-55656-6");
        Buch harryPotter1b = new Buch("Harry Potter und der Stein der Weisen", "J.K. Rowling", "978-3-551-55657-3");
        Buch harryPotter1c = new Buch("Harry Potter und der Stein der Weisen", "J.K. Rowling", "978-3-551-55656-6");
        Buch harryPotter2 = new Buch("Harry Potter und die Kammer des Schreckens", "J.K. Rowling", "978-3-551-55658-0");
        Buch harryPotter3 = new Buch("Harry Potter und der Gefangene von Askaban", "J.K. Rowling", "978-3-551-55659-7");

        bookToHashMap(harryPotter1a);
        bookToHashMap(harryPotter1b);
        bookToHashMap(harryPotter1c);
        bookToHashMap(harryPotter2);
        bookToHashMap(harryPotter3);

        numbersOfBook(harryPotter1c);

        isBookInMap(harryPotter3);

//        removeBooks(harryPotter3);

        isBookInMap(harryPotter3);

        removeOneBook(harryPotter1a);

        keyValuePairs();

    }

    public static void bookToHashMap(Buch buch) {
        int number = 1;
        available.put(buch, number);
        for (Buch b : available.keySet()) {
            if (b.getAuthor().equals(buch.getAuthor()) && buch.getTitel().equals(b.getTitel())) {
                available.replace(b, available.get(b) + 1);
                return;
            }
        }
    }

    public static void numbersOfBook(Buch buch) {
        System.out.println(available.get(buch));
    }

    public static void isBookInMap(Buch buch) {
        for (Buch b : available.keySet()) {
            if (b.equals(buch)) {
                System.out.println("Buch ist in Map vorhanden!");
                return;
            }
        }
        System.out.println("Buch ist in Map nicht vorhanden!");
    }

    public static void removeBooks(Buch buch) {
        for (Buch b : available.keySet()) {
            if (b.equals(buch)) {
                available.remove(b);
                System.out.println("Buch wurde gelöscht!");
                return;
            }
        }
        System.out.println("Buch wurde nicht gefunden!");
    }

    public static void removeOneBook(Buch buch) {
        for (Buch b : available.keySet()) {
            if (b.getAuthor().equals(buch.getAuthor()) && buch.getTitel().equals(b.getTitel())) {
                if (available.get(b) >= 2) {
                    available.replace(b, available.get(b) - 1);
                    System.out.println("Es wurde ein Buch gelöscht!");
                    return;
                }
                available.remove(b);
                System.out.println("Bücher wurden vollständig gelöscht!");
            }
        }
    }

    public static void keyValuePairs() {
        for (Buch b : available.keySet()) {
            System.out.println(b.hashCode());
        }
    }
}