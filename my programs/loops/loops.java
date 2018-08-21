public class loops {
    public static void main(String[] args)
    {
        writeSquares();
        writeSquares2();
        writeSquares3();
        writeSquares4();
        
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

    //goes from 4 tp 
    public static void writeSquares5()
    {
        system.out.println("writeSquares5...");
        for(int c =(2+ 2); c<=(17+3); c++);
        {
            system.out.println(c+" Squared = "+(c+c));
        }
    }
}