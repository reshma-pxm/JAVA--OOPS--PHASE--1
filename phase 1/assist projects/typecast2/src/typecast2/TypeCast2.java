package typecast2;


	import java.util.Scanner;

	public class TypeCast2 {
		public int numMax() {
			Scanner sc=new Scanner(System.in);
			int num1,num2;
			
			System.out.println("num1 and num2:" );
			num1=sc.nextInt();
			num2=sc.nextInt();
			if (num1 > num2) {
				return num1;
		}
			else 	{	
			return num2;
			}
		}	
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			TypeCast2 df=new TypeCast2();
	int result=df.numMax();
	System.out.println("max numberis :"+result);
		}
		
	}


