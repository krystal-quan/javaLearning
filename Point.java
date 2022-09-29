import java.util.HashMap;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Point 2 var.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Find distance between 2 point.
     */
    public double distance(Point sec) {
        double ans = (sec.getPointX() - this.pointX) * (sec.getPointX() - this.pointX);
        ans += (sec.getPointY() - this.pointY) * (sec.getPointY() - this.pointY);
        return Math.sqrt(ans);
    }

    /**
     * Check equals.
     */
    public boolean equals(Object temp) {
        if (temp instanceof Point) {
            if (this.toString() == temp.toString()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Hash code var.
     */
    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
