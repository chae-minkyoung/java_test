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
		System.out.println("�̸��� �Է��ϼ���!!");
		name = sc.nextLine();
		System.out.println("�а����� �Է��ϼ���!!");
		major=sc.nextLine();
		System.out.print("���� ���� �Է�:");
		English=sc.nextByte();
		System.out.print("���� ���� �Է�:");
		physics=sc.nextByte();
		System.out.print("�������� ���� �Է�:");
		calculus=sc.nextByte();
		sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���!!");
		address=sc.nextLine();
		System.out.printf("�̸�=%s, ",name);
		System.out.printf("�а���=%s\n",major);
		System.out.printf("����=%d, ",English);
		System.out.printf("������=%d, ",physics);
		System.out.printf("��������=%d\n",calculus);
		System.out.printf("����=%d, ",English+physics+calculus);
		System.out.printf("���=%.1f\n",(float)((English+physics+calculus)/3));
		System.out.printf("�ּ�=%s",address);
	}
}
