package string;

/*
 * toString() is an inbuilt method in Java which is used to return the String representation of an Object
 * All Java class extend Object class by default therefore every class inherits this method when creating a class it 
 * is best practice to override this method.
 *  Parameters: The method does not accept any parameters. 
 * Return Value:The method returns the string object of the particular Integer value.
 */

public class StringMethods {
	
	int roll;
	String name;
	
	StringMethods(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	
	public String toString()  /*Remove this and then run code first it will print object value*/
	{
		return roll + " " +name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMethods sm = new StringMethods(10,"Shweta");
		StringMethods sm1 = new StringMethods(20,"Tina");
		
		//System.out.println(sm.name + " "+ sm.roll);
		//System.out.println(sm1.name + " "+ sm1.roll);
		
		//System.out.println(sm); 
		/****prints the hashcode values of the objects 
		but we want to print the values of these objects. 
		 * Since java compiler internally calls toString() method, 
		overriding this method will return the specified values.*** hence created a toString method in class*/
		
		System.out.println(sm);
		System.out.println(sm1.toString());
		
		}

}
