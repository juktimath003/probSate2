public class RectPerimeter {
    private double length;
    private double breadth;

    // Constructor
    public RectPerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void displayPerimeter() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}
