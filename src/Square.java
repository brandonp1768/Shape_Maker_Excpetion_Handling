/**
 * @author Brandon Plyler
 * @date 3/31/2023
 * @section CSC-331-002
 * @purpose a concrete class that represents a square and its characteristics
 */
public class Square extends TwoDimensionalShape{
    private double side_length;
    // Constructor
    /**
     * @param name inherited from the abstract classes
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     * @param side_length represents teh length of the sides of teh square
     */
    Square(String name, int sides, String dimension, double side_length) {
        super(name, sides, dimension);
        this.side_length = side_length;
    }
    // Getters
    /**
     * @return the length of the sides of the square
     */
    public double getLength() {return this.side_length;}
    // Setters
    /**
     * @param length the length the user wants teh sides of teh square to be
     */
    public void setLength(double length) {this.side_length = length;}
    // Methods
    /**
     * @return a string representation of teh square, plus everything the came from the abstract classes
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10f",
                super.toString(),
                "Length: ", this.side_length)
                ;
    }
    /**
     * @return the area of the square, inherited from the abstract classes
     */
    @Override
    public double getArea() {
        return Math.pow(this.side_length, 2);
    }
}
