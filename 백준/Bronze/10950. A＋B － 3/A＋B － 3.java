import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * */
//BufferedReader + StringTokenizer+StringBuilder
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//개수 T
		int T = Integer.parseInt(br.readLine());
		
		//한중에 정수가 2개 => 공백을 기준으로 문자열 분리 StringTokenizer
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		
		for (int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
		
	}

}