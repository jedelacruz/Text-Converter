package textConverter;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    while(true){
		    Scanner s = new Scanner(System.in);
		    System.out.print("Please type a word: ");
		    String word = s.nextLine();
		
		    System.out.print("Do you want to display the text in (1) capital letters or (2) small letters? ");
		    int choice = s.nextInt();
		
		    if (choice == 1) {
		        // Display the text in capital letters
		        System.out.println(word.toUpperCase());
		    } 
		    else if (choice == 2) {
		        // Display the text in small letters
		        System.out.println(word.toLowerCase());
		    } 
		    else {
		        System.out.println("Invalid choice!");
		    }
		    System.out.println("Do you want to try again? y/n");
		    String repeat = s.next();
		    if(!repeat.equalsIgnoreCase("y"))
		        break;
	    }
	}

}
