package java_basic;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		int sum = 0;
		float avg = 0f;
		System.out.print("���� ������ �Է��ϼ���. :");
		kor = scann.nextInt();
		System.out.print("���� ������ �Է��ϼ���. :");
		eng = scann.nextInt();
		System.out.print("���� ������ �Է��ϼ���. :");
		math = scann.nextInt();
		System.out.print("���� ������ �Է��ϼ���. :");
		sci = scann.nextInt();
		
		sum = kor + eng + math + sci;
		avg = sum/4f;
		avg = (int)((avg*100+5)/10)/10f;
		
		
		System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,sum,avg);
	}

}
