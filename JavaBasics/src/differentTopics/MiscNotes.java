package differentTopics;

public class MiscNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** True executes the first string and false executes the second string **/
		/*string result = false ? "I am true":"I am false";
		System.out.println(result);*/
		
		/** Below give if statements are correct and work fine **/
		 /* if(true) ;
		if(true) {}
		if(true) {;}
		if(true) {;;}
		if(true) ;{};*/
		
		/** Booleans can only have lower case true and false NOT upper case TRUE & FALSE
		 * *Byte value cannot exceed 127 hence cannot have "byte a = 500";
		 * * Int is not a wrapper class Integer is a wrapper class
		 */
		
		int a = 30;
		System.out.println(a=a%3);
		
		int b = 10;
		System.out.println(b=b^3); //(bitwise XOR) (1010 ^ 0011 = 1001)
		System.out.println("b=" +b);
		System.out.println(b=b&3);  //(bitwise AND)  (1001 & 0011 = 0001)
		System.out.println("b=" +b);
		System.out.println(b=b|3);  //(bitwise OR)   (0001 | 0011 = 0011)
		
		/*
		 * Table XOR
		 * 1^1 = 0
		 * 0^0 = 0
		 * 1^0 = 1
		 * 0^1 = 1 
		 * 
		 * Table AND
		 * 1&1 = 1
		 * 0&0 = 0
		 * 1&0 = 0
		 * 0&1 = 0 
		 * 
		 * Table OR
		 * 1|1 = 1
		 * 0|0 = 0
		 * 1|0 = 1
		 * 0|1 = 1
		 * 
		 *  Table COMPLIMENT
		 *  ~1 =0 
		 *  ~0 =1
		 * 
		 */
		
		/*Shift Operator---DOUBT*/
		System.out.println("b=" +b);
		System.out.println(b<<3);   //(left shift)    (0011 << 3 = )
	}

}
