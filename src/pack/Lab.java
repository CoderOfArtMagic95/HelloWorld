package pack;
import java.util.Scanner;

public class Lab {
	
	int mainInt = 1;
	int methodCount;
	String className;
	String userName;
	
	public Lab(int count,String classN, String name) {
		count += mainInt;
		methodCount = count;
		className = classN;
		userName = name;
	}
	public void Read() {
		//increments methodCount --> counts number of method calls
		methodCount++;
		System.out.println("Hello World!");
		System.out.println("Class Name: " + className);
		System.out.println("Method count: " + methodCount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name");
		String name = scan.nextLine();
		int counter = 0;
		String courseName = "Animation 101";
	    Lab create = new Lab(counter,courseName, name);
		scan.close();
	    
		create.Read();

		float f1 = 856.2f;
		int castFloat = (int)f1;
		System.out.println("Float: " + f1 + ", Cast float: " + castFloat);
		
		int x = 35;
		x += 15;
		int y = 70;
		int z = 20;
		
		System.out.println();
		System.out.println("x + y * z = " +(x + y * z)); //Prints 1435 earlier now Prints 1450 after I added 15 to x
		System.out.println("(x + y) * z = " + (x + y) * z); // Prints 2100 earlier now Prints 2400 after I added 15 to x
		System.out.println("x + (y * z) = " + (x + (y * z)));//Prints 1435 earlier now Prints 1450 after I added 15 to x
		
		
		System.out.println("(x++) + y = " + (x++) + y);//Prints 120
		
		z += (x*2) -6;
		System.out.println("z = " + z); //Prints 116
		
		boolean checkValues = (x == y);
		System.out.println("Check Values: "+ checkValues);//Prints false
		
       checkValues = (z > x);
       System.out.println("CheckValues: " + checkValues);//Prints true
       
       //start back here
       System.out.println();
       System.out.println("Checks boolean below");
       System.out.println(x == y);
       System.out.println(x <= y);
       System.out.println(x != y);
       System.out.println(x > y);
       System.out.println(z < (x + y));
       System.out.println(z > (x + 2));
       
       //binary
       byte b1 = 50;
       byte b2 = 19;
       byte b3 = (byte) (b1 & b2);
       
       System.out.println("50 AND 19 is: " + b3);
       
       b3 = (byte) (b2>>>2);// shifts the non-carry value in binary to the right
       System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);
       b3 = (byte) ((~b1)>>2);// compound shifts the carry value in binary to the right
       System.out.println("50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);
       b3 = (byte) ((~b1)>>>2); // compound shifts the non-carry value in binary to the right
       System.out.println("50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
       
       String firstName = "Coco"; //String literal
       String lastName = new String(); //String Object
       String middle;
       middle = "Aqua";
       
       System.out.println();
       System.out.println("firstName:" + firstName);
     /*prints nothing because its not a String literal
      * its a String object and needs to call a method print statements, etc.*/
       System.out.println("lastName:" + lastName);
       
       lastName = "Dracoon";
       //prints because we used a literal to set it
       System.out.println("lastName:" + lastName);
       System.out.println("middle:" + middle);
       
       String fullName = firstName +" "+ middle +" " +lastName;
       System.out.println("fullName:" + fullName);
       
       String aName = "James";
       String bName = "James";
       String cName = "james";
     
       System.out.println();
       System.out.println("True or False?: " + (aName == bName)); //prints true
       System.out.println("True or False?: " + aName.equals(cName)); //prints false
       
       String dream = "This is my future dream as a developer";
       String dream2 = "This is my future dream as an artist";
       
       System.out.println("Does it contains the next statement?: " + dream.contains("This")); //Prints true
       System.out.println("Does it contains the next statement?: " + dream2.contains("developer")); //Prints false
       
       int transform = 22;
       int transform1 = 83;
       int transform2 = 93;
       
       System.out.println();
       System.out.printf("This is %d \n", transform); //using decimal template and print to new line
       System.out.printf("This is %d \n", transform1); //using decimal template and print to new line
       System.out.printf("This is %d \n", transform2); //using decimal template and print to new line
       
       Integer integer; //wrapper had to get rid of new part of wrapper since it has been deprecated
       Integer integer1;
       String string = new String(); //wrapper
       String string1 = new String(); //wrapper
       
       string = "42";
       string1 = "88";
       
       integer = Integer.parseInt(string); //converts int into string
       integer1 = Integer.parseInt(string1); //converts int into string
       
       System.out.println();
       System.out.printf("Conversion 1: "+ integer);
       System.out.println();
       System.out.printf("Conversion 2: "+ integer1);
       
       System.out.println();
       System.out.println();
       b3 = (byte) (b2>>2);
       System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);
       System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
       System.out.println();
       System.out.println();
       b3 = (byte) ((~b1)>>2);
       System.out.println("50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);
       System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
       System.out.println();
       System.out.println();
       b3 = (byte) ((~b1)>>>2);
       System.out.println("50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
       System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
       
	}

}
