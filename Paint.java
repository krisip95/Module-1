package edu.smg;
import java.util.Scanner;

public class Paint

{
public static void main(String[] args){
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
    int totalArea = (int) Math.ceil(ceilingArea + wallsArea);

    
        int numOfBuckets = totalArea / 140;
        int smallBuckets = 0;
        int restArea = totalArea % 140;
        if(restArea > 90){
        	numOfBuckets++;
        }else{
        	smallBuckets = restArea / 30;
        	restArea %= 30;
        	if(restArea != 0){
        		smallBuckets++;
        	}
        }
        System.out.println("You will need " + numOfBuckets + "big buckets and " + smallBuckets + "small buckets");
    
}
}
