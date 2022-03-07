
public class MethodDoubleReturn {
	public double mulNum(double a,double b) {
		double x=a*b;
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDoubleReturn obj=new MethodDoubleReturn();
		double ans=obj.mulNum(6.75,2.34);
		System.out.println("multiplication:"+ans);
	}

}
