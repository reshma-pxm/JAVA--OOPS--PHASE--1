
public class MethodFloatReturn {
	public float mulNum(float d,float e) {
		float x= d*e;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFloatReturn obj =new MethodFloatReturn();
		float ans=obj.mulNum(6.75f, 2.34f);
		System.out.println("multiplication:"+ans);
	}

}
