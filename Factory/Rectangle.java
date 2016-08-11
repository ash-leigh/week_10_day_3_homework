// Step 2
// Create concrete classes implementing the same interface

public class Rectangle implements Shape {

   @Override
    // If a class inherits a method from its superclass, then there is a chance to override the method provided that it is not marked final. - This class does not have a superclass?? It has an interface.

   // The benefit of overriding is: ability to define a behavior that's specific to the subclass type, which means a subclass can implement a parent class method based on its requirement.

   // In object-oriented terms, overriding means to override the functionality of an existing method.
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
