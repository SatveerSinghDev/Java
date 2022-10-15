/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vsoni
 */

import java.util.Scanner;

public class ConvDecToBin 
{

public static void main(String[] args) 
    
{
        
int n, count = 0, a;
        
String x = "";
        
Scanner s = new Scanner(System.in);
        
System.out.print("Enter any decimal number:");
        
n = s.nextInt();
        
while(n > 0)
        
{

a = n % 2;
            
x = x + "" + a;
            
n = n / 2;
        
}
        
System.out.println("Binary number:"+x);
    
}

}
    

