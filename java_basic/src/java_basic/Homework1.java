package java_basic;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		int putNum = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		System.out.println("���ڸ� �Է��ϼ���. :");
		putNum = scann.nextInt();

		num1 = putNum/1000;
	
		num2 = putNum/100 - putNum/1000*10;

		num3 = putNum/10 - putNum/100*10;
	
		num4 = putNum - putNum/10*10;
		
		System.out.println("ù��° ���ڴ� : ");
		System.out.println(num1);
		System.out.println("�ι�° ���ڴ� : ");
		System.out.println(num2);
		System.out.println("����° ���ڴ� : ");
		System.out.println(num3);
		System.out.println("�׹�° ���ڴ� : ");
		System.out.println(num4);
	}

}
