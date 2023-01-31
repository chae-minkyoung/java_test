package edu.switchtwo;

public class SwitchSecond {

	public static void main(String[] args) {
//		whoIsIt("호랑이");
//		whoIsIt("사자");
//		whoIsIt("독수리");
//		whoIsIt("참새");
//		whoIsIt("고등어");
//		whoIsIt("연어");
//		whoIsIt("곰팡이");
		String tmp =null;
		tmp = fone(1);
		System.out.println("tmp="+tmp);
		tmp = fone(2);
		System.out.println("tmp="+tmp);
		tmp = fone(3);
		System.out.println("tmp="+tmp);
		
	}
	static String fone(int n) 
	{
		return switch(n)
				{
					case 1->"한개";
					case 2->"두개";
					case 3->"세개";
					default->"많이";
				};
	}
	
	
	
	static void whoIsIt(String bio)
	{
		String kind =switch(bio)
		{
		case "호랑이","사자"->"포유류";
		case "독수리", "참새"->"조류";
		case "고등어","연어"->"어류";
		default->{
			System.out.print("어이쿠! ");
			yield "...";
			}
		};// end of switch()
		System.out.printf("%s는 %s이다.\n",bio,kind);
	}
}
