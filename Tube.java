
/**
 * this class creats a tube shaped container
 * @author Omar habib ID:3742418
 */
import java.lang.Math;

public class Tube {
    /**
     * thr radius of the tube container
     */
    private double radius;
    /**
     * the hight of the tube container
     */
    private double hight;

    /**
     * creats the tube container object
     * 
     * @param radius the radius of the tube container
     * @param hight  the hight of the tube container
     */
    public Tube(double radius, double hight) {
        this.radius = radius;
        this.hight = hight;
    }

    /**
     * retrives the radius of the tube container
     * 
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * retrives the hight of the cube container
     * 
     * @return hight
     */
    public double getHight() {
        return hight;
    }

    /**
     * calculates the volume of the tube container
     * 
     * @return volume
     */
    public double volume() {
        double volume = (Math.PI * Math.pow(radius, 2)) * hight;
        return volume;
    }

    /**
     * calculates the surface area of the tube container
     * 
     * @return sa
     */
    public double surfaceArea() {
        double sa = 2 * (Math.PI * radius * hight) + 2 * (Math.PI * Math.pow(radius, 2));
        return sa;
    }

}
