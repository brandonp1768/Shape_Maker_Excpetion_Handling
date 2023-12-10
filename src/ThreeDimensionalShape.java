
public abstract class ThreeDimensionalShape extends Shape{
    private String name;
    /**
     * @param name represents the name of the shape
     * @param sides inherited from the abstract classes
     * @param dimension inherited from the abstract classes
     */
    ThreeDimensionalShape(String name, int sides, String dimension) {
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
     * @param name represents the name of the shape the user wants it to be
     */
    public void setName(String name) {this.name = name;}
    // Methods
    /**
     * @return a string representation of the shape, plus what is inherited from the shape class
     */
    @Override
    public String toString() {
        return String.format("%s%-10s%-10s\n",
                super.toString(),
                "Name: ", this.name)
                ;
    }
    // Methods
    /**
     * @return the area of the shape, inherited by the more specific 3 dimensional shape
     */
    @Override
    public abstract double getArea();
    /**
     * @return the volume of the 3 dimensional shape, inherited by the more specific 3 dimensional shape
     */
    public abstract double getVolume();
}
