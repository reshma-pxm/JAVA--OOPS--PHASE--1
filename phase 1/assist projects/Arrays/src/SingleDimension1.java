
public class SingleDimension1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= {12,23,34,45,56,67,78};
System.out.println("elements of array[4]:"+array[4]);
System.out.println("length of array: "+array.length);
//for(int i=0;i<array.length;i++) {
	//System.out.println(array[i]);
//}
for(int a:array) {
	System.out.println(a+",");
}
	}

}
