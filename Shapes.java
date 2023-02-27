class Rectangle {
    int m_width;
    int m_height;

    public void setWidth(int width){
        m_width = width;
    }

    public void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        m_width = side;
        m_height = side;
    }
}

public class Shapes
{
    public static void main (String[]args)
    {
        Rectangle rectangleObject = new Rectangle();

        rectangleObject.setWidth(5);
        rectangleObject.setHeight(10);

        System.out.println("Area of Rectangle : " + rectangleObject.getArea());

        Square squareObject = new Square(5);

        System.out.println("Area of Square : " + squareObject.getArea());

        // Substitute a Square object for a Rectangle object
        Rectangle squareAsRectangle = squareObject;
        System.out.println("Square as rectangle area: " + squareAsRectangle.getArea());
    }
}
