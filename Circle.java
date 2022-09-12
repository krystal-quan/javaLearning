public class Circle {
    private double radius = 1.0;
    private String color = "red";
    static final double PI = 3.1415;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Circle no var.
     */
    public Circle() {

    }

    /**
     * Circle 1 var.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle 2 var.
     */
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    /**
     * Area of the circle.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * To string type.
     */
    @Override
    public String toString() {
        String temp = "Circle[radius=" + radius + ",color=" + color + "]";
        return temp;
    }
}