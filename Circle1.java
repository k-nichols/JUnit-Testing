
public class Circle1 extends Circle
{

/**
* Create new Circle1
* @param x is the x coordinate of the center
* @param y is the y coordinate of the center
* @param radius is the radius
**/
public Circle1(double x, double y, double radius)
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
   if ((Math.abs(center.x - other.center.x) > (radius + other.radius)) ||
       (Math.abs(center.y - other.center.y) > (radius + other.radius)))
      return false;
   return true;
}

}