package edu.switchtwo;

public class SwitchSecond {

	public static void main(String[] args) {
//		whoIsIt("ȣ����");
//		whoIsIt("����");
//		whoIsIt("������");
//		whoIsIt("����");
//		whoIsIt("����");
//		whoIsIt("����");
//		whoIsIt("������");
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
					case 1->"�Ѱ�";
					case 2->"�ΰ�";
					case 3->"����";
					default->"����";
				};
	}
	
	
	
	static void whoIsIt(String bio)
	{
		String kind =switch(bio)
		{
		case "ȣ����","����"->"������";
		case "������", "����"->"����";
		case "����","����"->"���";
		default->{
			System.out.print("������! ");
			yield "...";
			}
		};// end of switch()
		System.out.printf("%s�� %s�̴�.\n",bio,kind);
	}
}
