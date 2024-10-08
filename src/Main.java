public class Main {
    public static void main(String[] args) {
        // Creating shape objects
        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 2.0);
        Shape rectangle = new Shape(4, 3.0, 4.0);
        Shape triangle = new Shape(3, 3.0, 4.0, 5.0);
        Shape undefinedShape = new Shape();

        // Getting shape details
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();
        String undefinedShapeDetails = undefinedShape.getShapeDetails();

        // Printing the details
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
        System.out.println(undefinedShapeDetails);
    }
}