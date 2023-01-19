import java.util.*;
public class AuthorDemo2 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Author author[] =new Author[4];
		for(int i =0;i<author.length;i++) {
			System.out.println("Information Author "+i+1);
			System.out.println("-------------------------------------------------");
			System.out.print("Input author name  :");
			String name = scanner.nextLine();
			System.out.print("Input author email  :");
			String email = scanner.nextLine();
			System.out.println("-------------------------------------------------");
		}
		System.out.println();
		int i = 1;
		for(Author _author : author) {
			System.out.println(i+". "+_author.getName()+" ("+_author.getEmail()+")");
			i++;
		}

	}

}
