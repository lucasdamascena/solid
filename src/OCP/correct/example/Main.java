package OCP.correct.example;

/**
 * AreaCalculator is working with an interface, allowing new shapes to be added without needing to modify the calculator's code.
 */
class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(3);

        System.out.println("Área do retângulo: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Área do quadrado: " + areaCalculator.calculateArea(square));
    }
}
