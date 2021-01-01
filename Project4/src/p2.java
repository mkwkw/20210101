//백준 2309
//9개의 수 총합에서 100을 뺀 값이 두 수의 합과 같은 두 수를 찾는다.
//틀렸습니다...?
import java.util.*;
import java.io.*;
public class p2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr1 [] = new int [9];
		int arr2 [] = new int [7];
		int sum =0;
		for(int i=0; i<9; i++) {
			arr1[i]= Integer.parseInt(br.readLine());
			sum+=arr1[i];
		}
		
		int num = sum-100;
		
		int n1 = 0;
		int n2 = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				
				
				if(arr1[i]+arr1[j] == num) {
					n1 = arr1[i];
					n2 = arr1[j];
					arr1[i]=0;
					arr1[j]=0;
					break;
				}
					
			}
			
		}
		
		Arrays.sort(arr1);
		for(int i=0; i<7; i++) {
			arr2[i]= arr1[i+2];
		}
		
		Arrays.sort(arr2);
		
		for(int i=0; i<7; i++)
			System.out.println(arr2[i]);
		
		
		
		
	}

}
