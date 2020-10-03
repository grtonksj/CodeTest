package CodeTest;

import java.util.HashSet;
import java.util.Scanner;

//백준 1920번
//해시, 배열 
//HashSet
public class NumFind {
  static int N, M, answer;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();

    HashSet<Integer> hs = new HashSet<Integer>(N);
    for(int i=0; i<N; i++) {
       hs.add(sc.nextInt()); 
    }

    M = sc.nextInt();
    int[] arr = new int[M];
    for(int i=0; i<M; i++) { 
      arr[i] = sc.nextInt(); 
    }

    for(int i=0; i<M; i++) { 
      if (hs.contains(arr[i])) { 
        answer = 1; 
      } else { 
        answer = 0; 
      } 
      System.out.println(answer); 
    }
  }
}
