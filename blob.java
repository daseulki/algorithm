private static int BACKGROUND_COLOR = 0;
private static int IMAGE_COLOR = 1;
private static int ALREADY_COUNTED = 2;
public int countCells(int x, int y){
  int result;
  if (x<0 || x>=N||y<0||y>=N)
    return 0;
  else if (grid[x][y] != IMAGE_COLOR)
    return 0;
  else {
    grid[x][y] = ALREADY_COUNTED;
    return 1 + countCells(x-1, y+1) +countCells (x,y+1) + countCells(x+1,y+1) + countCells
  }
}

public Solution {
  public int[] solution(int m, int n, int[][] picture){
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;

    int[] answer = new int[2];
    answer[0] = numberOfArea;
    answer[1] = maxSizeOfOneArea;
    return answer ;
  }
}
