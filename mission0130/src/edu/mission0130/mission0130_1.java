package edu.mission0130;

import java.util.Scanner; 

public class mission0130_1 {

	public static void main(String[] args) {
		int num [] = new int[6];
		Scanner sc = new Scanner(System.in);
		int j = 0;
		while (true) {
			int count = 0;
			System.out.print("�ζ� ��ȣ �Է�:");
			int a = sc.nextInt();
			if (a<=45 && a>0) {
				for (int i =0; i<6;i++) {
					if (a==num[i])
						count++;
					}if (count == 0) {
						num[j]=a;
						j++;
						}
						
					else if(count !=0) {
						System.out.println("���� ��ȣ�� �ֽ��ϴ�!");
					}
				
				if (j==6)
					break;
				}
			else
				System.out.println("�ùٸ� ������ �Է��� �ּ���.");
			}System.out.printf("�Էµ� �ζ� ��ȣ :\t%d\t%d\t%d\t%d\t%d\t%d",num[0],num[1],num[2],num[3],num[4],num[5]);
		}
	}

