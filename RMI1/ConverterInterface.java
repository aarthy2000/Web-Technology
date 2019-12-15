import java.rmi.*; 
public interface ConverterInterface extends java.rmi.Remote 
{ 
    // Convert Fahrenheit degree to Celsius degree 
    public float f2c( float f ) throws RemoteException; 
    // Convert Celsius degree to Fahrenheit degree 
    public float c2f( float c ) throws RemoteException; 
}
