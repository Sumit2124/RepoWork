package java8.FunctionalInterface;

import java.util.Scanner;

interface  i1{
    public int operation(int a,int b);
}
public class LamdaExample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.print("Enter Second Number");
        int b=sc.nextInt();
        int temp=0;
        i1 sumOP=(x,y)->x+y;
        int sum = sumOP.operation(a, b);
        System.out.println(sum);
    }
}
