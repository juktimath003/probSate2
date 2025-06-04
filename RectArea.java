package probSate2;
public class RectArea {
    private double length;
    private double breadth;

    // Constructor
    public RectArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}
