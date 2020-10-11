package CodeTest;
import java.util.Scanner;

//백준 2920번
//배열 
public class Scale {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
  
		
        boolean asc = true;
        boolean dsc = true;
        
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]>arr[i-1])
        		dsc = false;
        	else if(arr[i]<arr[i-1])
        		asc = false;
        }
        
        if(asc == true && dsc == false)
        	System.out.println("ascending");
        else if(dsc == true && asc == false)
        	System.out.println("descending");
        else
        	System.out.println("mixed");
		
	}

}
