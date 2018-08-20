public class DrawFigures3 {
    public static void main(String[] args){
        drawBox();
        drawCone();
        drawV();
    }
    public static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

    public static void drawCone(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    public static void drawV(){
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
}