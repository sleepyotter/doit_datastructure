package lecture01;

public class Gugu {

	public static void main(String[] args) {
		/*
		for(int i=1; i<=3; i++) {
			for(int j=2; j<=4; j++) {
				System.out.print(j +"*"+ i +"=" +j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println();

		
		for(int i=1; i<=3; i++) {
			for(int j=5; j<=7; j++) {
				System.out.print(j +"*"+ i +"=" +j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	   System.out.println();

		
		for(int i=1; i<=3; i++) {
			for(int j=8; j<=9; j++) {
				System.out.print(j +"*"+ i +"=" +j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
	}*/
	
   for(int i=1; i<=9; i++) {
	   for(int j=1; j<=3; j++) {
		   int x=j+1+(i-1)/3*3;  //i=1,2,3일 때 x=2,3,4 / i=4,5,6일 때 x=5,6,7 / i=7,8일 때 x=8,9 
		   int y=i%3==0?3:i%3;   //i=1,4,7일 때 y=1 / i=2,5,8일 때 y=2; i=3,6,9일 때 y=3
		   
		   
		   System.out.print(x+"*"+ y +"=" +x*y);
		   System.out.print("\t");
		   
		   if(x==9) {
			   break;
		   }
		
	   }
	   
	   System.out.println();
	   
	   if(i%3==0) {
		   System.out.println();
	   }
   }
		
		
		
	}	

}
