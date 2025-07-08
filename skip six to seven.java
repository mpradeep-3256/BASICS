import java.util.*;
public class skipsixtoseven{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	    }
	    Boolean b=false;
	    int sum=0;
	    for(int i=0;i<a;i++){
	        if(arr[i]==6){
	            b=true;
	        }
	       else if(arr[i]==7 && b){
	            b=false;
	        }
	       else if(!b){
	            sum+=arr[i];
	        }
	    }
	    System.out.println(sum);
	}
}