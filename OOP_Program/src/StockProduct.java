import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#,###.00");
		Product[] productList = new Product[4];
		for(int i = 0;i<productList.length;i++) {	
			productList[i] = new Product();
			
			System.out.print("Input product Id : ");
			productList[i].setID(scanner.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scanner.nextInt());

		while(productList[i].getUnit()<=0) {
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scanner.nextInt());		
		}
		System.out.print("Input product Price : ");
		productList[i].setPrice(scanner.nextDouble());
		while(productList[i].getPrice()<=0) {
			System.out.print("Input product Price : ");
			productList[i].setPrice(scanner.nextDouble());
			System.out.println();
		}
			System.out.println();
								
		}
		double total = 0;

		System.out.println("---------------------------------");
		for(int i = 0 ; i<productList.length;i++) {
			System.out.println("Product ID : "+productList[i].getID()+", Total Price = " + productList[i].calculate() );
			total += productList[i].calculate();
		}
		System.out.println("---------------------------------");		
		System.out.println("Total price of all products is "+format.format(total)+"baht.");
	}

}
