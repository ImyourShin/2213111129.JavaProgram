import java.util.*;
import java.text.DecimalFormat;
public class Lab602 {
	static double sum = 0;
	static double averageNumber =0;
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		 DecimalFormat frm = new  DecimalFormat("#.00");
       
		double[] inputScore = new double[5];
		for(int i = 0 ;i<inputScore.length;i++) {
			System.out.print("Input score of student " +(i+1) +" : ");
			inputScore[i] = scan.nextDouble();
			sum+= inputScore[i];
		}
		System.out.println();
		averageNumber = sum /(inputScore.length);
		System.out.println("Average of " + inputScore.length+ " student is " + frm.format(averageNumber));
		for(int i =0 ;i<inputScore.length;i++) {
			if(inputScore[i]>averageNumber) {
				System.out.println("Student " + (i+1)+" ("+ frm.format(inputScore[i])+")");
			}
		}
		
	}

}
