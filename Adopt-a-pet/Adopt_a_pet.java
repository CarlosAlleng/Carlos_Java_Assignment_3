 import utility.*;
import objects.*;
import java.util.Scanner;

public class Adopt_a_pet {
    private static Scanner input = new Scanner(System.in);
    private static Ink ink = new Ink();
    private static User user;
    private static Shelter shelter = new Shelter();
    private static Pet pet;

    private static int choice;
    private static boolean isDone = false;
    private static boolean goBack = false;

    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        createUser(); // create the user
        createPets(); // helper pets

        while (!isDone) {
            choice = ink.validateMainMenu();

            switch (choice) {
                case 1: // print available pets
                    System.out.println(RED + "Available Pets:" + RESET);
                    ink.printAvailablePets(shelter.getPets());
                    while (!goBack) {
                        int pick = input.nextInt();
                        if (pick != 0) {
                            ink.printPetDetails(shelter.getPet(pick - 1));
                            String answer = input.next();
                            if (answer.equalsIgnoreCase("Y")) {
                                shelter.adopt(pick - 1, user.getName());
                                goBack = !goBack;
                            } else {
                                goBack = !goBack;
                            }
                        } else {
                            goBack = !goBack;
                        }
                    } // while
                    break;
                case 2: // print shelter details
                    System.out.println(BLUE + "Shelter Details:" + RESET);
                    ink.printShelterDetails(shelter);
                    while (!goBack) {
                        input.nextLine();
                        goBack = !goBack;
                    } // while
                    break;
                case 3: // book an appointment menu
                    System.out.println(GREEN + "Book an Appointment:" + RESET);
                    while (!goBack) {

                    }
                    break;
                case 4:
                    isDone = !isDone;
                    break;
            } // switch
            goBack = !goBack; // seems wrong but it is NOT wrong
        } // while(main)

        System.out.println(PURPLE + "Have a great day pet lover" + RESET);
    } // main()

    // 100% for test data!
    public static void createPets() {
        pet = new Pet("spot", "dog", 3, "black", "hound");
        shelter.addPet(pet);
        pet = new Pet("cleveland", "dog", 7, "brown", "boxer");
        shelter.addPet(pet);
        pet = new Pet("monster", "cat", 1, "calico", "calico");
        shelter.addPet(pet);
    } // createPets()

    public static void createUser() {
        String name, email;
        int phone;
        System.out.println(YELLOW + "What is your name? " + RESET);
        name = input.nextLine();
        System.out.println(YELLOW + "What is your email? " + RESET);
        email = input.nextLine();
        System.out.println(YELLOW + "What is your phone? " + RESET);
        phone = input.nextInt();
        user = new User(name, email, phone);
    } // createUser()

} // class
