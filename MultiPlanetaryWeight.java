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
      double OutputNumber; 
  
      switch (SolarNumber) {
           case 1:
                 OutputNumber = HumanWeight * .91; 
                 System.out.println("Your Weight on Venus will be: " + OutputNumber);
                 break;
           case 2:
                OutputNumber = HumanWeight * .38; 
                 System.out.println("Your Weight on Mercury will be: " + OutputNumber);
                 break;
           case 3:
               OutputNumber = HumanWeight * .38; 
                 System.out.println("Your Weight on Mars will be: " + OutputNumber);
                 break;
           case 4:
             OutputNumber = HumanWeight * 2.36; 
                 System.out.println("Your Weight on Jupiter will be: " + OutputNumber);
                 break;
           case 5 :
             OutputNumber = HumanWeight * .92; 
                 System.out.println("Your Weight on Saturn will be: " + OutputNumber);
                 break;
           case 6 :
              OutputNumber = HumanWeight * .89;  
                 System.out.println("Your Weight on Uranus will be: " + OutputNumber);
                 break;
       
           case 7:
              OutputNumber = HumanWeight * 1.13 ;  
                 System.out.println("Your Weight on Neptune will be: " + OutputNumber);
                 break;
          
           default:
                System.out.println("You have selected a wrong Number!"); 
                break;
        }
     }
     }
