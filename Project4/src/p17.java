//백준 2577
//세 숫자 입력 받고 곱해서 계산
//자릿수별로 배열에 넣어서 각각 확인
import java.util.*;
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mul = a*b*c;
		
		int arr [] = new int [10];
		for(int i=0; i<10; i++) {
			arr[i]=0;
		}
		
		while(mul!=0) {
			
			int n = mul%10;
						
			switch(n) {
			case 0:
				arr[0]++;
				break;
			case 1:
				arr[1]++;
				break;
			case 2:
				arr[2]++;
				break;
			case 3:
				arr[3]++;
				break;
			case 4:
				arr[4]++;
				break;
			case 5:
				arr[5]++;
				break;
			case 6:
				arr[6]++;
				break;
			case 7:
				arr[7]++;
				break;
			case 8:
				arr[8]++;
				break;
			case 9:
				arr[9]++;
				break;
			}
			
			mul=mul/10;
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}

}
