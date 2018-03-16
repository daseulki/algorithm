public int count(int x, int y){
  //  색깔을 담을 array[2^31-1]=0 생성
  if (x <0 || x>=m || y<0 || y>=n) return 0; //가장자리
  else if (picture[x][y] == 0) return 0; //배경이거나 지나온 자리
  else
    // if (x = 0 || y = 0) {
    // }
    if picture[x][y] == picture[x-1][y] || picture[x][y] == picture[x][y-1] || picture[x][y] == picture[x+1][y] || picture[x][y] == picture[x][y+1] {
      //색깔 같은지 확인..
      //같으면 int array[num] += 1
    }
    else{
      //다르면 numberOfArea += 1, array[num+1] =1
    }

    picture[x][y] = 0; //지나온 자리를 0 으로 바꿔줌
    return count(x,y-1) + count(x,y+1) + count(x-1,y) + count(x+1,y);
  }
}

public int max(int[] size){
  int max = size[0];
  for (int i=1; i<size.length; i++){
    if(size[i] >= max) max = size[i];
  }
  return max;
}

class Solution {
  public int[] solution(int m, int n, int[][] picture) {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;


    maxSizeOfOneArea = max();

    int[] answer = new int[2];
    answer[0] = numberOfArea;
    answer[1] = maxSizeOfOneArea;
    return answer;
  }
}
