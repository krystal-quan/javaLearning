public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * Circle 0 var.
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
     * Circle 3 var.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Circle 3 var.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Abstract getArea.
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Abstract getPerimeter.
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Override toString.
     */
    public String toString() {
        double temp1x = (double) ((int) center.getPointX() * 10) / 10.0;
        double temp1y = (double) ((int) center.getPointY() * 10) / 10.0;
        String temp = "Circle[center=(" + temp1x + "," + temp1y + ")";
        temp = temp + ",radius=" + radius + ",color=" + super.getColor() + ",filled=";
        return temp + super.isFilled() + "]";
    }

    /**
     * Check equals.
     */
    public boolean equals(Object temp) {
        if (temp instanceof Circle) {
            if (this.hashCode() == temp.hashCode()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Hashcode var.
     */
    public int hashCode() {
        return this.toString().hashCode();
    }
}
