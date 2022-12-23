import java.util.*;
import java.text.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#,###.00");

		System.out.print("How many product list in stock : ");
		int size = scanner.nextInt();
		System.out.println();

		Product[] productList = new Product[size];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id : ");
			productList[i].setID(scanner.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scanner.nextInt());
			while (productList[i].getUnit() <= 0) {
				System.out.print("Input product Unit : ");
				productList[i].setUnit(scanner.nextInt());
			}

			System.out.println();

		}

		System.out.println("---------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("---------------------------------");
		
		int countlow = 0;
		int countnormal = 0;
		int counthigh = 0;
		for (Product prd : productList) {

			if (prd.checkStock(prd.getUnit()).equalsIgnoreCase("LOW")) {
				System.out.println(">> " + prd.getID() + " has " + prd.getUnit() + " units");
				countlow++;

			}
		}
		if (countlow == 0) {
			System.out.println("There's no low products");
			System.out.println();
			
			
		}
		
		System.out.println("---------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("---------------------------------");

		for (Product prd_1 : productList) {

			if (prd_1.checkStock(prd_1.getUnit()).equalsIgnoreCase("NORMAL")) {

				System.out.println(">> " + prd_1.getID() + " has " + prd_1.getUnit() + " units");
				countnormal++;

			} 

		}
		if (countnormal == 0) {
			System.out.println("There's no normal products");
		 	System.out.println();
					
		}
		System.out.println("---------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("---------------------------------");

		for (Product prd_2 : productList) {

			if (prd_2.checkStock(prd_2.getUnit()).equalsIgnoreCase("HIGH")) {

				System.out.println(">> " + prd_2.getID() + " has " + prd_2.getUnit() + " units");

				counthigh++;
			} 
		}
		if (counthigh == 0) {
			System.out.println("There's no high products");
			System.out.println();
		}
	}

}
