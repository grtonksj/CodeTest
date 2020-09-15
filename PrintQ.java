package CodeTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//큐 
//백준 1966번
public class PrintQ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> queue = new LinkedList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    int testn = sc.nextInt();
    
   
    
    for(int i=0;i<testn;i++){
      int count = 0;
      queue.clear();
      int n = sc.nextInt();
      int location = sc.nextInt();
      
      for(int j=0;j<n;j++){
        queue.offer(sc.nextInt());
      }
      
      while(!queue.isEmpty()){
        
        boolean isPriorty = true;
        for(int k=1;k<queue.size();k++){
          if(queue.peek() < queue.get(k)){
            isPriorty = false;
            break;
          }
        }
        if(!isPriorty){//front가 가장 높은 문서가 아니라면
          int temp =queue.poll();
          queue.offer(temp);
          location = (location==0) ? queue.size()-1 : --location;
        }
        else{//front가 가장 높은 문서라면
          queue.poll();
          count++;
         
          if(location == 0)
            break;
          else 
          location -= 1;
        }
      }
      ans.add(count);
      
    } 
    for (int s : ans) {
      System.out.println(s);
    }

  }
  
}

