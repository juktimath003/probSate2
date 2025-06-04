public class Main {
    public static void main(String[] args) {
        // For Area
        RectArea rectArea = new RectArea(5.0, 3.0);
        rectArea.displayArea();

        System.out.println("---------------------------");

        // For Perimeter
        RectPerimeter rectPerimeter = new RectPerimeter(5.0, 3.0);
        rectPerimeter.displayPerimeter();
    }
}
