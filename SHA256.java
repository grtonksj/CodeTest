package CodeTest;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

//백준 10930번
//해쉬 테이블
//MessageDigest, BigInteger 클래스
public class SHA256 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    System.out.println(getSHA256(S));
    



    
  }
  
  public static String getSHA256(String input){

    String toReturn = null;
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        digest.update(input.getBytes("utf8"));
        toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
        
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return toReturn;
      }

  
}