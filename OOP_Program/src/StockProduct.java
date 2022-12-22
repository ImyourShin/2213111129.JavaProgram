import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product[] productList = new Product[4];
		for(int i = 0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id : ");
			productList[i].setID(scanner.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scanner.nextInt());
			System.out.print("Input product Price : ");
			productList[i].setPrice(scanner.nextInt());
			
			
			
		}
	}

}
