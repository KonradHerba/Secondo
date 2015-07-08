package Due;

public class Employee implements java.io.Serializable
{
	public String name;
	public String address;
	//to pole nie jest serializowalne
	public transient int SSN;
	public int number;
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + name
                           + " " + address);
	}
}