
public class OperatorEx {

	public static void main(String[] args) {
//		int a = 1;
//		System.out.printf("a=%d\n",a);
//		a=a+1;
//		System.out.printf("a=%d\n",a);
//		++a;  //a=a+1;
//		System.out.printf("++a후 %d\n",a);//여기까지 a값 4
//		a++;
//		System.out.printf("a++후 %d\n",a);//여기까지 a값 4
//		
//		System.out.printf("++a후 %d\n",++a);
//		System.out.printf("a++후 %d\n",a++);
//		System.out.printf("최종 %d\n",a);
//		int b = 9;
//		System.out.printf("b=%d\n",b);
//		b=b-1;
//		System.out.printf("b=%d\n",b);
//		--b;  //b=b-1;과 같은 역할
//		System.out.printf("--b한 후 b=%d\n",b);
//		b--;
//		System.out.printf("b--한 후 b=%d\n",b);
		
		int c =8, d=7;
		int max=(c>d)? c:d;  //?앞에가 true면 c가 선택 -> c가 max에 들어가서 max=c가 됨.
		int a=8,b=27;
		int maximum=(a>b)? a:b;  //?앞에가 false면 뒤에 b선택. maximum=b가 됨.
		System.out.printf("%d,%d",max,maximum);

	}

}
