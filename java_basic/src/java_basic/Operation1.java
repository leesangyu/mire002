package java_basic;

import java.util.Scanner;

public class Operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scann = new Scanner(System.in);
		int firstInt = 0;
		int secondInt = 0;
		float sum = 0f;
		float minus = 0f;
		float multi = 0f;
		float div = 0f;
		int mock = 0;
		int namuji = 0;
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		firstInt = scann.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		secondInt = scann.nextInt();
		
		sum = firstInt + secondInt;
		minus = firstInt - secondInt;
		multi = firstInt * secondInt;
		div = firstInt / (float)secondInt;
		
		mock = secondInt / firstInt;
		namuji = secondInt % firstInt;
		
		System.out.println("ù��° ���� : "+firstInt);
		System.out.println("�ι�° ���� : "+secondInt);
		System.out.println("���ϱ� : "+sum);
		System.out.println("���� : "+minus);
		System.out.println("���ϱ� : "+multi);
		System.out.println("������ : "+div);
		System.out.println();
		System.out.println("�� : "+mock);
		System.out.println("������ : "+namuji);
		
		
		
		
	}

}
