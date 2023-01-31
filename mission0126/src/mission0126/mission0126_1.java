package mission0126;

import java.util.Scanner;

public class mission0126_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		String major= null;
		byte English=0;
		byte physics=0;
		byte calculus=0;
		String address = null;
		System.out.println("이름을 입력하세요!!");
		name = sc.nextLine();
		System.out.println("학과명을 입력하세요!!");
		major=sc.nextLine();
		System.out.print("영어 점수 입력:");
		English=sc.nextByte();
		System.out.print("물리 점수 입력:");
		physics=sc.nextByte();
		System.out.print("미적분학 점수 입력:");
		calculus=sc.nextByte();
		sc.nextLine();
		System.out.println("주소를 입력하세요!!");
		address=sc.nextLine();
		System.out.printf("이름=%s, ",name);
		System.out.printf("학과명=%s\n",major);
		System.out.printf("영어=%d, ",English);
		System.out.printf("물리학=%d, ",physics);
		System.out.printf("미적분학=%d\n",calculus);
		System.out.printf("총점=%d, ",English+physics+calculus);
		System.out.printf("평균=%.1f\n",(float)((English+physics+calculus)/3));
		System.out.printf("주소=%s",address);
	}
}
