import java.util.*;
public class AuthorDemo1 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input author name   : ");
		String name = scanner.nextLine(); 
		System.out.print("Input author email  : ");
		String email = scanner.nextLine();
		System.out.print("Input author gender : ");
        char gender = scanner.next().charAt(0);
        System.out.println();
        
        Author author = new Author(name,email,gender);
        System.out.println(author);
        
	}

}
