package CodeTest;
import java.util.Scanner;
import java.util.Stack;

//백준 5397번
//스택 
public class KeyLogger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    int testcase = sc.nextInt();

    for (int i = 0; i < testcase; i++) {
      String str = sc.next();
      Stack<Character> left = new Stack<Character>();
      Stack<Character> right = new Stack<Character>();

      for (int j = 0; j < str.length(); j++) {
        //char input = str.charAt(j);

        if (str.charAt(j) == '<') {
          if(!left.isEmpty())
            right.push(left.pop());
        } else if (str.charAt(j) == '-') {
          if(!left.isEmpty())
          left.pop();
        } else if (str.charAt(j) == '>') {
          if(!right.isEmpty())
            left.push(right.pop());
        } else {
          left.push(str.charAt(j));
        }

      }

      while(!left.isEmpty()){
        right.push(left.pop());
      }
      StringBuilder result = new StringBuilder();
      while(!right.isEmpty()){
        result.append(right.pop());
      }
      System.out.println(result);
    }


  }
}