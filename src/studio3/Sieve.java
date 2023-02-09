package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		System.out.print("n: ");
		int n=in.nextInt();

		//int[] array = {value+1};
		int [] array = new int [n];
		//int count= 0;
		
		
		for (int i=0; i<array.length; i++) {
			array[i]=i+1;
			
		System.out.println(array[i]);
		}
		
		for (int j=0; j<array.length; j++)
		{
			for (int k=2; k<array.length && k!=array[j]; k++) {
	
				if (array[j]%k != 0) {
					System.out.println(array[j]);
			}
		}
			
		}
		
		
		// yikes!
//		}
			
			
			
			
			
			
		
			
				
				
				//{ // columns
			//	count = count + 4;
				
				//System.out.println(count);
				//System.out.println(array[i][j] + " ");
			}
		}
		

			//}
				//int count= j+(n/10);
				//array[i][j]= count+1;
			//	
				
			
		

	


//if (array[j] == i) { //checking if random value is equal to possible value
//	
//	result[i-1] = result[i-1] + 1;