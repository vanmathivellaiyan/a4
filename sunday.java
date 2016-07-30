package guviprogram;

import java.util.Scanner;

public class sunday {
public static boolean weekday(String name){
	String a=name;
	if(a.equalsIgnoreCase("sunday")){
	return true;
	}
	else{
	return false;
	}
	
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println("string: ");
	sunday sun=new sunday();
	System.out.println(sun.weekday(str));
}
}
