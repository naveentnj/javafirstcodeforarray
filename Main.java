package com.naveendeveloper;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array array size");
        int arrsize=s.nextInt();
       int arr[]=new int [arrsize];
       for (int k=0;k<arrsize;k++)
       {
           System.out.println("Enter the array values");
           arr[k]=s.nextInt();
       }

       int a= arr.length;
        int op[]=new int[6];
       for (int i=0;i<a;i++)
        {
            arr[i]=arr[i]*2;
            op[i]=arr[i];
        }
        for (int j=0;j<a;j++)
        {
            System.out.println("Output "+op[j]);
        }

    }
}
