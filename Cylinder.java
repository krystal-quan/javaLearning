public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Cylinder no var.
     */
    public Cylinder() {

    }

    /**
     * Cylinder 1 var.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Cylinder 2 var.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Cylinder 3 var.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get Volume.
     */
    public double getVolume() {
        return PI * getRadius() * getRadius() * getHeight();
    }

    /**
     * Override toString.
     */
    public String toString() {
        String temp = "Cylinder[" + super.toString() + ",height=" + height + "]";
        return temp;
    }

    /**
     * Override getArea.
     */
    public double getArea() {
        return 2 * super.getArea() + 2 * PI * getRadius() * height;
    }
}
