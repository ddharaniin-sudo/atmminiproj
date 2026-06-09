import java.util.Scanner;
class Person {
    String name;
    int age;
    void getPersonalDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }
}
class Customer extends Person {
    String movieName;
    int tickets;
    void getBookingDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        tickets = sc.nextInt();
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.getPersonalDetails();
        c.getBookingDetails();

        System.out.println("\n--- Ticket Details ---");
        System.out.println("Name: " + c.name);
        System.out.println("Age: " + c.age);
        System.out.println("Movie Name: " + c.movieName);
        System.out.println("Tickets: " + c.tickets);
        System.out.println("Ticket booked successfully!" );
    }
}