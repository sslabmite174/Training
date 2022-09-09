import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--){
		    System.out.print(str[i]+" ");
		}
	}
}
