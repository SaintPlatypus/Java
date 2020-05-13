/**
 * Lab1
 */
public class Lab1 {

//Герон
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double dist_a = (a.distanceTo(b));
        double dist_b = (b.distanceTo(c));
        double dist_c = (c.distanceTo(a));
        double p = (dist_a + dist_b + dist_c)/2;
        return Math.sqrt(p*(p - dist_a)*(p - dist_b)*(p - dist_c));
    }


    public static void main(String[] args) {
        Point3d a = new Point3d(); //Первая точка в пространстве
        Point3d b = new Point3d(3, 7 , 10); //Вторая точка в пространстве 
        Point3d c = new Point3d(5, 11, 6); //Третья точка в пространстве
        if (a.compare(b) || b.compare(c) || a.compare(c))
            System.out.println("Nop");    
        else {
            System.out.println("S = ");
            System.out.println(computeArea(a, b, c));
        }
    }
}