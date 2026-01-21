package Javatrainings;

import java.util.Arrays;

public class Activity2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 77, 10, 54, -11, 10};
		
		System.out.println("Original Array: " + Arrays.toString(numbers));
		
		int searchnum = 10;
		int fixedsum = 30;
		
		System.out.println("Result: " + result(numbers, searchnum, fixedsum));
	}

	private static boolean result(int[] number, int searchnum, int fixedsum) {
		// TODO Auto-generated method stub
		int temp_sum=0;
		for(int num : number) {
		if (num == searchnum) {
            
            temp_sum += searchnum;
        }

        
		if (temp_sum > fixedsum) {
            break;
		}
	}
	
	
	return temp_sum == fixedsum;
	}

}
/*

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}
	
*/