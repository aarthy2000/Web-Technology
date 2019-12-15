import java.rmi.*; 
import java.rmi.server.*;

public class ConverterImpl extends UnicastRemoteObject implements 
ConverterInterface 
{ 
   public ConverterImpl() throws RemoteException 
   { 
       super(); 
   }

   // Convertor Fahrenheit degree to Celsius degree 
   public float f2c( float f ) throws RemoteException 
   { 
       return (float)( (f-32.0)/180.0*100.0 ); 
   }

   // Convert Celsius degree to Fahrenheit degree 
   public float c2f( float c ) throws RemoteException 
   { 
       return (float)( (180.0/100.0)*c+32.0 ); 
   } 
}
