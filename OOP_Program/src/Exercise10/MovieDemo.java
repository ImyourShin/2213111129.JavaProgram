package Exercise10;
import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//input movie's information
		System.out.print("Input movie id   : ");
		String id = scanner.nextLine();
		System.out.print("Input movie name :");
		String name = scanner.nextLine();
		
		System.out.println();
		
		//input director's information
		System.out.print("Input director name   :");
		String directorName = scanner.nextLine();
		System.out.print("Input director email  : ");
		String email = scanner.nextLine();
		System.out.print("Input director gender :");
		char gender = scanner.next().charAt(0);
		
		while(!(gender+"").equalsIgnoreCase("M") && (!(gender+"").equalsIgnoreCase("F"))) {
			System.out.print("Input director gender, again :");
			gender = scanner.next().charAt(0);
			
		}
		
		System.out.println();
		System.out.print("Input movie theater no. :");
		int theaterNo = scanner.nextInt();
		while(theaterNo<=1 ||theaterNo>=15) {
			System.out.print("Pleae input 1 - 15 only :");
			theaterNo = scanner.nextInt();
		}
		
        Movie movie = new Movie()
	}

}
