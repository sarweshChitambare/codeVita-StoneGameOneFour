import java.util.Scanner;
public class StoneGameOneFour
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int t=0;
	int count=1;
	
	String result=" as";
	if(n==4) result="alice";
		else{
	for(int i=0;i<(n/4)+1;i++)
	{
		
		t=n-4;
	if(count%2==0)
	{
		if(t%2==0) result="Bob";
	else result="Alice";
		
	}
	else{
 if(t%2==0) result="Bob";
 else result="Alice";	
	}
	
	n=t;
	count++;
	} 
  
		}
	System.out.println(result);
}
}
