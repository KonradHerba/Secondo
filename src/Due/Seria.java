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
	      //Serialize
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
	      
	      e.mailCheck();
	      
	   }
}
