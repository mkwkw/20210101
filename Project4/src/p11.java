//น้มุ 11022
import java.util.*;
public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n1 []= new int[num];
		int n2 []= new int[num];
		int arr[] = new int [num];
		for(int i = 0; i<num; i++) {
			n1[i]= sc.nextInt();
			n2[i]= sc.nextInt();
			arr[i] = n1[i]+n2[i];
			
		}
		
		for(int i=0; i<num; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, n1[i], n2[i], arr[i]);
		}
	}

}
