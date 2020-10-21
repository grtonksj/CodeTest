package CodeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;

public class AgeSort {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringBuffer sb = new StringBuffer();
    

    int N = Integer.parseInt(br.readLine());
    String[][] arr = new String[N][2];
    for(int i=0;i<N;i++){
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      arr[i][0] = st.nextToken();	// 나이
      arr[i][1] = st.nextToken();	// 이름
    }

    for(int i=0;i<N-1;i++){
      int x = i;
      for(int j=i+1;j<N;j++){
        if(Integer.parseInt(arr[x][0]) >= Integer.parseInt(arr[j][0]))
          x = j;
      }
      String s0, s1;
      s0 = arr[i][0];
      s1 = arr[i][1];
      arr[i][0] = arr[x][0];
      arr[i][1] = arr[x][1];
      arr[x][0] = s0;
      arr[x][1] = s1;
      
    }

    for(int i=0;i<N;i++){
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
    

  }
}
