//백준 15552
//참고: https://st-lab.tistory.com/30
//빠르게- BufferedReader와 StringBuilder 사용
import java.io.*;
import java.util.*;
public class p9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}

}
