class Solution {
  int MOD = 20170805;
  int right[][] = new int[500][500]; 
  int down[][] = new int[500][500]; 

  public int solution(int m, int n, int[][] cityMap) {

      right[0][0] = 1;  //
      down[0][0] = 1;
      // %MOD
      for(int i=1; i<m ;i++){
          for(int j=1 ; j<n ; j++){
              if(cityMap[i][j] == 0){
                  right[i][j] = (right[i][j-1] + down[i-1][j])%MOD;
              }
              else if(cityMap[i][j] == 1){
                  right[i][j] = 0;
                  down[i][j] = 0;
              }
              else{ 
                  right[i][j] = right[i][j-1];
                  down[i][j] = down[i-1][j];
              }
          }
      }
     int answer = (right[m-1][n] + down[m][n-1])%MOD;
      return answer;
  }
}
