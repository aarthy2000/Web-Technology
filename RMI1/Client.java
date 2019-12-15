import java.rmi.*; 
import java.rmi.Naming; // for Naming.lookup() 
import java.io.*;
import java.util.*;

public class Client 
{ 
public static void main( String args[] ) throws Exception 
{ 
   // Check for hostname argument 
   
   // Call registry for ConverterInterface 
   // To identify a service, we specify an RMI URL. The URL 
   // contains the hostname 
   // on which the service is located, and the logical name of 
   // the service. This 
   // returns a Converterinterface instance, which can then be 
   // used just like a 
   // local object reference. 
   ConverterInterface service = (ConverterInterface)Naming.lookup("rmi://localhost:5000/ConverterInterface" );

   Scanner s = new Scanner(System.in);
   for( ;; ){ 
       System.out.println(); 
       System.out.println 
         ( "1 - Convert Fahrenheit degree to celsius degree" ); 
       System.out.println 
         ( "2 - Convert celsius degree to Fahrenheit degree" ); 
       System.out.println 
         ( "3 - Exit" ); System.out.println(); 
       System.out.print( "Choice: " ); 
       int choice = s.nextInt(); 
       //Integer choice = new Integer( line ); 
       //int value = choice.intValue(); 
       float tempValue;

       switch(choice ) 
       { 
           case 1: 
               System.out.print( "Farenheit degree: " ); 
               
               tempValue = s.nextFloat();

               // Call remote method 
               System.out.println 
                   ( "The equivalent Celsius degree: " 
                   + service.f2c( tempValue ) ); 
               break;

           case 2: 
               System.out.print( "Celsius degree: " ); 
               tempValue = s.nextFloat();

               
               // Call remote method 
               System.out.println 
                   ( "The equivalent Fahrenheit degree: " 
                   + service.c2f( tempValue ) ); 
           break;

           case 3: 
               System.exit(0); 
           default : 
               System.out.println ("Invalid option"); 
           break; 
       } 
   } 
} 
} 
