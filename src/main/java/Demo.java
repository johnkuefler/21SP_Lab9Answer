
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Demo {

    public static void main(String[] args) {

        // demonstrates land tract class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length of first land tract");
        double length1 = keyboard.nextDouble();
        System.out.println("Enter width of first land tract");
        double width1 = keyboard.nextDouble();
        LandTract landTract1 = new LandTract(length1, width1);

        System.out.println("Enter length of second land tract");
        double length2 = keyboard.nextDouble();
        System.out.println("Enter width of second land tract");
        double width2 = keyboard.nextDouble();
        LandTract landTract2 = new LandTract(length2, width2);

        System.out.println("Area of first land tract is " + landTract1.getArea());
        System.out.println("Area of second land tract is " + landTract2.getArea());

        if (landTract1.equals(landTract2)) {
            System.out.println("The land tracts are equal in size");
        } else {
            System.out.println("The land tracts are not equal in size");
        }
    }
}
