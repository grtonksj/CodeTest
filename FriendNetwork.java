package CodeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;



//그래프, 해시
//Union - Find
//백준 4195번
public class FriendNetwork {
  static int testcase,F;
  static int[] parent, cnt;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    StringTokenizer st;
    HashMap<String,Integer> hm;
    testcase = Integer.parseInt(br.readLine());
    while(testcase-->0){
      F = Integer.parseInt(br.readLine());
      hm = new HashMap<>();
      cnt = new int[F*2+1];
      parent = new int[F*2+1];
      int idx=0;
      while(F-->0){
        st = new StringTokenizer(br.readLine());
        String[] strs = {st.nextToken(),st.nextToken()};

        if(!hm.containsKey(strs[0])) {
          
          hm.put(strs[0], idx);
          parent[idx] = idx;
          cnt[idx++] = 1;

        }
      
        if(!hm.containsKey(strs[1])) {
          
          hm.put(strs[1], idx);
          parent[idx] = idx;
          cnt[idx++] = 1;
        }

        int x = hm.get(strs[0]);
        int y = hm.get(strs[1]);
        union(x,y);
        sb.append(cnt[find(x)]).append("\n");
      }
    }
    System.out.println(sb.toString());
  }

  public static int find(int x) {
      if(x == parent[x])
          return x;
      else 
          return parent[x] = find(parent[x]);
  }

  public static void union(int x, int y) {
      x = find(x);
      y = find(y);
      if (x == y)
        return;
      if(x != y){
        parent[y] = x;
        cnt[x] += cnt[y];
      }
  }
}