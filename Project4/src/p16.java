//���� 2562
//�ִ��� �ε��� ã��
//�ִ� ã�� �� ������ �ε��� ã��
import java.util.*;
public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[] = new int [9];
		int max=0;
		int idx=0;
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
				idx=i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);
		
		sc.close();
		
		
	}

}
