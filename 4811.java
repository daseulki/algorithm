//F(w,h) = F(w-1,h+1) + F(w,h-1)

import java.io.IOException;
import java.util.Scanner;
public class Main{

  public static int[][] array;

  public static void main(String[] args) throws IOException{
    Scanner sc - new Scanner(System.in);
    int n;
    while ((n = Integer.pareInt(sc.nextInt())) != 0){

      int w = n-1; //첫날 무조건 w 니까..
      int h = 1; // 첫날 w 먹고 반쪽이 생겨서..
      System.out.println(half(int w, int h));

    }
  }
  public static int half(int w, int h){
    if (w>0){
      if(array[w][h]!=0) return
    }
    else{

    }
      half(w-1,h+1);
      if(h>=1){
        half(w,h-1);
      }
  }
}
