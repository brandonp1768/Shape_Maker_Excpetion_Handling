/**
 * @author Brandon Plyler
 * @date 3/31/2023
 * @section CSC-331-002
 * @purpose an abstract class that represents a two-dimensional shape that will let more specific shapes
 * inherit its methods and characteristics
 */
public abstract class TwoDimensionalShape extends Shape{ // make sure that you put labels on to all the getarea methods
    private String name;
    /**
     * @param name represents the name of the shape
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     */
    TwoDimensionalShape (String name, int sides, String dimension) {
        super(dimension, sides);
        this.name = name;
    }
    // Getters
    /**
     * @return the name of the shape
     */
    public String getName() {return this.name;}
    // Setters
    /**
     * @param name the name of the user wants the shape to be
     */
    public void setName (String name) {this.name = name;}
    // Methods
    /**
     * @return a string representation of the shape, plus what is inherited form the shape class
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10s\n",
                super.toString(),
                "Name: ", this.name)
                ;
    }
    /**
     * @return the area of the shape, to be inherited by the more specific two-dimensional shapes
     */
    @Override
    public abstract double getArea();
}
