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
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	          
	      }
	   }
}
