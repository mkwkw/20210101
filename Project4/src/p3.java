//백준 2609
//틀렸습니다.
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int arr1[]= new int [n1+1];
		int arr2[]= new int [n2+1];
		
		int num1 =0; //최대공약수
		int num2 =10000; //최소공배수
		
		for(int i=1; i<=n1; i++) {
			if(n1%i ==0) {
				arr1[i]=i;
			}
			else
				arr1[i]=0;
		}
		
		for(int j=1; j<=n2; j++) {
			if(n2%j ==0) {
				arr2[j]=j;
			}
			else
				arr2[j]=0;
		}
		
		for(int i=1; i<=Math.min(n1, n2); i++) {
			if(arr1[i]== arr2[i] && arr1[i]!=0) {
				if(num1<arr1[i])
					num1=arr1[i];
			}
			
		}
		
		for(int i=1; i<=10000; i++) {
			for(int j=1; j<=10000; j++) {
				if(n1*i == n2*j) {
					if(num2>n1*i) {
						num2 = n1*i;
						break;
					}
				}
					
			}
				
		}
		System.out.println(num1);
		System.out.println(num2);
	}

}
