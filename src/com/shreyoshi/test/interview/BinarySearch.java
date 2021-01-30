package com.shreyoshi.test.interview;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {-5, 8, -9, 60, 10, -4, 2, 5};
		System.out.println("Original array is:: "+Arrays.toString(arr));
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("Sorted array is:: "+Arrays.toString(arr));
		System.out.println();
		
		int findEle = 9;
		System.out.println("Element to be searched is:: "+findEle);
		System.out.println();
		
		int lowerLimit=0;
		int upperLimit=arr.length-1;
		int mid = (lowerLimit + upperLimit)/2;
		
		while(lowerLimit<=upperLimit) {
			
			if(findEle == arr[mid]) {
				
				System.out.println(findEle+" found at "+mid+" index");
				break;
			}
			else if(findEle > arr[mid]) {
				
				lowerLimit = mid+1;
				
			}
			else if(findEle < arr[mid]){
				
				upperLimit = mid-1;
			}
			
			mid = (lowerLimit + upperLimit)/2;
		}
		
		if(lowerLimit>upperLimit) {
			
			System.out.println("Element "+findEle+" not found in array");
		}
	}
	
	// Returns index of x if it is present in arr[l.. 
    // r], else return -1 
   /* int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 60; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    }*/ 

}
