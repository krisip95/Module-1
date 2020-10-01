package edu.smg;

import java.util.Scanner;
public class MultiPlanetaryWeight
{
  public static void main(String args[])
    {
   
      Scanner input = new Scanner(System.in);
      System.out.print("Please Enter Your Weight on Earth in Lbs:  ");
       double HumanWeight = input.nextDouble();
  
  
      System.out.print("Choose a Location in our Solar System: \n 1. Venus \n 2. Mercury \n 3. Mars \n 4. Jupiter \n 5. Saturn \n 6. Uranus \n 7. Neptune \n  Please Select 1 from the following (1-7):"); 
      Scanner kbReader=new Scanner(System.in);
      int SolarNumber=kbReader.nextInt( );
      double OutputNumber; // outnumber will be the output number that the program will calculate
  
      switch (SolarNumber) {
           case 1:
                 OutputNumber = HumanWeight * .91; // this case will calculate venus weight
                 System.out.println("Your Weight on Venus will be: " + OutputNumber);
                 break;
           case 2:
                OutputNumber = HumanWeight * .38; // this case will calculate Mercury weight
                 System.out.println("Your Weight on Mercury will be: " + OutputNumber);
                 break;
           case 3:
               OutputNumber = HumanWeight * .38;  // this case will calculate mars weight
                 System.out.println("Your Weight on Mars will be: " + OutputNumber);
                 break;
           case 4:
             OutputNumber = HumanWeight * 2.36;  // this case will calculate Jupiter weight
                 System.out.println("Your Weight on Jupiter will be: " + OutputNumber);
                 break;
           case 5 :
             OutputNumber = HumanWeight * .92;  // this case will calculate saturn weight
                 System.out.println("Your Weight on Saturn will be: " + OutputNumber);
                 break;
           case 6 :
              OutputNumber = HumanWeight * .89;  // this case will calculate Uranus weight
                 System.out.println("Your Weight on Uranus will be: " + OutputNumber);
                 break;
       
           case 7:
              OutputNumber = HumanWeight * 1.13 ;  // this case will calculate Neptune weight
                 System.out.println("Your Weight on Neptune will be: " + OutputNumber);
                 break;
          
           default:
                System.out.println("You have selected a wrong Number!"); // this will default to an error if a wrong number selected
                break;
        }
     }
     }