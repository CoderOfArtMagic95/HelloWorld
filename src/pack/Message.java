package pack;

public class Message {

	public static void main(String[] args) {
		//Updated main method
		//creates a Hello Object with a default constructor
		Hello talk = new Hello();
		/* integer that's set to the methodCount in the Hello Object talk
		 * and is also used in the message Object's constructor below */
		 int mainInt = talk.methodCount;
		/* string literals that will be 
		 * use in the message Object's constructor with parameters or arguments below*/
		String name = talk.userName;
		String className1 = talk.className;
		
		//Object hello
		Hello message = new Hello(mainInt, className1 ,name);
		
		//undeclared boolean variable 
		boolean count;
		//sets count in method call and sets it to true
		message.methodCounter(count = true);
		
		//was here before update
		message.Message();
		//Prints out the values of the constructor with arguments
		System.out.println("Value of className1: "+ name); //are null because it is no longer in use once the method has been called
		System.out.println("Value of name: " + className1); //are null because it is no longer in use once the method has been called
		//prints the methodCounter value
	    System.out.println("Total method calls: " + message.methodCounter(count)); //prints 4 because the constructors are also methods
	}

}
