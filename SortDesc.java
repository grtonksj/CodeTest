package CodeTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

//백준 1427번
//배열
public class SortDesc {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = br.readLine();
    char[] arr = s.toCharArray();
 
 
		Arrays.sort(arr);
 
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}


    
   
  }
}