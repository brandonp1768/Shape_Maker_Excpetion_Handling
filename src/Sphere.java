
public class Sphere extends ThreeDimensionalShape { // the formula for the sphere is 4PIr**2
    private double diameter;
    private double radius;
    // Constructor
    /**
     * @param name inherited from the abstract classes
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     * @param diameter represents the diameter of the sphere
     */
    Sphere(String name, int sides, String dimension, double diameter) {
        super(name, sides, dimension);
        this.diameter = diameter;
        this.radius = diameter / 2;
    }
    // Getters
    /**
     * @return the diameter of the sphere
     */
    public double getDiameter() {return this.diameter;}
    /**
     * @return teh radius of the sphere
     */
    public double getRadius() {return this.radius;}
    // Setters
    /**
     * @param diameter the diameter the user wants the diameter of the sphere to be
     */
    public void setDiameter(double diameter) {this.diameter = diameter;}
    /**
     *
     * @param diameter the diameter that will be divided by 2 to get the radius of the sphere
     */
    public void setRadius(double diameter) {this.radius = diameter/2;}
    // Methods
    /**
     * @return a string representation of the sphere plus everything from the abstract classes
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10f\n%-10s%-10f",
                super.toString(),
                "Diameter: ", this.diameter,
                "Radius: ", this.radius)
                ;
    }
    /**
     * @return the area of the sphere, inherited from the abstract classes
     */
    @Override
    public double getArea() { // put a label on to tell this is the area
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    /**
     * @return the volume of the sphere, inherited from the abstract classes
     */
    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
    }
}
