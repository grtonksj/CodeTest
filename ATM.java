package CodeTest;
import java.util.Arrays;
import java.util.Scanner;
 
 //그리디 알고리즘 
//매 순간마다 최적의 해를 구하는 방식
//백준 11399번
public class ATM {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] time = new int[num];
      int min = 0;
      
      for(int i =0; i<num; i++) {
          time[i] = sc.nextInt();
      }
      //오름차순으로 정렬
      Arrays.sort(time);
      int sum = 0;
      for(int i =0; i<time.length; i++){
         min+=time[i];
         sum+=min;
      }
      System.out.println(sum);
   }
}