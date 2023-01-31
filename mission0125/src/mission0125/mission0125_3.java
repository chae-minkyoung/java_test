package mission0125;

public class mission0125_3{ 
	public static void main(String[] args) { 
	byte var1=127; 
	short var2=128; 
	int var3=128; 
	long var4=128L; 
	var4 = var1; 
	System.out.println(var1+ ", " + var2); 
	var1 = (byte)var3; // var3는 int이므로 byte로 인식시킴.(값은 다르게 나옴.)
	System.out.println(var1+ ", " + var3); 

	float var5=123456.789123f; // float에 값 입력하기 위해 f입력. 
	double var6=123456.789123; 
	var5 =(float)var6; // float에 double을 넣기 위해 (float) 입력
	System.out.println(var5+ ", " + var6); 
	var6 = var5; 
	System.out.println(var5+ ", " + var6); 
	} 
	}