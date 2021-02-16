package pack;
import java.util.Scanner;

public class Hello {
	//undeclared instances/fields
	int methodCount;
	String className;
	String userName;
	
	//constructor method
	public Hello(int count, String NameOfClass, String yourName){
		methodCount = count++;
		className = NameOfClass;
		userName = yourName;
	}	
    public Hello() {
		// TODO Auto-generated constructor stub
    	methodCount++;
	}
    public int methodCounter(boolean isRunning) {
    	isRunning = true;
    	if(isRunning == true) {
    		methodCount++;
    	}
    	return methodCount;
    }
public void Message() {
	 
	 //made before Java Data Types and Variables LAB
	 methodCounter(true);
	 Scanner scan = new Scanner(System.in);
	 System.out.println("What is your name? ");
	 String name = scan.nextLine();
	 scan.close();
	
	 //aren't null because it is set in method and resides in the method
	 System.out.println("Value of name: " + name); 
	 System.out.println(); //used to create an empty line in text 
	 
	 System.out.printf("Narrator: " + "Hello %s!\n", name);
	 
	 System.out.println("Narrator: "+ name + ", say hello to the world!");
	 System.out.println(name + ": Hello World!");
	 System.out.println("Narrator: " + name + ", who's an otaku coder!");
	 System.out.println(name + ": You are!");
	//System.out.print(); prints on same line as bottom as
	 //long as its between to println() or print() statements
     System.out.print(name + ": Nothing like enjoying delicious black coffee!");
     System.out.println(); //used to create an empty line in text 
     System.out.print(name + "Earth's caffinated bean juice!");
     System.out.println(" The elixir to coding Valhala!");
	
     System.out.printf("Narrator: " + "Goodbye %s!\n", name);
     System.out.printf(name + " : Goodbye %s!\n",name);
     System.out.printf(name + ": Pfftt!...No wait.. Goodbye Narrator hehe..");
   //the above code has been made before Java Data Types and Variables LAB
 }
}
