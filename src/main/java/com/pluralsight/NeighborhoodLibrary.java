package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[25];
    private static int numBooks = 21;

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
            Scanner libraryScanner = new Scanner(System.in);

            while (!isDone) {
                System.out.println("Please select from the following options:");
                System.out.println("a. Show Available Books");
                System.out.println("b. Show Checked Out Books");
                System.out.println("c. Exit");

                String command = libraryScanner.next();
//                String checkOutSelection = libraryScanner.nextLine();


                libraryScanner.nextLine();

                switch (command) {
                    case "a":
                        ShowAvailableBooks();
                        System.out.println("Please select from the following options:");
                        System.out.println("d. Check out a book");
                        System.out.println("e. Return to main menu");
                        String command1 = libraryScanner.next();
                        libraryScanner.nextLine();
                        switch (command1) {
                            case "d":
                                System.out.println("Please enter the ID of the book you wish to check out");
                                int checkOutSelection = libraryScanner.nextInt();
                                libraryScanner.nextLine();
                                System.out.println("Please enter your full name");
                                String offeredName = libraryScanner.nextLine();
                                CheckID(checkOutSelection, offeredName);
                                break;
                            case "e":
                                break;
                        }
                        break;
                    case "b":
                        ShowCheckedOutBooks();
                        break;
                    case "c":
                        System.out.println("We hope you enjoyed your visit to the library!");
                        isDone = true;
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("System error");
        }

    }

    public static void ShowAvailableBooks() {
        System.out.println("Available Books:");
        System.out.println("ID" + " | " + "ISBN" + " | " + "Title");
        int availableCounter = 0;
        for (int i = 0; i < numBooks; i++) {
            if (!books[i].getIsCheckedOut()) {
                System.out.println(books[i].toString());
                availableCounter++;
            }
        }
        if (availableCounter == 0) {
            System.out.println("There are no currently available books");
        }
    }

    public static void ShowCheckedOutBooks() {
        System.out.println("Checked Out Books:");
        System.out.println("ID" + " | " + "ISBN" + " | " + "Title");
        int checkedOutCounter = 0;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getIsCheckedOut()) {
                System.out.println(books[i].toString());
                checkedOutCounter++;
            }
        }
        if (checkedOutCounter == 0) {
            System.out.println("There are no currently checked out books");
        }
    }

    public static void CheckID(int id, String name) {
        try {
            for (int i = 0; i < numBooks; i++) {
                if (books[i].getId() == id) {
                    books[i].checkOut(name);
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}

