
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
     sc.nextLine();
    String[] str=new String[n];
    int[] a= new int[n];
    for(int i=0;i<n;i++){
        str[i]=sc.nextLine();
        a[i]=0;
        for(int j=0;j<str[i].length();j++){
            char c= str[i].charAt(j);
            c=Character.toLowerCase(c);
            if(c=='a' || c=='e'||c=='i' || c=='o' || c=='u'){
                a[i]+=1;
            }
        }
    }
    int max=a[0];
    for(int i=1;i<n;i++){
        if(max<a[i]){
            max=i;
        }
    }
    System.out.println(str[max]);
    String name = str[max];
    int[] arr = new int[5];
    
    for(int i=0;i<name.length();i++){
        char c= name.charAt(i);
        if(c=='a'){
            arr[0]+=1;
        }
        if(c=='e'){
            arr[1]+=1;
        }
        if(c=='i'){
            arr[2]+=1;
        }
        if(c=='o'){
            arr[3]+=1;
        }
        if(c=='u'){
            arr[4]+=1;
        }
    }
    int m=arr[0];
//    ?>?
    for(int i=1;i<5;i++){
        if(m<arr[i]){
            m=arr[i];
        	
        }
        
    }
    char[] chararray= {'a','e','i','o','u'};
    for(int i=0;i<5;i++) {
    	if(m==arr[i]) {
    		System.out.println(chararray[i]+" "+ m);
    		break;
    	}
    }
	}
}

