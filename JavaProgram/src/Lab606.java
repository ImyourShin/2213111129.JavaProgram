import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
      int[] nums = {25, 78, 41, 22, 36, 85,37};

      int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
      while(checkIndex(nums ,indexOfArray)) {
    	  indexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
    	  
      }
      
      
      JOptionPane.showMessageDialog(null, "Current data, nums["+indexOfArray+"] is " +currentData(nums, indexOfArray)
                                          +((prevData(nums,indexOfArray)==0)?"\nNo previos data": "\nPrevious data, num["+(indexOfArray-1)+"] is "+prevData(nums,indexOfArray))
                                          +((nextData(nums,indexOfArray)==0)?"\nNo next data": "\nNext data, num["+(indexOfArray+1)+"] is "+nextData(nums,indexOfArray)));
	}
	
	public static boolean checkIndex(int[] nums , int index) {
		return ((index <0)||(index>(nums.length-1))?true:false);
	  
	    	
	    }
		
	public static int currentData (int[]nums , int index ) {
		return nums[index];
		
	}
	public static int prevData (int[]nums , int index ) {
		return (index - 1 < 0)?0:nums[index-1];
		
	}
	public static int nextData (int[]nums , int index ) {
		return (index +1 >nums.length-1)?0:nums[index+1];
		
	}
}
	
	
	
	
	


