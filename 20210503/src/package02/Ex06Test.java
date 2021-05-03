package package02;

public class Ex06Test {

	public static void main(String[] args) {
		String str="123.5";
		System.out.println(str+10.5);
		Double d=new Double(str);
		System.out.println(d+10.5);
		System.out.println(d.intValue());
		System.out.println(d.longValue());
		System.out.println(d.floatValue());
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
	}

}
