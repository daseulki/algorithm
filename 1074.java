import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    System.out.println(makeZ(n,r,c));

  }
  static public int makeZ(int n,int r,int c){

    int answer = 0;

    //x,y 중간 기준점
    int y = (int)Math.pow(2,n)/2;
    int x = y;
    while (n-- > 0){
      //다음 기준
      int temp = (int) Math.pow(2,n-1);
      int skip = (int) Math.pow(4,n);
      //찾으려는 위치가 어느 사분면에 위치하는 지 찾는다.
      //각각의 사분면은 넘어간 수 만큼 앞의 갯수(skip)를 더해주면됨.. 계속 4분할...
      if (r < y && c < x) {// 1
        x -= temp;
        y -= temp;
      } else if (r < y && x <= c) {// 2
        x += temp;
        y -= temp;
        answer += skip;
      } else if (y <= r && c < x) {// 3
        x -= temp;
        y += temp;
        answer += skip * 2;
      } else {// 4
        x += temp;
        y += temp;
        answer += skip * 3;
      }
    }
    return answer;
  }
}
