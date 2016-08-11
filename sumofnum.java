package aa;

import java.util.Scanner;

public class sumofnum {
public static void main(String[] args){
	int num = 0;
	int k=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	int val= 0;
	int sum=0;
	int count = 0;
     val=num;
    while(val>0){
    	val=val/10;
    	count++;
	    }
    while(num>0){
    	int rem=num%10;
    	num=num/10;
    	sum=sum+(int)Math.pow(rem,count);
}
    System.out.println(sum);
}
}
	

