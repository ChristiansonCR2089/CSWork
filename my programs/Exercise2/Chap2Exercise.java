import java.util.Scanner;
public class Chap2Exercise{
public static void main(String[] args)
{
    Exercise1();
    Exercise2();
    Exercise3();
    Exercise4();
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
        System.out.println((i*i));
    }
}

public static void Exercise3()
{ 
   System.out.println("Exercise3");
}

public static void Exercise4()
{
    System.out.println("Exercise4");
    for(int i = 1; i <= 4; i++)
    {
        System.out.println("****");
    }
}

public static void Exercise5()
{
    System.out.println("Exercise5");
    for(int i = 1; i <= 4; i++)
    {
        System.out.println("*");
    }
}
}
