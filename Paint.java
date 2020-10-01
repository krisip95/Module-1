package edu.smg;
import java.util.Scanner;

public class Paint

{
public static void main(String[] args){
    //declares variables
    double length;
    double width;
    double height;
    double ceilingArea;
    double wallsArea;

    int fiveLiterBucket = 15;
    int oneLiterBucket = 4;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the length of the room in feet: ");
    length = input.nextDouble();

    System.out.println("Please enter the width of the room in feet: ");
    width = input.nextDouble();

    System.out.println("And lastly, please enter the height of the room in feet: ");
    height = input.nextDouble();

    ceilingArea = length * width;
    wallsArea = (2 * (width * height) + (2 * (length * height)));
    double totalArea = ceilingArea + wallsArea;

    for(int numOfBuckets = 0; totalArea > 1; numOfBuckets++){
        totalArea = totalArea - (totalArea / 15);
        System.out.println("You will need " + numOfBuckets + " buckets.");
        continue;

    }
}
}
