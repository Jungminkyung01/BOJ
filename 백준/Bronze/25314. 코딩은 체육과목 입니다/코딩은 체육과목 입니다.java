import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//코딩은 체육과목입니다.
//예제입력 4 => long int

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int len = n/4;

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < len ; i++) {
			sb.append("long ");
		}
		br.close();
		
		System.out.println(sb+"int");
	}

}
