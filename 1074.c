#include <stdio.h>

int N,r,c,res;
int makeZ(int N, int r, int c){
  res=0;
  //shift 연산으로 2의 거듭제곱 표현
  for( N = 1<<N-1 ; N ; N /= 2 ){
    res += N*N*(r/N*2+c/N);
    r %= N;
    c %= N;
  }
  return res;
}
int main(void){
  while(scanf("%d%d%d",&N,&r,&c) != EOF)
  {
    printf("%d\n",makeZ(N,r,c));
  }
  return 0;
}
