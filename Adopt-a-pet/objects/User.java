package objects;

import java.util.Scanner;

public class User {
    private String name;
    private String email;
    private int phone;
    private String appointmentDay; // New property for appointment day

    public User(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhone() {
        return this.phone;
    }

    public String getAppointmentDay() {
        return this.appointmentDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void bookAppointment() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Appointment Booking System");
        System.out.println("Our hours of operation are:");
        System.out.println("Monday-Friday: 9:00 AM - 5:00 PM");
        System.out.println("Saturday: 10:00 AM - 2:00 PM");
        System.out.println("Sunday: Closed");
        System.out.println();

        int choice;
        do {
            System.out.println("Please select a day of the week for your appointment:");
            System.out.println("1. Monday   2. Tuesday   3. Wednesday   4. Thursday   5. Friday   6. Saturday   7. Sunday");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice. Please select a day from 1 to 7.");
            }
        } while (choice < 1 || choice > 7);

        appointmentDay = getDayOfWeek(choice);

        System.out.println("Appointment booked for " + appointmentDay);

        // Close the Scanner object
        input.close();
    }

    private String getDayOfWeek(int choice) {
        switch (choice) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid choice";
        }
    }
}

    



