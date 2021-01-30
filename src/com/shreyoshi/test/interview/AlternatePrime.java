package com.shreyoshi.test.interview;

public class AlternatePrime {

	public static void main(String[] args) {
		
		int[] arr  = new int[] {2,4,3,6,5,7,23,24,35,36,11,13,17,19};
		
		System.out.println(alternate(arr));
	}
	
	static int[] alternate(int[] arr) {
		
		int count=0;
		int[] resultArr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=2;j<=arr[i]/2;i++) {
				
				if(arr[i] % j == 0) {
					
					System.out.println("non prime:" +arr[i]);
				}
				else {
					
					if(resultArr.length == 0) {
						
						resultArr[i] = arr[i];
					} 
					else {
						
						if(count%2==0) {
							
							resultArr[i] = arr[i];
						}
					}
					count++;					
				}
			}
		}
		return resultArr;
	}
}
