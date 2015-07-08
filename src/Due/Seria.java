package Due;

import java.io.*;

public class Seria {

	   public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.name = "Konrad Herba";
	      e.address = "Gdzie psy dupami szczekaja";
	      e.SSN = 666;
	      e.number = 666;
	      e.mailCheck();
	      
	      /*************************************
	       *  				Serialize
	       *************************************/
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream("C:\\Users\\khe\\workspace-escercizi\\tmp\\employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.println("Serialized data is saved in C:\\Users\\khe\\workspace-escercizi\\tmp\\employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	          
	      }
	      
	      e.address = "Szerokie laki";
	      e.mailCheck();
	      
	      /************************************* 
	       *            De-Serialize
	       **************************************/
	      
	      // zerujemy pracownika
	      e = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("C:\\Users\\khe\\workspace-escercizi\\tmp\\employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
	      
	      //Sprawdzamy czy ma stary adres
	      e.mailCheck();
	      }
}
