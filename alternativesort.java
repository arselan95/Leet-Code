// Java program to print an array in alternate 
// sorted manner 
import java.io.*; 
import java.util.Arrays; 

class AlternativeSort 
{ 
	// Function to print alternate sorted values 
	static void alternateSort(int a[], int n) 
	{ 
		; 

		// Printing the last element of array 
		// first and then first element and then 
		// second last element and then second 
		// element and so on.
		//n is length of array a[]

		int i = 0, j = n-1; 
		while (i < j) { 

		if(i%2!=0)
		{
		b[i]= a[i];
		}
		else{
		b[i]=a[j];
		}

		i++;
		j--;
	
		} 
	
		// If the total element in array is odd 
		// then print the last middle element. 
		if (n % 2 != 0) 
			b[n-1]=a[i];

			return b; 
	} 

} 
