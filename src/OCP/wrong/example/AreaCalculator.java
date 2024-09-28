package OCP.wrong.example;

/**
 *
     Constant modifications: Whenever you want to add a new shape (e.g., a circle or a triangle), you will need to modify the AreaCalculator class.
     This violates the principle that the class should be closed for modifications.

     Mixing responsibilities: The AreaCalculator class knows specific details about each shape, which goes against encapsulation.
     Each shape should be responsible for calculating its own area.

     Use of instanceof: The use of instanceof is a sign that the code is dealing with multiple types in a rigid manner,
     forcing the code to handle each separately, making it less extensible.
 */

class AreaCalculator {
    double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            return square.getSide() * square.getSide();
        }
        return 0;
    }
}
