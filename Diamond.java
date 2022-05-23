package lecture01;

import java.util.Scanner;

public class Diamond {
	
	static void diamond(int n) {//짝수를 입력해도 짝수보다 하나 작은 단으로 다이아몬드 출력
		
		n= (n-1)/2+1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++) {
				System.out.print("*");
			}
			//for(int j=1; j<=n-i; j++) {
			//	System.out.print(" ");
			//}
		  System.out.println();	
		}
		
		for(int i=1; i<=n-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(n-i)*2-1; j++) {
				System.out.print("*");
			}
		//	for(int j=1; j<=i; j++) {
			//	System.out.print(" ");
			//}
			System.out.println();
		}
		
		
		
	}
	
	
	static void diamond2(int n) { //홀수만 입력
		int lineCount =n;
		int spaceCount = lineCount/2+1;
		int starCount = 1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
			
			if(i <lineCount/2) { //마름모의 윗부분이라면
				spaceCount -=1;
				starCount +=2;
			}
			else {
				spaceCount +=1;
				starCount -=2;
			}
		   
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n=0;
		
		do {
			System.out.print("n단의 마름모 : ");
			
			n = scanner.nextInt();
			
			
		}while(n<=0);
		
		
		//diamond(n);
		diamond2(n);
		
	}	
	
}
