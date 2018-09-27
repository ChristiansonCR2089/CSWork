public class Chap3Exercises{
    public static void main(String[] args){
    }
    public static int  largerAbsVal(int a, int b) {
        return Math.max(Math.abs(a), Math.abs(b));
    }
    public static int  largestAbsVal(int a, int b, int c) {
        return Math.max(Math.abs(a), Math.max(Math.abs(b), Math.abs(c)));
    }
    public static void quadratic(int a, int b, int c) {
        double root=Math.sqrt(b*b-4*a*c);
        double root1=(-b+root)/(2*a);
        double root2=(-b-root)/(2*a);
        System.out.println("First root = "+root1);
        System.out.println("Second root = "+root2);
    }
    public static int lastDigit(int num) {
        return Math.abs(num%10); 
    }
    public static double area(double rad) {
        return Math.PI*rad*rad;
    }
    public static double distance(int x, int y, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x, 2)+Math.pow(y2-y, 2));
    }
    public static double  scientific(double num, double exp) {
        return num*Math.pow(10, exp);
    }
    public static double pay(double hourSalary, int hour) {
        double salary = 0;
        if (hour > 8) {
            salary = 8 * hourSalary + (hour - 8) * (1.5 * hourSalary);
        } else {
            salary = hour * hourSalary;
        }
        return salary;
    }
    public static double cylinderSurfaceArea(double rad, double height) {
        return 2*Math.PI*rad*(rad+height);
    }
    public static double spherevolume(double rad) {
        return 4*Math.PI*Math.pow(rad, 3)/3;
    }
}