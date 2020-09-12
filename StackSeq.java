package CodeTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


//백준 1874번
//스택
public class StackSeq {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    ArrayList<String> ans = new ArrayList<>();
    
    int n = sc.nextInt();
    
    int i=1;
    for(int count=1;count<n+1;count++){
      int input = sc.nextInt();
      while(input >= i){
        stack.push(i++);
        ans.add("+");
      }
      if(!stack.empty() && stack.peek().equals(input)){
        stack.pop();
        ans.add("-");
      }
    }

    if (stack.empty()) {
			for (String s : ans) {
				System.out.println(s);
			}
		} else {
			System.out.println("NO");
		}
    
  }
}