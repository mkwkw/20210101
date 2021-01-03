//백준 3052
//나머지 구하고 
//나머지로 배열을 바꾼 후
//정렬하고
//앞 뒤의 원소가 서로 다른지 확인
//성공
import java.util.*;
public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		int result =0; //서로 다른 나머지 개수
		
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
