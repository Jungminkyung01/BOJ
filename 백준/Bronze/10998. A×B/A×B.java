import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		//StringTokenizer을 이용하여 공백을 제거
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A*B);

	}

}