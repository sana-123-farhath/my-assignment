package week3.day3;

import java.util.Arrays;

public class MissElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numInput =  {1,4,5,2,8,6,7,10};
		
		Arrays.sort(numInput);
		
		for (int i=1; i<numInput.length;i++) {
			if (i!=numInput[i-1]) {
				System.out.println(i);
				break;
			}
			
		}
		
		

	}


	}


