import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();
		System.out.print("Input book title   : ");
		book.setTitle(scanner.nextLine());
		System.out.print("Input book price   : ");
		book.setPrice(scanner.nextFloat());
        System.out.print("Input publish year : ");
        book.setPublishYear(scanner.nextInt());
        System.out.println();
        System.out.println(book);
	}

}
