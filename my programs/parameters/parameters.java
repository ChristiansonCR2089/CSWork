public class parameters{
    public static void main(String[] args){
        printNumbers(15);
        printNumbers(5);
        printPowersOf2(3);
        printPowersOf2(10);
        printpowersofN(4,3);
        printpowersofN(5,6);
        printpowersofN(-2,8);
        printSquare(1,5);
        printSquare(3,9);
        printSquare(0,3);
        printSquare(5,5);
        printGrid(3,6);
        printGrid(5,3);
        printGrid(4,1);
        printGrid(1,3);

    }
    public static void printNumbers(int max) {
        System.out.println("Exercise 1");
        for (int i = 1; i <= max; i++) { 
        System.out.print("["+i+"] ");
    }
    System.out.println();
}
    public static void printPowersOf2(int max) {
        System.out.println("Exercise 2");
        for (int i = 0; i <= max; i++) {
            System.out.print((int)Math.pow(2, i)+" ");
        }
        System.out.println();
    }
    public static void printpowersofN(int coeff, int pow){
        System.out.println("Exercise 3");
        int num = 1;
        System.out.print(num+" ");
        for (int i = 1; i <= pow; i++) {
            num *= coeff;
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void printSquare(int min, int max){
        System.out.println("Exercise 4");
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printGrid(int vert, int hor){
        System.out.println("Exercise 5");
        for (int i = 1; i <= vert; i++) { 
            int num = i;
            System.out.print(i);
            for (int l = 1; l < hor; l++) {
                num += vert;
                System.out.print(", " + num);
            }
            System.out.println();
    }
    }
}
