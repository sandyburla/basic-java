package Practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwin {

	 boolean isPrime(int n) //funton for checking prime
    { 
        int count=0;
        for(int i=1; i<=n; i++)
            {
                if(n%i == 0)
                    count++;
            }
        if(count == 2)
            return true;
         else
            return false;
    }

public static void main(String args[]) throws IOException
    {
        TwinPrime ob = new TwinPrime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

        System.out.print("Enter the lower range : ");
        int p = Integer.parseInt(br.readLine());
        System.out.print("Enter the upper range : ");
        int q = Integer.parseInt(br.readLine());
        int sum=0;
         
        if(p>q)
            System.out.println("Invalid Range !");
        else
        {
            System.out.println("nThe Twin Prime Numbers within the given range are : ");
            for(int i=p; i<=(q-2); i++)
            {
                if(ob.isPrime(i) == true && ob.isPrime(i+2) == true)
                { 
                sum=sum+(i)+(i+2);
                    System.out.print("("+i+","+(i+2)+") ");
                    

                }
            }System.out.print(sum);
        }                 
    }
}
