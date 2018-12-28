
public class Nine {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%s*%s=%s%s",i,j,i*j," ");
				/*System.out.print(i);
				System.out.print("*");
				System.out.print(j);
				System.out.print("=");
				System.out.print(i*j);
				System.out.print(" ");*/
			}
			System.out.println();
		}
		
	}
}
