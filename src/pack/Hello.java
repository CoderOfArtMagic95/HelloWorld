package pack;
import java.util.Scanner;

public class Hello {
 public void Message() {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("What is your name? ");
	 String name = scan.nextLine();
	 scan.close();
	 
	 System.out.printf("Narrator: " + "Hello %s!\n", name);
	 
	 System.out.println("Narrator: "+ name + ", say hello to the world!");
	 System.out.println(name + ": Hello World!");
	 System.out.println("Narrator: " + name + ", who's an otaku coder!");
	 System.out.println(name + ": You are!");
	//System.out.print(); prints on same line as bottom as
	 //long as its between to println() or print() statements
     System.out.print(name + ": Nothing like enjoying delicious black coffee!");
     System.out.print("\n  Earth's caffinated bean juice!");
     System.out.println(" The elixir to coding Valhala!");
	
     System.out.printf("Narrator: " + "Goodbye %s!\n", name);
     System.out.printf(name + " : Goodbye %s!\n",name);
     System.out.printf(name + ": Pfftt!...No wait.. Goodbye Narrator hehe..");
 }
}
