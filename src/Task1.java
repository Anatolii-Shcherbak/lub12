public class Task1 {
    enum Shape {
        SQUARE("Equal sides and angles"),
        RECTANGLE("Opposite sides equal and right angles"),
        CIRCLE("Circular shape"),
        TRAPEZOID("One pair of parallel sides"),
        RHOMBUS("All sides equal, opposite angles equal"),
        TRIANGLE("Three sides and three angles"),
        OVAL("Elongated circle"),
        HEXAGON("Six sides and six angles");

        private final String description;

        Shape(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enum Constants and Their Values:\n");

        for (Shape shape : Shape.values()) {
            System.out.println("Constant: " + shape.name());
            System.out.println("Initial Value: " + shape.getDescription());
            System.out.println("Ordinal Value: " + shape.ordinal() + "\n");
        }
    }
}