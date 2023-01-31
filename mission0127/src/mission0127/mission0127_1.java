package mission0127;

public class mission0127_1 {

	public static void main(String[] args) {
		int dan=0;
		int val=0;
		
		for (val=1;val<=9;val++) {
			for (dan=2;dan<=5;dan++) {
				System.out.printf("%d*%d=%d\t",dan,val,dan*val);
				if(dan==5)
					System.out.print("\n");
			}
		}
		System.out.println();
		for (val=1;val<=9;val++) {
			for (dan=6;dan<=9;dan++) {
				System.out.printf("%d*%d=%d\t",dan,val,dan*val);
				if(dan==9)
					System.out.print("\n");
			}
		}

	}

}
