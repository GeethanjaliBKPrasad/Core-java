package first.java;

public class Bubblesort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-1);j++) {
				if(arr[j-1]>arr[j]) {  //swap elements
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
					
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {12,8,2,9,24,32,20};
		System.out.println("Array before sort");
		for(int i = 0;i<arr.length;i++) {
			
			System.out.println(arr[i]+" ");
	   }
		System.out.println();
		 
		bubbleSort(arr);{
			
			System.out.println("Array after sort");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");
			}
		}
		
	}

}
