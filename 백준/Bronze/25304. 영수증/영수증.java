import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//총 금액
		int X = Integer.parseInt(br.readLine());
		//종류의 수
		int N = Integer.parseInt(br.readLine());
		
		int s = 0;
		
		//공백이 필요하기 때문에 STringTokenizer사용
		StringTokenizer st;
		//StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<N ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			//sb.append(Integer.parseInt(st.nextToken())* Integer.parseInt(st.nextToken()));
			//sb.append('\n');
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			s = s +(price*num);
		}
		
		if(X == s) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
