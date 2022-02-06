
public class MethodStringReturn {
public String greetings(String a,String b) {
	String s = a+b;
	return s;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodStringReturn obj=new MethodStringReturn();
		String msg=obj.greetings("Good Morning!", "How are you doing??");
		System.out.println("Greetings:"+msg);
	}

}
