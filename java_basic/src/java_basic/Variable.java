package java_basic;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		
		b =Byte.MAX_VALUE;
		s =Short.MAX_VALUE;
		i =Integer.MAX_VALUE;
		l =Long.MAX_VALUE;
		str = "\"�ȳ��ϼ���.\"\t\n�ݰ����ϴ�.";
		c = 'A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(c);
		System.out.println("���� : " + c);
		System.out.println("���� : " + (int)c);
		System.out.println(str);
		
	}

}
