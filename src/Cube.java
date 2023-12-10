
public class Cube extends ThreeDimensionalShape {
    private double length_side; // length of each side of the cube
    // Constructor
    /**
     * @param name inherited from the abstract classes
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     * @param length_side represents teh length of the edges of the cube
     */
    Cube(String name, int sides, String dimension, double length_side) {
        super(name, sides, dimension);
        this.length_side = length_side;
    }
    // Getters
    /**
     * @return the length of the edges of the cube
     */
    public double getLength_side() {return this.length_side;}
    // Setters
    /**
     * @param length_side represents the length of the edged the user wants the cube to have
     */
    public void setLength_side(double length_side) {this.length_side = length_side;}
    // Methods
    /**
     * @return a string representation of the cube, plus everything inherited from the abstract classes
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10f",
                super.toString(),
                "Length of Sides: ", this.length_side)
                ;
    }
    /**
     * @return the area of the cube, inherited from the abstract classes
     */
    @Override
    public double getArea() {
        return 6 * Math.pow(this.length_side, 2);
    }
    /**
     * @return the volume of the cube, inherited from the abstract classes
     */
    @Override
    public double getVolume() {
        return Math.pow(this.length_side, 3);
    }
}
