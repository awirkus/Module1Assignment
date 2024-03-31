package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMaker {
    public static void makeAnimals(ArrayList list) {
        Scanner keyboard = new Scanner(System.in);
        boolean addMore = true;

        while (addMore) {
            System.out.print("What type of animal do you want to add? (Dog/Cat/Teacher): ");
            String animalType = keyboard.nextLine().toLowerCase();

            switch (animalType) {
                case "dog":
                    System.out.print("Enter the name of the dog: ");
                    String dogName = keyboard.nextLine();
                    System.out.print("Is the dog friendly? (true/false): ");
                    boolean isFriendly = Boolean.parseBoolean(keyboard.nextLine());
                    list.add(new Dog(isFriendly, dogName));
                    break;
                case "cat":
                    System.out.print("Enter the name of the cat: ");
                    String catName = keyboard.nextLine();
                    System.out.print("Enter the number of mouses killed by the cat: ");
                    int mousesKilled = Integer.parseInt(keyboard.nextLine());
                    list.add(new Cat(mousesKilled, catName));
                    break;
                case "teacher":
                    System.out.print("Enter the name of the teacher: ");
                    String teacherName = keyboard.nextLine();
                    System.out.print("Enter the age of the teacher: ");
                    int teacherAge = Integer.parseInt(keyboard.nextLine());
                    list.add(new Teacher(teacherAge, teacherName));
                    break;
                default:
                    System.out.println("Invalid animal type.");
                    break;
            }
            System.out.print("Do you want to add another animal? (yes/no): ");
            String addAnotherResponse = keyboard.nextLine().toLowerCase();
            if (addAnotherResponse.equals("no")) {
                addMore = false;
            }
        }
    }
}
