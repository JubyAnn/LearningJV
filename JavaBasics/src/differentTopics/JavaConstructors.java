package differentTopics;
/*Constructors have same name as class and no return type. 
 * Constructor is called when object is created, All classes have constructors by default If u dont create a class constructor
 * Java creates one for you, However then you are not able to set initial values for object attributes.*/

public class JavaConstructors {

	int x = 7;
	int y = 9;
	
	public JavaConstructors(int j, int k)
	{
		x=j;
		y=k;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConstructors JC = new JavaConstructors(10,5);
		System.out.println("x=" +JC.x);
		System.out.println("y=" +JC.y);
		
		
		
		
	
		
		
		
		
		
		
		
		
			
		

	}

}

