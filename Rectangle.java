public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Rectangle 0 var.
     */
    public Rectangle() {

    }

    /**
     * Rectangle 2 var.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle 4 var.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle 5 var.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * Abstract getArea.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Abstract getPerimeter.
     */
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * Override toString.
     */
    public String toString() {
        double temp1x = (double) ((int) topLeft.getPointX() * 10) / 10.0;
        double temp1y = (double) ((int) topLeft.getPointY() * 10) / 10.0;
        String temp = "Rectangle[topLeft=(" + temp1x + "," + temp1y + ")";
        temp = temp + ",width=" + width + ",length=" + length + ",color=";
        return temp + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

    /**
     * Check equals.
     */
    public boolean equals(Object temp) {
        if (temp instanceof Rectangle) {
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
