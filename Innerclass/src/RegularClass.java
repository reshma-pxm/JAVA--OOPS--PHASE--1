
public class RegularClass {
	public int a=20;
	private String b="Welcome";
	class Inner{
		public void display() {
			System.out.println("value of a " + a);
			System.out.println("value of b " + b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularClass obj1=new RegularClass();
		RegularClass.Inner obj2=obj1.new Inner();
		obj2.display();
	}

}
