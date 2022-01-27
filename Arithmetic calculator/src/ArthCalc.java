import java.util.Scanner;

public class ArthCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,y,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y:");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter operation");
        ch=sc.nextInt();
        if(ch==1) {
        	 System.out.println("addition:" +(x+y));
        }
        	 else if(ch==2) {
        		 System.out.println("subtraction:"+(x-y));
        	 }
        	 else if(ch==3) {
        		 System.out.println("Multiplication:"+(x*y));
        	 }
        	 else if(ch==4) {
        		 System.out.println("Division:"+(x/y));
	        }
        	 else if(ch==5) {
        		 System.out.println("modulo:"+(x%y));
              }
        	 else {
        		 System.out.println("operation not specified");
        		 
        	 }
	}

}
