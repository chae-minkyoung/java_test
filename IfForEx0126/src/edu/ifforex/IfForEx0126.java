package edu.ifforex;
import java.util.Scanner;

public class IfForEx0126 {

	public static void main(String[] args) {
//		int a = -7;
//		
//		if (a>0){
//			System.out.printf("a=%d�� ����Դϴ�.\n",a);
//		}
//		else if(a<0){
//			System.out.printf("a=%d�� �����Դϴ�.",a);
//		}
//		else {
//			System.out.printf("a=%d�� 0�Դϴ�.",a);
//		}
		
		//���� �Ǻ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("Java���� �Է�:");
		int score = sc.nextInt();
		
		if(90<=score) {
			if(score>=95){
				System.out.println("�ֿ�� �л�.");
			}
		System.out.printf("A����");
		}
		else if(80<=score) {
			System.out.printf("B����");
		}
		else if(70<=score) {
			System.out.printf("C����");
		}
		else if(60<=score) {
			System.out.printf("D����");
		}
		else 
			System.out.printf("F����.");
		
		
		
		
//		int share = score/10;
//		if(share == 10||share==9) {
//			System.out.printf("A����.");
//		}
//		else if(share == 8) {
//			System.out.printf("B����.");
//		}
//		else if (share == 7) {
//			System.out.printf("C����.");
//		}
//		else if (share==6) {
//			System.out.printf("D����.");
//		}
//		else
//			System.out.printf("F����.");
	}

}


