
public class Triangle extends TwoDimensionalShape {
    private double base_length;
    private double height;
    // Constructor
    /**
     * @param name inherited from the abstract classes
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     * @param base_length represents the length of the base of the triangle
     * @param height represents the height of the triangle
     */
    Triangle(String name, int sides, String dimension, double base_length, double height) {
        super(name, sides, dimension);
        this.base_length = base_length;
        this.height = height;
    }
    // Getters
    /**
     * @return the length of the base of the triangle
     */
    public double getBase_length() {return this.base_length;}
    /**
     * @return the height of the triangle
     */
    public double getHeight() {return this.height;}
    // Setters
    /**
     * @param base_length the length of the base the user wants it to be
     */
    public void setBase_length(double base_length) {this.base_length = base_length;};
    /**
     * @param height the height the user wants it to be
     */
    public void setHeight(double height) {this.height = height;}
    // Methods
    /**
     * @return a string representation of the triangle, plus everything from the abstract classes
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10f\n%-10s%-10f",
                super.toString(),
                "Length of Base: ", this.base_length,
                "Height: ", this.height)
                ;
    }
    /**
     * @return the area of the triangle, inherited from the abstract classes
     */
    @Override
    public double getArea() {
        return ((this.base_length * this.height)/2);
    }
}
