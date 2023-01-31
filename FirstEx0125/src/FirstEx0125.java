import java.net.MulticastSocket;

public class FirstEx0125 {

	public static void main(String[] args) {
		int a = 5;
		
		System.out.println("Study");
		System.out.print("Hello JAVA\n");
		System.out.print("INHA");
		System.out.printf("\nDecimalNum=%d",7);
		System.out.printf("\na=%d\n",a);
		float fv = 3.14f ;  //문법이 틀림->컴파일 에러  
		double dv = 6.28 ;  //float 메모리 공간 2배 할당 
		System.out.print("fv="+fv+"\n");
		System.out.printf("fv=%07.2f\n",fv);
		System.out.printf("fv=%7.2f\n",fv);
		System.out.printf("fv=%-7.2f\n",fv);
		
		System.out.printf("dv=%.2f\n",dv);
		
		char ch = 'A';
		System.out.printf("ch=%c\n",ch);
		System.out.printf("ch=%B\n", (int) ch);
		String name = "gildong";
		System.out.println("name="+name);
		System.out.printf("name=%s\n",name);
		
		final double PI=3.14;
		System.out.printf("PI=%.2f\n",PI);
		int s=15/2;
		int p=13 % 4; 
		System.out.printf("s=%d. p=%d\n",s,p);
		
		int m = 3;
		m ++;
		System.out.printf("m=%d\n",m);
		
		System.out.write(65);
		System.out.println();
		System.out.println("in English \\hello\\");
		
		
	}

}



