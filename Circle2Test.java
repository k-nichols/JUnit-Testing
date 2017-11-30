import org.junit.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Circle2Test {

   // Data you need for each test case
   private Circle2 circle2, circleIntersect1;
   private Circle1 circleIntersect2, circleIntersect3;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle2 = new Circle2(1,2,3);
   circleIntersect1 = new Circle2(0,0,1);
   circleIntersect2 = new Circle1(0,1,1);
   circleIntersect3 = new Circle1(0,2.01,1);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}
	
  /*******************/
 /** CIRCLE2 TESTS **/
/*******************/
//
//Tests the Circle2 constructor
//
@Test
public void circle2Constructor()
{
	System.out.println("Running test circle2Constructor.");
	Assert.assertTrue(circle2.center.x == 1 && circle2.center.y == 2 && circle2.radius == 3);
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
}
