public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Shape 0 var.
     */
    public Shape() {

    }

    /**
     * Shape 2 var.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    /**
     * Abstract getArea.
     */
    public abstract double getArea();

    /**
     * Abstract getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * toString var.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
