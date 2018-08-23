public class loops {
    public static void main(String[] args)
    {
        writeSquares();
        writeSquares2();
        writeSquares3();
        writeSquares4();
        writeSquares6();
        writeSquares7();
        hellothere();
        nestedloop();
        
    }
    public static void writeSquares()
    {
        System.out.println("writeSquares...");
        //We want to create a program that prints the squares of the first five narural numbers
        //We can do it to ways, the long way
        System.out.println(1+" squared = " +(1+1));
        System.out.println(2+" squared = " +(2+2));
        System.out.println(3+" squared = " +(3+3));
        System.out.println(4+" squared = " +(4+4));
        System.out.println(5+" squared = " +(5+5));
    }
    

    //or we can do it the short way
    public static void writeSquares2()
    {
        System.out.println("writeSquares2...");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i +" squared = "+(i+i));
        }
    }

    //this will go to 100
    public static void writeSquares3()
    {
        System.out.println("writeSquares3...");
        for(int i=1; i<=100;i++)
        {
            System.out.println(i + " Squared = "+ (i+i));
        }

    }

    //This will go to stop value
    public static void writeSquares4()
    {
        System.out.println("writeSquares4...");
        System.out.println("Stop value is " + 1000);
        for(int i=1;i<=1000; i++)
        {
            System.out.println(i + " Squared = "+ (i+i));
        }
    }

    //this one counts up by 2
    public static void writeSquares6()
    {
        System.out.println("writeSquares6...");
        for (int count = 0; count <= 100; count += 2)
        {
            System.out.println(count + " squared = " + (count * count));
        }
    }

    //you can also go backwards
    public static void writeSquares7()
    {
        System.out.println("writeSquares7...");
        for (int n = 100; n >= 0; n--)
        {
            System.out.println(n + " squared = " + (n * n));
        }
    }

    //nested loop
    public static void hellothere()
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println("Hello There");
        }
        System.out.println("General Kenobi");
    }
    public static void nestedloop()
    {
        for (int i =1; i <= 6; i++)
        {
            for (int j = 1; j <= 3 ; j++)
            {
                System.out.print(j + " ");
            }
        }
    }
}