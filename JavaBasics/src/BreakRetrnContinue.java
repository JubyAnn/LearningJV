
public class BreakRetrnContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**Understanding BREAK statement
		 * When the break statement is encountered inside a loop, 
		 * the loop is immediately terminated and the program control resumes at the next statement following the loop **/
		Boolean isValid = true;
		
		while(isValid)
		{
		isValid = false;
		System.out.println("test1");
		if(isValid = true)
		{
			System.out.println("test2");	
		
		break;
		}
		isValid = false;
		System.out.println("test3");
		}
		System.out.println("Line after breaking the loop");
		
	
		/**Continue Statement in Java with example. Continue statement is mostly used inside loops. 
		 * Whenever it is encountered inside a loop, control directly jumps to the beginning of the loop 
		for next iteration, skipping the execution of statements inside loop's body for the current iteration.**/
		
		/**
		 * The return keyword is used to return from a method when its execution is complete. 
		 * When a return statement is reached in a method, the program returns to the code that invoked it.
		 *  A method can return a value or reference type or does not return a value.
		 */
	}

}
