package com.pluralsight;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[25];
    private static int numBooks = 20;
    public static void main(String[] args) {
        try {
            books[0] = new Book(1, "9780765376671", "The Way of Kings", false, "");
            books[1] = new Book(2, "9780375826696", "Eragon", false, "");
            books[2] = new Book(3, "9780735211299", "Atomic Habits", false, "");
            books[3] = new Book(4, "9780060731328", "Freakonomics", false, "");
            books[4] = new Book(5, "9780451191145", "Atlas Shrugged", false, "");
            books[5] = new Book(6, "9780385351409", "The Circle", false, "");
            books[6] = new Book(7, "9781338878929", "Harry Potter and the Sorcerer's Stone", false, "");
            books[7] = new Book(8, "9780316003957", "The Mysterious Benedict Society", false, "");
            books[8] = new Book(9, "9780307387899", "The Road", false, "");
            books[9] = new Book(10, "9780618706419", "The Things They Carried", false, "");
            books[10] = new Book(11, "9780345514400", "I Know Why the Caged Bird Sings", false, "");
            books[11] = new Book(12, "9780439841191", "Wedding Crasher", false, "");
            books[12] = new Book(13, "9780375837531", "Eldest", false, "");
            books[13] = new Book(14, "9782211056465", "Stuart Little", false, "");
            books[14] = new Book(15, "9780062073488", "And Then There Were None", false, "");
            books[15] = new Book(16, "9780679745587", "In Cold Blood", false, "");
            books[16] = new Book(17, "9780451205766", "The Godfather", false, "");
            books[17] = new Book(18, "9781594631771", "This Is How You Lose Her", false, "");
            books[18] = new Book(19, "9780679781585", "Memories of a Geisha", false, "");
            books[19] = new Book(20, "9780307341556", "Sharp Objects", false, "");
            books[20] = new Book(21, "9780375507250", "Cloud Atlas", false, "");

            boolean isDone = false;

            while (!isDone) {
                System.out.println("Please select from the following options:");
                System.out.println("1. Show Available Books");
                System.out.println("2. Show Checked Books");
                System.out.println("3. Exit program");
            }
        } catch (Exception e) {
            System.err.println("System error");
        }
    }
}
