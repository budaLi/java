import java.lang.Math;
public class Shuixianhuashu {
	public static void main(String[] args) {
		for (int i = 99; i <=1000; i++) {
			int res=0;
			int tem=i;
			while (tem>0) {
				int b=tem%10;
				res+=Math.pow(b, 3);
				tem/=10;
			}
			if (res==i) {
				System.out.println(res);
			}
		}
	}
}
