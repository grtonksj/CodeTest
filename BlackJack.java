import java.util.Scanner;

//백준 2798번
//브루트포스(완전탐색)
public class BlackJack {
  
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  int m = sc.nextInt();
  int[] arr = new int[n];

  for(int i=0; i<arr.length;i++){
    arr[i] = sc.nextInt();
  }
  
  int max =0;
  for(int i =0; i<arr.length-2; i++){
    for(int j=i+1;j<arr.length-1;j++){
      for(int k=j+1;k<arr.length;k++){
        int thr = arr[i]+arr[j]+arr[k];   
        if(thr >max &&thr<=m)
          max = thr;
      }
    }
  }
  System.out.println(max);

  
  }
  


}
