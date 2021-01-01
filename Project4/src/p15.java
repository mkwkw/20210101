//백준 1110
//두 자리 수로 만든다. 각 자리의 숫자를 더한다.
//주어진 수의 가장 오른쪽 자리수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙여서 새로운 숫자를 만든다.
//성공
import java.util.*;
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int ori = num;
		int num1 =0; //1단계 숫자 저장
		int num2 =0; //2단계 숫자 저장
		int cycle =0; //사이클 수
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
