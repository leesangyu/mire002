package java_basic;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann =new Scanner(System.in);

//		�����Է� : scann.nextInt()
//		�Ǽ��Է� : scann.nextFloat()
		
		System.out.print("������ �Է� :");
		int inputInt = scann.nextInt();
		
		System.out.print("�Ǽ��� �Է� :");
		float inputFloat = scann.nextFloat();
		
		System.out.println("�Է��� ���� :"+inputInt);
		System.out.println("�Է��� �Ǽ� :"+inputFloat);
	}

}
