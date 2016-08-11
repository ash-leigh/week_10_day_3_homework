// Step 4
// Use the Factory to get object of concrete class by passing an information such as type

public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();
      // Instance of ShapeFactory allowing us to make an instance of a Shape without using its concrete class or creating an instance of Shape itself - ShapeFactory handles this for us.

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      // this is creating an instance of a circle without using newing it up 

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of circle
      shape3.draw();
   }
}

// Running this produces;
// Inside Circle::draw() method.
// Inside Rectangle::draw() method.
// Inside Square::draw() method.