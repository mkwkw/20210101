//น้มุ 11021
import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n1 =0;
		int n2 =0;
		int arr[] = new int [num];
		for(int i = 0; i<num; i++) {
			n1= sc.nextInt();
			n2= sc.nextInt();
			arr[i] = n1+n2;
			
		}
		
		for(int i=0; i<num; i++) {
			System.out.printf("Case #%d: %d\n", i+1, arr[i]);
		}
	}	

}
