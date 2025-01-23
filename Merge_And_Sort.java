
package GeeksForGeeksSolution;
import java.util.*;
public class Merge_And_Sort {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Elements in a First array :");
	sb.append(sc.nextLine()).append(" ");
	System.out.print("Enter Elements in a second array :");
	sb.append(sc.nextLine());
	List<Integer> number = new ArrayList<>();
	for(String num:sb.toString().trim().split("\\s+")) {
		number.add(Integer.parseInt(num));
	}
	Collections.sort(number);
	System.out.println("Merged and sorted array");
	for(int num:number) {
		System.out.print(num+" ");
	}
	sc.close();
}
}