class Shape {
    private String shapeName;
    private int numberOfEdges;

    // Basic constructor
    public Shape() {
        this.shapeName = "Undefined shape";
        System.out.println("A Shape object has been created.");
    }

    // Constructor for Circle
    public Shape(double radius) {
        this.shapeName = "Circle";
        this.numberOfEdges = 0; // Circles have no edges
        System.out.println("A Circle object has been created with radius: " + radius);
    }

    // Constructor for Square
    public Shape(int edges, double edgeLength) {
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println("A Square object has been created with edges: " + edges + " and edge length: " + edgeLength);
    }

    // Constructor for Rectangle
    public Shape(int edges, double e1, double e2) {
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println("A Rectangle object has been created with edges: " + edges + " and lengths: " + e1 + ", " + e2);
    }

    // Constructor for Triangle
    public Shape(int edges, double e1, double e2, double e3) {
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.println("A Triangle object has been created with edges: " + edges + " and lengths: " + e1 + ", " + e2 + ", " + e3);
    }

    // Method to get shape details
    public String getShapeDetails() {
        return "Shape Name: " + shapeName + ", Number of Edges: " + numberOfEdges;
    }
}

