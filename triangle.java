package lecture01;

import java.util.Scanner;

public class triangle {
		
	   
	   static void triangleRU(int n) {
		   
		 /*  for(int i=0; i<n; i++) {
			   for(int j=1; j<=i; j++) {
				   System.out.print(" ");
			   }
			   
			   for(int j=0; j<n-i; j++) {
				   System.out.print("*");
			   }
		   
		   System.out.println();
		   }
		   */
		   

		   for(int i=1; i<=n; i++) {
			   for(int j=1; j<=i-1; j++) {
				   System.out.print(" ");
			   }
			   for(int j=1; j<=n-i+1; j++) {
				   System.out.print("*");
			   }
			   
			 System.out.println();  
			   
		   }
		   
		   
		   
	   }
	   
	   
  
   
   
   public static void main(String args[]) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("�� ���� �ﰢ���� ����ڽ��ϱ�?");
	   
	   int n;
	   
	   do {
		   System.out.print("�� ��? :");
		   n = scanner.nextInt();
	   }while(n<=0);
	   
	   
	   triangleRU(n);
	   
	   
	   scanner.close();
   }



	
}