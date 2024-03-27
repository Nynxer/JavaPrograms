interface Area {
    final static float PI = 3.1415f; // Declare PI as a constant

    float computeArea(float x, float y); // Rename method for clarity
}

class Rectangle implements Area {
    @Override
    public float computeArea(float length, float breadth) { // Use meaningful names
        return length * breadth;
    }
}

class Circle implements Area {
    public float computeArea(float radius) { // Circle only needs radius
        return PI * radius * radius;
    }

    @Override
    public float computeArea(float x, float y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeArea'");
    }
}

public class InterfaceTest { // Use a public class for program entry point
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Area of Rectangle = " + rect.computeArea(5, 2));
        System.out.println("Area of Circle = " + circle.computeArea(5)); // Pass radius
    }
}
