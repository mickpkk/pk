import java.util.*;
class Loop1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
        System.out.print("Input n1 >> ");
        n1=sc.nextInt();
        System.out.print("Input n2 >> ");
        n2=sc.nextInt();
        System.out.println("==============");
        
		int i = n1;
        while (i <= n2) {
            System.out.print(i + " ");
            i++;
        }
		System.out.println();
	}
}
