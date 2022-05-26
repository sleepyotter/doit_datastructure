package lecture01;

import java.util.Scanner;

public class ReverseArray {
	
	 static void reverse(int[] a) {
		    
		for(int i=0; i<a.length/2;i++) {
		/*	int temp=0;
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		*/
		 
			swap(a, i, a.length-1-i);
			
		} 
		
		/*System.out.println("요소를 역순으로 정렬했습니다.");
	    
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] : " + a[i]);
		}*/
		
	}

	  static void swap(int[] a, int i, int j) {
			
		  int temp = a[i];
		  a[i] =a[j];
		  a[j]= temp;
	}



	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("요솟수 : ");

		int count = scanner.nextInt();
		
		int[] a = new int[count];
		
		
		for(int i=0; i<count; i++) {
			
			System.out.print("a["+i+"] : ");
			int n = scanner.nextInt();
			
			a[i]=n;
			
		}
		
		reverse(a);
		
		
       System.out.println("요소를 역순으로 정렬했습니다.");
	    
		for(int i=0; i<count; i++) {
			System.out.println("a["+i+"] : " + a[i]);
		}
		
		
	}

   
}
