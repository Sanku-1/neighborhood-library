package com.pluralsight;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[25];

    private static int numBooks = 5;

    public static void main(String[] args) {
        books[0] = new Book(0000, "9780765376671", "The Way of Kings", false, "");
        books[1] = new Book(0001, "9780375826696", "Eragon", false, "");
        books[2] = new Book(0002, "9780735211299", "Atomic Habits", false, "");
        books[3] = new Book(0003, "9780060731328", "Freakonomics", false, "");
        books[4] = new Book(0004, "9780451191145", "Atlas Shrugged", false, "");

    }
}
