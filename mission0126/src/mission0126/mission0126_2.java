package mission0126;

import java.util.Scanner;
public class mission0126_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year=0;
		System.out.print("�⵵�� �Է��ϼ���.:");
		year=sc.nextInt();
		if (year%4==0&&year%100!=0||year%400==0) {
			System.out.printf("%d�� �����Դϴ�.",year);
		}
		else 
			System.out.printf("%d�� ������ �ƴմϴ�.",year);

	}

}
