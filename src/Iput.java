import java.util.Scanner;

public class Iput {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        int weight;
        boolean smoker;

        System.out.print("What is your name: ");
        name = scanner.nextLine();

        System.out.print("How old are you: ");
        age = scanner.nextInt();

        System.out.print("How much do you weigh: ");
        weight = scanner.nextInt();

        System.out.print("Enter True if you Smoke or False if you dont: ");
        smoker = scanner.nextBoolean();

        System.out.println("\nYou responded with the following");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + smoker);

        scanner.close();
    }
}
