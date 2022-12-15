import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		int[] number = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			number[i] = scan.nextInt();
		}

		int totalNumber = sumOfPos(number);
		System.out.println("Summation of positive number is " + totalNumber);
	}
	
	public static int sumOfPos(int[] num) {
		int sum =0;
		for(int _num : num) {
			sum+=_num;
		}
		return sum;
	}

}
