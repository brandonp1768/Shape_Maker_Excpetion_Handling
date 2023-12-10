import java.util.InputMismatchException;
import java.util.Scanner;


public class ShapeDriver { // all that is left is only displaying two decimal places for the numbers
    // limit the number of decimal places that are displayed from the area and volume and all the other stuff

    /**
     * @param args allows us to pass arguments through the main method
     * @throws InputMismatchException if the user puts in a string for a measurement
     */
    public static void main(String[] args) throws InputMismatchException {
        boolean continueLoop = true; // making boolean variable for do while loop for exception handling
        boolean continueLoop1 = true; // making boolean variable for the first do while loop for exception handling
        Scanner input = new Scanner(System.in);
        int amount = 0;
        do {
            try {
                System.out.print("How Many Shapes Would You Like To Make? "); // put into a try catch
                amount = input.nextInt();
                continueLoop1 = false;
            }
            catch (InputMismatchException e) {
                System.err.printf("Exception: %s%n", e);
                input.nextLine(); // getting rid of the previous input, so we can try again
                System.out.printf("%n%n%s%n%n", "Please Enter An Integer For The Amount Of Shapes You Want! Please " +
                        "Try Again.");
            }
        } while(continueLoop1);
        Shape[] shapes_list = new Shape[amount];
                for (int index = 0; index < shapes_list.length; index++) {
                    do {
                        try {
                            System.out.print("Which Shape Would You Like To Make? ");
                            String shape = input.next();
                            switch (shape.toLowerCase()) {
                                case "circle":
                                    System.out.print("Please Enter The Width Of The Circle: ");
                                    double width = input.nextDouble();
                                    if (width < 0) {
                                        throw new ArithmeticException(); // if the user puts in a negative or 0
                                    }
                                    shapes_list[index] = new Circle("Circle", 0, "2D",
                                            width);
                                    break;
                                case "square":
                                    System.out.print("Please Enter The Length Of The Sides Of The Square: ");
                                    double length = input.nextDouble();
                                    if (length < 0) {
                                        throw new ArithmeticException();
                                    }
                                    shapes_list[index] = new Square("Square", 4, "2D",
                                            length);
                                    break;
                                case "triangle":
                                    System.out.print("Please Enter The Length Of The Base Of The Triangle: ");
                                    double base = input.nextDouble();
                                    if (base < 0) {
                                        throw new ArithmeticException();
                                    }
                                    System.out.print("Please Enter The Height Of The Triangle: ");
                                    double height = input.nextDouble();
                                    if (height < 0) {
                                        throw new ArithmeticException();
                                    }
                                    shapes_list[index] = new Triangle("Triangle", 3,"2D",
                                            base, height);
                                    break;
                                case "cube":
                                    System.out.print("Please Enter The Length Of The Sides Of The Cube: ");
                                    length = input.nextDouble();
                                    if (length < 0) {
                                        throw new ArithmeticException();
                                    }
                                    shapes_list[index] = new Cube("Cube", 12, "3D", length);
                                    break;
                                case "sphere":
                                    System.out.print("Please Enter The Diameter Of The Sphere: ");
                                    double diameter = input.nextDouble();
                                    if (diameter < 0) {
                                        throw new ArithmeticException();
                                    }
                                    shapes_list[index] = new Sphere("Sphere", 0, "3D",
                                            diameter);
                                    break;
                                case "tetrahedron":
                                    System.out.print("Please Enter The Length Of The Edges Of The Tetrahedron: ");
                                    length = input.nextDouble();
                                    if (length < 0) {
                                        throw new ArithmeticException();
                                    }
                                    shapes_list[index] = new Tetrahedron("Tetrahedron", 6, "3D",
                                            length);
                                    break;
                                default: // when the user enters in something that is not a case
                                    throw new InputMismatchException();
                            }
                            continueLoop = false;
                        }
                        catch (InputMismatchException e) { // catching any InputMismatchExceptions and handling them
                            System.err.printf("Exception: %s%n", e);
                            input.nextLine(); // getting rid of the previous input, so we can try again
                            System.out.printf("%n%n%s%n%n", "Enter A Number For Length And Width Questions, A String " +
                                    "For Color Questions, And The Correct Shape Name! Please Try Entering Your Shape " +
                                    "Again.");
                            if (index != 0) {
                                index -= 1; // making it reset at that shapes index in the array, instead of completely
                                // restarting from the beginning
                            }
                        }
                        catch (ArithmeticException e) { // catching any ArithmeticExceptions and handling them
                            System.err.printf("Exception: %s%n", e);
                            input.nextLine(); // getting rid of the previous input, so we can try again
                            System.out.printf("%n%n%s%n%n", "A Shape Cannot Have A Length That Is Negative! Please " +
                                    "Try Entering Your Shapes Again.");
                            if (index != 0) {
                                index -= 1;
                            }
                        }
                    } while (continueLoop);
                }
        System.out.println(); // printing a blank space to split things up
        for (int i = 0; i < shapes_list.length; i++) {
            if (shapes_list[i].getDimension().equalsIgnoreCase("2d")) {
                TwoDimensionalShape s = (TwoDimensionalShape) shapes_list[i];
                System.out.println(s);
                double a = s.getArea();
                System.out.printf("%s%10.2f\n\n", "Area:", a);
                // having multiple new line characters to keep everything split up
            }
            else {
                ThreeDimensionalShape s = (ThreeDimensionalShape) shapes_list[i];
                System.out.println(s);
                double a = s.getArea();
                System.out.printf("%s%10.2f\n", "Area:", a);
                double v = s.getVolume();
                System.out.printf("%s%10.2f\n\n", "Volume:", v);
            }
        }
        System.out.println("Goodbye!");
    }
}
