//���� 3052
//������ ���ϰ� 
//�������� �迭�� �ٲ� ��
//�����ϰ�
//�� ���� ���Ұ� ���� �ٸ��� Ȯ��
//����
import java.util.*;
public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		int result =0; //���� �ٸ� ������ ����
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			arr[i] = arr[i]%42;
		}
		
		Arrays.sort(arr);
		result =1;
		
		for(int i=0; i<9; i++) {
			if(arr[i]!=arr[i+1])
				result++;
			else
				continue;
		}
	
		System.out.println(result);
		sc.close();
	}

}
