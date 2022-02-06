
public class CallByValue {
int val =15;//call by value	(actual value)
int callMethod(int val) {
	val=val*10/100;
	return (val);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallByValue cm=new CallByValue();
System.out.println("Before operation value of data is "+cm.val);
cm.callMethod(10);//( changes made doesn't affect actual value)
System.out.println("after operation value of data is "+cm.val);
	}

}
