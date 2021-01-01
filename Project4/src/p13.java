//น้มุ 10871
import java.util.*;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int num = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			if(num>arr[i])
				System.out.print(arr[i]+" ");
		}
		
	}

}
