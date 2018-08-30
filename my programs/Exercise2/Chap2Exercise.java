import java.util.Scanner;
public class Chap2Exercise{
public static void main(String[] args)
{
    Exercise1();
    Exercise2();
    Exercise3();
    Exercise4();
    Exercise5();
    Exercise6();
    Exercise7();
    Exercise8();
    Exercise9();
}

public static void Exercise1()
{
    System.out.println("Exercise1");
    double pos;
    double vel;
    double acc;
    double time;
    double s;
    Scanner reader = new Scanner(System.in);
    {
        System.out.println("What is your So: ");
        pos =reader.nextDouble();
        System.out.println("What is your Vo: ");
        vel =reader.nextDouble();
        System.out.println("What is your a: ");
        acc =reader.nextDouble();
        System.out.println("What is your T: ");
        time =reader.nextDouble();
        s =(pos+vel*time+0.5*acc*(time*time));
        System.out.println(s);
    }
}

public static void Exercise2()
{
    System.out.println("Exercise2");
    for(int i = 1; i <= 10; i++)
    {
        System.out.print((i*i+" "));
    }
}

public static void Exercise3()
{ 
    System.out.println();
   System.out.println("Exercise3");
    int a = 1;
    int b = 1;
    int count = 1;
    int temp = 0;
    while (count <=12){
    if(count<=1){
    System.out.print(b+", ");
    count++;
    }else if (2<=count ){
        count++;
        System.out.print(+b +", ");
        temp = a+b;
        a=b;
        b=temp;
    }
    }

}

public static void Exercise4()
{
    System.out.println("");
    System.out.println("Exercise4");
    for(int i = 1; i <= 4; i++)
    {
        System.out.println("****");
    }
}

public static void Exercise5()
{
    System.out.println("Exercise5");
    for(int i = 1; i <= 1; i++)
    {
        System.out.println("*");
        for(int j = 1; j <= 1; j++)
    {
        System.out.println("**");
        for(int l = 1; l <= 1; l++)
    {
        System.out.println("***");
        for(int t = 1; t <= 1; t++)
    {
        System.out.println("****");
    }
    }
    }
    }
}

    public static void Exercise6()
{
    System.out.println("Exercise6");
    for(int i = 1; i <= 1; i++)
    {
        System.out.println("1");
        for(int j = 1; j <= 1; j++)
    {
        System.out.println("22");
        for(int l = 1; l <= 1; l++)
    {
        System.out.println("333");
        for(int t = 1; t <= 1; t++)
    {
        System.out.println("4444");
    {
        System.out.println("55555"); 
    {
        System.out.println("666666");
    {
        System.out.println("7777777"); 
    } 
    }
    } 
    }
    }
    }
    }
}

public static void Exercise7()
{
    System.out.println("Exercise7");
    for(int i = 1; i <= 1; i++)
    {
        System.out.println("    1");
        for(int j = 1; j <= 1; j++)
    {
        System.out.println("   2 ");
        for(int l = 1; l <= 1; l++)
    {
        System.out.println("  3");
        for(int t = 1; t <= 1; t++)
    {
        System.out.println(" 4");
    {
        System.out.println("5"); 
    } 
    }
    }
    }
    }
}

public static void Exercise8()
{
    System.out.println("Exercise8");
    for(int i = 1; i <= 1; i++)
    {
        System.out.println("    1");
        for(int j = 1; j <= 1; j++)
    {
        System.out.println("   22");
        for(int l = 1; l <= 1; l++)
    {
        System.out.println("  333");
        for(int t = 1; t <= 1; t++)
    {
        System.out.println(" 4444");
    {
        System.out.println("55555"); 
    } 
    }
    }
    }
    }
}

public static void Exercise9()
{
    System.out.println("Exercise9");
    for(int i = 1; i <= 1; i++)
    {
        System.out.println("----------------------------------------");
        for(int j = 1; j <= 1; j++)
    {
        System.out.println("_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-");
        for(int l = 1; l <= 1; l++)
    {
        System.out.println("1122334455667788990011223344556677889900");
        for(int t = 1; t <= 1; t++)
    {
            System.out.println("--------------------------------------");
        
    {
    }
    }
    }
    }
    }
}
}