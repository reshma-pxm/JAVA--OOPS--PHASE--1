package typecast2;

import java.util.Scanner;

public class TypeCast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
Scanner sc = new Scanner(System.in);
//System.out.println("enter roll_no:");//by def rollno. is string==16+4=164
String roll_no=sc.nextLine();
System.out.println(Integer.parseInt(roll_no)+4);//coverting str-int,16+4=20
	}

}
