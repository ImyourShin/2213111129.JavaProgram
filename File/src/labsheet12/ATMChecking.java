package labsheet12;

import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String acountNumber, String password, int money) {
		super(acountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		boolean check = false;
		Scanner file = new Scanner(new File("ATMBookBank.txt"));
		while (file.hasNext()) {
			String id = file.next();
			String pass = file.next();
			int balance = file.nextInt();

			if (id == getID() && pass == getPass() && balance >= money) {
				check = true;
				break;
			}

		}
		file.close();
		return check;
	}

	public void show() throws IOException {
		if (checkBookBank()) {
			System.out.println("\nYou drawing for " + money + ", get");
			int thousand = money / 1000;
			money %= 1000;
			System.out.println("\n1000 = " + money);
			int fivehundred = money / 500;
			money %= 500;
			System.out.println("\n500 = " + money);
			int hundred = money / 1000;
			money %= 100;
			System.out.println("\n100 = " + money);

		}
		else {
			System.out.println("\nSorry, your id or password is wrong, or your amount not enough.");
		}

	}
}