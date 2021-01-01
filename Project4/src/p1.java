//20210101
//น้มุ 15610
import java.io.*;
public class p1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int num = Integer.parseInt(br.readLine());
		
		double result = Math.sqrt(num)*4;
		
		System.out.printf("%.8f", result);
	}

}
