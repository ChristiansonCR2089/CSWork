public class Operators {
    public static void main(String[] args)
    {
        //The + operator can be used for addition or for string connections
        String num1 = "1";
        String num2 = "2";
        System.out.println(num1+num2);
        //If you are using numbers...
        System.out.println(1 + 2);
        //what if we mix them
        System.out.println("1"+ 2);
        //Incrementnting is when you increase the value by a certian amount
        //Decrementing is the same but decreasing instead of increasing
        //java has special operators for incrimenting and decrementing
        int increment = 1;
        increment += 7;
        System.out.println(increment);
        increment -= 7;
        System.out.println(increment);
        //This also works for multipling and dividing
        increment *= 7;
        System.out.println(increment);
        //I'm Tired of typing so much so...
        increment /= 7;
        print(increment);
        /*we need to make another method for int
        //if youmake the same method for a different data type its type is called overloadind
        //in c++ you can overload operators
        sadly not in java  ;(*/
        Double num = 5.0;
        print(num);
        //Two more 2 go
        //++ adds one to variable and -- subracts 1 from variable
        int mynum = 10;
        mynum++;
        print(mynum);
        mynum--;
        print(mynum);
        //smae thing, different way
        ++mynum;
        print(mynum);
        --mynum;
        print(mynum);
        print(++mynum);
        print(--mynum);
    }
    /*so lets make  a method
    //it's going to be public so we can use it outside the class
    //it's static so it doesnt have to be attached to an instance of a class object
    it's void because it returns nothing*/
    public static void print(String value){
        System.out.println(value);
    }
    public static void print(int value){
        System.out.println(value);
    }
    public static void print(Double value){
        System.out.println(value);
    }
}