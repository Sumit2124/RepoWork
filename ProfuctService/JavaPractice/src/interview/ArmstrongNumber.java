package interview;

public class ArmstrongNumber

{
    public static void main(String[] args)
    {
    int num=3711;
    int copy=num;
    int sum=0;
    while(copy!=0)
    {
        int d=copy%10;
        copy=copy/10;
        sum+=Math.pow(d,3);

    }
    if(sum==num)
    {
        System.out.println("Armstrong");
    }
    else {
        System.out.println("Not Armstrong");
    }
    }
}
