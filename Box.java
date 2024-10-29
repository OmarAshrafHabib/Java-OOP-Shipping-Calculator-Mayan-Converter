/**
 * this class creats an box shaped container
 * 
 * @author Omar Habib ID:3742418
 */
public class Box {
    /**
     * the length of the box container
     */
    private double length;
    /**
     * the width of the box container
     */
    private double width;
    /**
     * the hight of the box container
     */
    private double hight;

    /**
     * this method constructs a Box container
     * 
     * @param length the length of the box container
     * @param width  the width of the box container
     * @param hight  the hight of the box container
     */
    public Box(double length, double width, double hight) {
        this.length = length;
        this.width = width;
        this.hight = hight;
    }

    /**
     * this method retrives the length of the box container
     * 
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * this method retrives the width of the container
     * 
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * this method retrives the hight of the box container
     * 
     * @return
     */
    public double getHight() {
        return hight;
    }

    /**
     * this method calculates the volum of the box container
     * 
     * @return volume
     */
    public double volume() {
        double volume = length * width * hight;
        return volume;
    }

    /**
     * this method calculates the surface area of the box container
     * 
     * @return sa
     */
    public double surfaceArea() {
        double sa = (2 * (length * width)) + (2 * (length * hight)) + (2 * (width * hight));
        return sa;
    }
}
