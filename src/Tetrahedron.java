/**
 * @author Brandon Plyler
 * @date 3/31/2023
 * @section CSC-331-002
 * @purpose a concrete class that represents a tetrahedron and all of its characteristics
 */
public class Tetrahedron extends ThreeDimensionalShape {
    private double length_side;
    // Constructor
    /**
     * @param name inherited from the abstract classes
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     * @param length_side represents the length of the edges of the tetrahedron
     */
    Tetrahedron(String name, int sides, String dimension, double length_side) {
        super(name, sides, dimension);
        this.length_side = length_side;
    }
    // Getters
    /**
     * @return the length of the edges of the tetrahedron
     */
    public double getLength_side() {return this.length_side;}
    // Setters
    /**
     * @param length_side the length of the edges the user wants them to be
     */
    public void setLength_side(double length_side) {this.length_side = length_side;}
    // Methods
    /**
     * @return a string representation of the tetrahedron, plus everything from the abstract classes
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10f",
                super.toString(),
                "Length of Sides: ", this.length_side)
                ;
    }
    /**
     * @return the area of the tetrahedron, inherited from the abstract classes
     */
    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(this.length_side, 2);
    }
    /**
     * @return the volume of the tetrahedron, inherited from the abstract classes
     */
    @Override
    public double getVolume() { // this is not correct, finish this
        return (Math.pow(this.length_side, 3)) / (6 * Math.sqrt(2));
    }
}
