

public class Circle2 extends Circle
{

/**
* Create new Circle2
* @param x is the x coordinate of the center
* @param y is the y coordinate of the center
* @param radius is the radius
**/
public Circle2(double x, double y, double radius)
{
   super(x,y,radius);
}

/**
* Determines if Circle1 and Circle2 intersect
* @param other is the object containing a circle
* @return true if intersection occurs, false if not
**/
public boolean intersects(Circle other)
{
   double d;
   d = Math.pow(center.x - other.center.x, 2) + 
       Math.pow(center.y - other.center.y, 2);
   if (d <= Math.pow(radius + other.radius, 2))
      return true;
   else
      return false;
}

}