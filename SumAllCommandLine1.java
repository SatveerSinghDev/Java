
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vsoni
 */

public class SumAllCommandLine1 
{
    
public static void main(String args[])

{
	
int sum=0,i,count=0,n;
	//input length as Command Line argument
	
if (args.length == 0)
	       
System.out.println("Error");
	
else
	
{   
	    
i = Integer.parseInt(args[0]);
	    
while(count < i)
	    
{
		   
Scanner s = new Scanner(System.in);
		    
System.out.println("Enter number :");
		    
n = s.nextInt();
		    //
n = Integer.parseInt(args[count]);
		    
sum += n;
		    
count += 1;
	   
}
		
System.out.println("The sum is " +sum);
	
}

}

}



