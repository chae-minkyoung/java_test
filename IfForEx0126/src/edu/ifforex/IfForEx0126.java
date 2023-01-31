package edu.ifforex;
import java.util.Scanner;

public class IfForEx0126 {

	public static void main(String[] args) {
//		int a = -7;
//		
//		if (a>0){
//			System.out.printf("a=%d는 양수입니다.\n",a);
//		}
//		else if(a<0){
//			System.out.printf("a=%d는 음수입니다.",a);
//		}
//		else {
//			System.out.printf("a=%d는 0입니다.",a);
//		}
		
		//학점 판별 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("Java점수 입력:");
		int score = sc.nextInt();
		
		if(90<=score) {
			if(score>=95){
				System.out.println("최우수 학생.");
			}
		System.out.printf("A학점");
		}
		else if(80<=score) {
			System.out.printf("B학점");
		}
		else if(70<=score) {
			System.out.printf("C학점");
		}
		else if(60<=score) {
			System.out.printf("D학점");
		}
		else 
			System.out.printf("F학점.");
		
		
		
		
//		int share = score/10;
//		if(share == 10||share==9) {
//			System.out.printf("A학점.");
//		}
//		else if(share == 8) {
//			System.out.printf("B학점.");
//		}
//		else if (share == 7) {
//			System.out.printf("C학점.");
//		}
//		else if (share==6) {
//			System.out.printf("D학점.");
//		}
//		else
//			System.out.printf("F학점.");
	}

}


