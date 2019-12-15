import java.rmi.*; 
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server 
{ 
public static void main( String args[] ) throws Exception 
{ 
     
    try{ 
        // Create an instance of the ConverterServer 
        ConverterImpl svr = new ConverterImpl();
	LocateRegistry.createRegistry(1910); 
        // then bind it with the rmi registry 
	//Naming.rebind("rmi://localhost:5000/sonoo",stub);
        Naming.rebind ( "rmi://localhost:5000/ConverterInterface", svr ); 
        System.out.println ("Service bound...."); 
    } 
    catch( Exception e ) 
    { System.out.println( "Server Failed: " + e ); } 
} 
} 
