package typecast2;

public class TypeCasting {

public static void main(String[] args) {
	char a ='a';
	System.out.println("implicit typecasting");
	System.out.println("value of a:" +a);
	int i=a;
	System.out.println("value of i:" +i);
	long l=i;
	System.out.println("value of l:" +l);
	double d=l;
	System.out.println("value of d:" +d);
	System.out.println("\n");
	System.out.println("explicit typecasting");
	double g=65.5;
	int b=(int)g;
	System.out.println("value of g:" +g);
	System.out.println("value of b:" +b);

}
}
