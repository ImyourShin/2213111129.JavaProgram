import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separate by a space.\n:");
		String fullname = scan.nextLine();
		String[] firstName = fullname.split(" ");
		System.out.println(abbreviatName(fullname) + firstName[0]);
 
	}
	public static String abbreviatName(String fullname) {
		String firstLetter = "";
		for(int i = 0; i<fullname.length();i++) {
			if(fullname.charAt(i)== ' ') {
				firstLetter = firstLetter + fullname.charAt(i+1);
				firstLetter = firstLetter +'.';
				firstLetter = firstLetter.toUpperCase();
			
				
			}
			
		}
		 return firstLetter;
		
	}

}
