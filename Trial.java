
import java.util.*;
public class Trial {
static int fact(int n)
{
int i=1;
while(n>0)
{
    i=i*n;
    n--;
}
return i;
}
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial");
        int a=s.nextInt();
        System.out.println("The factorial of "+a+" is "+fact(a));
    }
    
}
