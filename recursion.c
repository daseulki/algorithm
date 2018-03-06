#include<stdio.h>
#include<math.h>

void makeZ(int n, int r, int c){

  int nSquare = (int)pow(2,n);
  int array[nSquare][nSquare];
  int i, j;
  int answer = 0;
  if (n <=  0) return 0;

  for ( i = 0 ; i< nSquare ; i++ ){
    array[0][0] = 0;
    if j = 2*n array[i][j] = 4*j ;
    else array[i][j] = array[i][j-1]+1 ;

  }
  return array[r][c] ;

}

int main(void){
  int n, r, c;
  scanf("%d %d %d",&n, &r, &c);
  printf("%d\n",makeZ(n,r,c) );

}
