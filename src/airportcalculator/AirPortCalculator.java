
package airportcalculator;

import java.util.Scanner;


public class AirPortCalculator {

   
    public static void main(String[] args) {
     //This program to calculate the excess weight for bags of passenger  and calculate how much have they pay
        
          Scanner input = new Scanner(System.in);
     
     char passengerclass;
     double bagweight; 
     double   excessweight;
     double charge =0;
     int numofpassenger;
     int numberofgroubs;
     
     System.out.println(" enter number of groups");
      numberofgroubs=input.nextInt();
      
      for(int groupscounter=1 ; groupscounter <= numberofgroubs ;groupscounter++  )
      {
         System.out.println("enter numbers of passengers for groub number " + groupscounter);
         numofpassenger = input.nextInt();

    
     for(int counter = 1 ; counter <=numofpassenger  ;counter++ )
     {
         
        System.out.println(" enter the passanger class -'A', 'B', or 'C'- for passenger number" +counter);
        passengerclass=input.next().charAt(0);

        System.out.println("enter bag weight");
         bagweight=input.nextDouble();
        
         switch(passengerclass)
         {
           case 'c':
           case 'C':
                if(bagweight>30)
                {
                     excessweight = bagweight - 30;
                     charge =excessweight * 10;
                }
                break;
                
           case 'b':
           case 'B':
               if(bagweight>25)
               {
                   excessweight = bagweight-25;
                   charge = excessweight * 10;
               }   
               break;
               
           case 'a':
           case 'A':
               if(bagweight>20)
               {
                   excessweight = bagweight-20;
                   charge = excessweight * 10;
               }   
               break; 
               
           default:
                System.out.println("invalid input");
                
      }
      System.out.println("you have to pay " + charge + " $");
      
     } 
      
      
      } 
      
      
    }
    
}
