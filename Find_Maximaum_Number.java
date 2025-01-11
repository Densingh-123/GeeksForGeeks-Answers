package GeeksForGeeksSolution;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Find_Maximaum_Number {
//Given a number N, write a program to find a maximum number that can be formed using all of the digits of this number.
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number:");
	String input = sc.nextLine();
	Character[] inputs =new Character[input.length()];
	for(int i=0;i<input.length();i++) {
		inputs[i]=input.charAt(i);
	}
	Arrays.sort(inputs,Collections.reverseOrder());
	StringBuffer sb = new StringBuffer();
	for(char data : inputs) {
		sb.append(data);
	}
	System.out.print("Maximim Number : "+sb.toString());
	sc.close();
}
}
