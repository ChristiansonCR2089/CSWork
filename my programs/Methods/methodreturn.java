public class methodreturn {
    //Methods can also return values
    //You must specify what type
    //Amd you have to return specified type
    //Or you get an error

    //In the main method, the reutrn type
    //is void so no value is returned or
    //expected to be returned

    //The methods in the Math class are static
    //so it is not neccisary to create an instance
    //You can call the methods by referencing the name
    //of the class (math) followed by a . and the 
    //name of the method

    //the one we want to use is the sqrt
    //looking at the method documentation it shows
    //the method has one double parameter and
    //returns a double value

    public static void main(String[] args){
        for  (int i = 1; i <= 100; i++);
        {
            double root = math.sqrt(i);
            System.out.println("sqrt of "+i+"="+i);
        }
    }

}