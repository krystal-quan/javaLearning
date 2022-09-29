public class Square extends Rectangle {
    /**
     * Square 0 var.
     */
    public Square() {

    }

    /**
     * Square 1 var.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Square 3 var.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * setSide.
     */
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    /**
     * getSide.
     */
    public double getSide() {
        return super.getLength();
    }

    /**
     * Override setLength.
     */
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    /**
     * Override setWidth.
     */
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    /**
     * Override toString.
     */
    public String toString() {
        double temp1x = (double) ((int) topLeft.getPointX() * 10) / 10.0;
        double temp1y = (double) ((int) topLeft.getPointY() * 10) / 10.0;
        String temp = "Square[topLeft=(" + temp1x + "," + temp1y + ")";
        temp = temp + ",side=" + super.getLength() + ",color=" + super.getColor();
        return temp + ",filled=" + super.isFilled() + "]";
    }
}
