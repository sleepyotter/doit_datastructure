package lecture01;

import java.util.Scanner;

public class StarPira {
	
	static void spira(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=n-i; j++) { //뒷부분은 공백이므로 없어도 됨
				System.out.print(" ");
			}
		  System.out.println();	
		}
		
	
	}
	
	
	static void spira3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
		 System.out.println();	
		}
	}

	
	static void spira1(int n) {
		
		int lineCount = n;  //라인 수
		int starCount = 1; //처음 별의 갯수
		//int spaceCount = lineCount/2 +1;  //빈칸의 수  4까지는 가능하나 그 이상의 라인에서는 안 됨
		int spaceCount = lineCount-1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
	     
	     spaceCount -= 1; //빈칸은 라인이 하나 증가할 때 1개 감소
		 starCount += 2; //별은 라인이 하나씩 증가할 때 2개 증가
		
			
		 System.out.println();
		
		}
		
	}
	
	static void npira(int n) {//숫자 피라미드
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
	
	static void npira2(int n) {//숫자 피라미드
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n=0;
		
		do {
			System.out.print("n단의 피라미드 : ");
			
			n = scanner.nextInt();
			
			
		}while(n<=0);
		
		
		//spira(n);
		//spira1(n);
		//spira3(n);
		
		//npira(n);
		npira2(n);
		
	}	
	
}
