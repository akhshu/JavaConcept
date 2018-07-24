package javaLogics;
// search an number in an infinite sorted array of integer


public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,35,50,73,84,90,113,767,989,999};
		
		int found = search(arr,113);
		if(found == -1)
			System.out.println("element not found ");
		System.out.println("element found at : " + found);
	}
	
	// create search function 
	public static int search(int arr[],int key){
		// find out the right node of the binary tree 
		int l = 0;
		int r = 1;
		int val = arr[0];
		while(val < key){
			l=r;
			r= r*2;
			val = arr[r];
		}
		
		return binarySearch(arr,l,r,key);
	}
	
	// binary search method 
	private static int binarySearch(int[] arr, int l, int r, int key) {
		if(r>l){
			int mid = l + (r-l)/2;
			if(arr[mid] == key){
				return mid;
			}
			else if(arr[mid]< key){
				return binarySearch(arr,mid+1,r,key);
			}
			return binarySearch(arr,l,mid-1,key);
			
		}
		
		return -1;
	}
	

}
