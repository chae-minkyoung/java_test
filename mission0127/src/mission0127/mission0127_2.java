package mission0127;

import java.util.Scanner;
public class mission0127_2 {
	
	public static void main(String[] args) {
		System.out.print("숫자 하나를 입력해 주세요:");
		Scanner sc=new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c =sc.nextInt();
		int count = 0;
		int count2 = 0;
		for (a=2;a<=c;a++)
		{
			count = 0;
			for (b=2;b<a;b++) 
			{
				if (a%b == 0) 
				{
					++count;
				}
			}
			
			if (count == 0) 
			{
			System.out.printf("%d는 소수이다.\n",a);
			count2++;
			}
		}
		System.out.printf("1~%d 사이의 소수 개수=%d",c,count2);
	}
}

