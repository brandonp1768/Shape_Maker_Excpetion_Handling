
public class Circle extends TwoDimensionalShape {
    private double radius;
    private double width;
    // Constructor
    /**
     * @param name inherited from the abstract classes
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     * @param width represents the width (diameter) of a circle
     */
    Circle(String name, int sides, String dimension, double width) {
        super(name, sides, dimension);
        this.width = width;
        this.radius = width / 2;
    }
    // Getters
    /**
     * @return the radius of the circle
     */
    public double getRadius() {return this.radius;}
    /**
     * @return the width of the circle
     */
    public double getWidth() {return this.width;}
    // Setters
    /**
     * @param width represents the width (diameter) the user wants the circle to have
     */
    public void setRadius(double width) {this.radius = width/2;}
    /**
     * @param width represents the width (diameter) the user wants the circle to have
     */
    public void setWidth(double width) {this.width = width;}
    // Methods
    /**
     * @return a string representation of the circle, plus everything that came from the abstract classes
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10f\n%-10s%-10f",
                super.toString(),
                "Width", this.width,
                "Radius: ", this.radius)
                ;
    }
    /**
     * @return the area of the circle, inherited from the abstract classes
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
