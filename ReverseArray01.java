package lecture01;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray01 {
	
	
	/*
	        [5, 10, 73, 2, -5, 42] 

			a[0]와 a[5]를 교환합니다.
			[42, 10, 73, 2, -5, 5]

			a[1]와 a[4]를 교환합니다.
			[42, -5, 73, 2, 10, 5]

			a[2]와 a[3]를 교환합니다.
			[42, -5, 2, 73, 10, 5]

			역순 정렬을 마쳤습니다.
	
	*/
	
	

//	public static void reverse(int[] a) {
//	
//		for(int i=0; i<a.length/2; i++) {
//			
//			System.out.println("a["+i+"]와 a["+(a.length-1-i)+"]를 교환합니다.");
//			
//			int temp = 0;
//			temp = a[i];
//			a[i] =a[a.length-1-i];
//			a[a.length-1-i] = temp;
//		
//			print(a);		
//		}
//	
//		
//	}
//	
//	
//	public static void print(int[] a) {
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//	}
	
	
	static void swap(int[] a, int idx1, int idx2) {
		int temp= a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
		
	}
	

	
    static void reverse(int[] a) {
    	
    	System.out.println(Arrays.toString(a));
    	System.out.println();
    	
    	for(int i=0; i<a.length/2; i++) {
    		
    		System.out.println("a["+i+"]와 a["+(a.length-1-i)+"]를 교환합니다.");
    		
    		swap(a, i, a.length-1-i);
    		
    		System.out.println(Arrays.toString(a));
    		System.out.println();
    	}
    }
	
	
    
    static int sumOf(int[] a) {
    	
    	int sum =0;
    	
    	for(int i=0; i<a.length; i++) {
    		sum+=a[i];
    	}
    	return sum;
    }
    
    
	
	public static void main(String[] args) {
		
		//int[] x= {5,10,73,2,-5,42};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소수는 :");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("a["+i+"] : ");
			x[i] = scanner.nextInt();
		}
		
	
		//print(a);
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	
		System.out.println("배열의 합은 =" + sumOf(x));
	
		

	}

}
