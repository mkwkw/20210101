//น้มุ 2438
import java.util.*;
public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			for(int k=num-i; k>0; k--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
