package package02;

public class Ex07Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ڽ�
		String str = "100";
		Integer i1=Integer.parseInt(str);
		Integer i2=new Integer(str);
		Integer i3=Integer.valueOf(str);
		
		//��ڽ� 
		int ii1=i1;
		int ii2= i1.intValue();
		System.out.println(ii1);
		System.out.println(ii2);
		String str1="true";
		Boolean b=Boolean.parseBoolean(str1);
		if(b)
		{
			System.out.println("�ο� Ÿ������ ��ȯ");
			
		}
		
		
		
		
	}

}
