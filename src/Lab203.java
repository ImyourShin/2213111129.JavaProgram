import java.util.*;
public class Lab203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a b):");
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int sum = a+b;
	    System.out.println("Sum of two integers:"+sum);
	    int count =0;
	    while(sum!=0){
	    	sum=sum/10;
	    	count = count+1;
	    }
	    
	    System.out.println("Digit number of sum of said two integers:");
	    System.out.println(count);
	    
		

	}

}
