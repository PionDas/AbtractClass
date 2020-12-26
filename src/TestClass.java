public class TestClass extends TestAbstractClass{
  /*
  - abstract does not support mulitple inheritance
   */

    @Override
    public void printName(String name) {
      System.out.println("Name: " + name);
    }

}
