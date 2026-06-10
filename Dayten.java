import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
    }
}

class Result extends Student {
    int m1, m2, m3;
    int total;
    double average, percentage;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();
    }

    double calculate() {
    total = m1 + m2 + m3;
    average = total / 3.0;
    percentage = (total / 300.0) * 100;
    return percentage;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Dayten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Result[] s = new Result[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            s[i] = new Result();
            s[i].getDetails();
            s[i].getMarks();
            s[i].calculate();
        }
        System.out.println("\nStudent Details");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            s[i].display();
        }
    }
}
