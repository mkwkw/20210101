//���� 1110
//�� �ڸ� ���� �����. �� �ڸ��� ���ڸ� ���Ѵ�.
//�־��� ���� ���� ������ �ڸ����� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� �ٿ��� ���ο� ���ڸ� �����.
//����
import java.util.*;
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int ori = num;
		int num1 =0; //1�ܰ� ���� ����
		int num2 =0; //2�ܰ� ���� ����
		int cycle =0; //����Ŭ ��
		while(true) {
			if(num<10) {
				num1 = num;
			}
			else {
				num1 = num/10+num%10;
			}
			num2 = (num%10)*10+num1%10;
			cycle++;
			
			if(num2==ori) {
				
				break;
			}
			else {
				num=num2;
				continue;
			}
			
			
		}
		System.out.println(cycle);
	}

}
