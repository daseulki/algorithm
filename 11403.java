//경로찾기
//i 에서 j 로 가는 방법 --> 문제 입력 받을떄 이미 받음
// k를 지나서 j로 가는방법

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws IOException{
		sc = new Scanner(System.in);
	    int[][] map = new int[100][100];
	    int n = sc.nextInt();

	    for (int i=0 ; i<n ; i++){
	      for (int j=0 ; j<n; j++){
	        map[i][j] = sc.nextInt();
	      }
	    }

	    for (int k=0; k<n; k++){
	      for (int i=0 ; i<n ; i++){
	        for (int j=0 ; j<n;j++){
	          if (map[i][k]==1 && map[k][j]==1)
	          map[i][j] = 1;
	        }
	      }
	    }
	    for (int i=0 ; i<n ; i++){
	      for (int j=0 ; j<n;j++){
	        System.out.println(map[i][j]);
	      }
	    }
	}

}
