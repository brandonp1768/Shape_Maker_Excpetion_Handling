/**
 * @author Brandon Plyler
 * @date 3/31/2023
 * @section CSC-331-002
 * @purpose an abstract class that represents parts of a shape like side, color, and dimension to let other clases
 * that will be more specific to inherit methods from the shape class
 */
public abstract class Shape {
    private int sides;
    private String dimension;
    /**
     * @param dimension whether the shape is 2D or 3D
     * @param sides how many sides (edges) a shape has
     */
    Shape (String dimension, int sides) {
        this.sides = sides;
        this.dimension = dimension;
    }
    // Getters
    /**
     * @return the number of sides a shape has
     */
    public int getSides() {return this.sides;}
    /**
     * @return the dimension of the shape
     */
    public String getDimension() {return this.dimension;}
    // Setters
    /**
     * @param sides the number of sides the user wants the shape to have
     */
    public void setSides(int sides) {this.sides = sides;}
    /**
     * @param dimension the dimension the user wants the shape to have
     */
    public void setDimension (String dimension) {this.dimension = dimension;}
    // Methods
    /**
     * @return a string representation of the shape, more specific shapes override and add other characteristics
     */
    public String toString() {
        return String.format("%-10s%-10s\n%-10s%-10d\n",
                "Dimension: ", this.dimension,
                "Numbers of Sides: ", this.sides)
                ;
    }
    // Methods
    /**
     * @return the area of the shape, overridden by the 2 and 3 dimensional shapes
     */
    public abstract double getArea ();
}
