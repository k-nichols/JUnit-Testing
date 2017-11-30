/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1, circleIntersect1;
   private Circle2 circleIntersect2, circleIntersect3;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
   circleIntersect1 = new Circle1(0,0,1);
   circleIntersect2 = new Circle2(0,1,1);
   circleIntersect3 = new Circle2(0,2.01,1);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

  /******************/
 /** CIRCLE TESTS **/
/******************/
//
//Test a simple scaling
//
@Test
public void simpleScale()
{
	System.out.println("Running test simpleScale.");
	circle1.radius = circle1.scale(2);
	Assert.assertTrue(circle1.radius == 6);
}

//
//Test a simple scaling
//
@Test
public void simpleScaleNeg()
{
	System.out.println("Running test simpleScaleNeg.");
	circle1.radius = circle1.scale(-2);
	Assert.assertTrue(circle1.radius == -6);
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,2);
   Assert.assertTrue(p.x == 2 && p.y == 4);
}

// 
// Test a simple negative mov4)e
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

  /*******************/
 /** CIRCLE1 TESTS **/
/*******************/
//
//Tests the Circle1 constructor
//
@Test
public void circle1Constructor()
{
	System.out.println("Running test circle1Constructor.");
	Assert.assertTrue(circle1.center.x == 1 && circle1.center.y == 2 && circle1.radius == 3);
}

//
//Test a simple intersection
//
@Test
public void simpleIntersection()
{
	boolean truthVal;
	System.out.println("Running test simpleIntersection.");
	truthVal = circleIntersect1.intersects(circleIntersect2);
	Assert.assertTrue(truthVal == true);
}

//
//Test a simple intersection
//
@Test
public void simpleNonintersection()
{
	boolean truthVal;
	System.out.println("Running test simpleNonintersection.");
	truthVal = circleIntersect1.intersects(circleIntersect3);
	Assert.assertTrue(truthVal == false);
}


/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}