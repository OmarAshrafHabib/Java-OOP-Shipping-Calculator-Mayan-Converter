
/**
 * reads in the dimensions for various different containers 
 * and displays the volume and surface area of each.
 * @author Omar Habib ID:3742418
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Dimensions {
    public static void main(String[] args) {

        System.out.println("What would you like to do?");
        System.out.println("1 - Get info for a box");
        System.out.println("2 - Get info for a tube");
        System.out.println("3 - Quit");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        double boxMaxVolume = 0;
        double tubeMaxVolume = 0;

        double boxMinSurfaceArea = 999999999;
        double tubeMinSurfaceArea = 999999999;

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(3);

        while (userInput != 3) {
            if (userInput > 3 || userInput < 1) {
                System.out.print("Invalid Choice, try again: ");
                userInput = sc.nextInt();
            }

            if (userInput == 1) {
                double length;
                System.out.print("Length (in cm): ");
                length = sc.nextDouble();
                while (length <= 0) {
                    System.out.print("length cannot be zero or negative please try again: ");
                    length = sc.nextDouble();
                }

                double width;
                System.out.print("Width (in cm): ");
                width = sc.nextDouble();
                while (width <= 0) {
                    System.out.print("width cannot be zero or negative please try again: ");
                    width = sc.nextDouble();
                }

                double hight;
                System.out.print("Hight (in cm): ");
                hight = sc.nextDouble();
                while (hight <= 0) {
                    System.out.print("hight cannot be zero or negative please try again: ");
                    hight = sc.nextDouble();
                }

                Box box1 = new Box(length, width, hight);

                System.out.println("The volume is: " + formatter.format(box1.volume()) + " cubic centimeters.");
                System.out.println(
                        "The surface area is: " + formatter.format(box1.surfaceArea()) + " square centimeters.");

                if (box1.volume() > boxMaxVolume) {
                    boxMaxVolume = box1.volume();
                }
                if (box1.surfaceArea() < boxMinSurfaceArea) {
                    boxMinSurfaceArea = box1.surfaceArea();
                }
                System.out.println("\nWhat would you like to do?");
                System.out.println("1 - Get info for a box");
                System.out.println("2 - Get info for a tube");
                System.out.println("3 - Quit");
                System.out.print("Enter your choice: ");
                userInput = sc.nextInt();
            } else if (userInput == 2) {
                double radius;
                System.out.print("Radius (in cm): ");
                radius = sc.nextDouble();
                while (radius <= 0) {
                    System.out.print("radius cannot be zero or negative please try again: ");
                    radius = sc.nextDouble();
                }

                double hight;
                System.out.print("Hight (in cm): ");
                hight = sc.nextDouble();
                while (hight <= 0) {
                    System.out.print("Hight cannot be zero or negative please try again: ");
                    hight = sc.nextDouble();
                }

                Tube tube1 = new Tube(radius, hight);
                System.out.println("The volume id: " + formatter.format(tube1.volume()) + " cubic centimeters.");
                System.out.println(
                        "The surface area is: " + formatter.format(tube1.surfaceArea()) + " square centimeters.");

                if (tube1.volume() > tubeMaxVolume) {
                    tubeMaxVolume = tube1.volume();
                }
                if (tube1.surfaceArea() < tubeMinSurfaceArea) {
                    tubeMinSurfaceArea = tube1.surfaceArea();
                }

                System.out.println("\nWhat would you like to do?");
                System.out.println("1 - Get info for a box");
                System.out.println("2 - Get info for a tube");
                System.out.println("3 - Quit");
                System.out.print("Enter your choice: ");
                userInput = sc.nextInt();

            }
        }
        if (userInput == 3) {
            if (boxMaxVolume > tubeMaxVolume) {
                System.out.println("The container with the largest volume is a Box.");
                System.out.println("Its volume is: " + formatter.format(boxMaxVolume) + " cubic centimeters.");
            } else if (tubeMaxVolume > boxMaxVolume) {
                System.out.println("The container with the largest volume is a Tube.");
                System.out.println("Its volume is: " + formatter.format(tubeMaxVolume) + " cubic centimeters.");
            }

            if (boxMinSurfaceArea < tubeMinSurfaceArea) {
                System.out.println("The container with the smallest surface area is a Box.");
                System.out
                        .println("Its surface area is: " + formatter.format(boxMinSurfaceArea) + " squer centimeters.");
            } else if (tubeMinSurfaceArea < boxMinSurfaceArea) {
                System.out.println("The container with the smallest surface area is a Tube.");
                System.out.println(
                        "Its surface area is: " + formatter.format(tubeMinSurfaceArea) + " squer centimeters.");
            }
        }
    }
}
