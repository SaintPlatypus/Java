/**
 * Point3d
 */
public class Point3d {

    private double xCoord; // Координата Х
    private double yCoord; // Координата Y
    private double zCoord; // Координата Z
    public Point3d(double x, double y, double z){ //Конструктор иницилизации
        xCoord = x;
        yCoord = y;
        zCoord = z; 
    }

//Дефолтные координаты
    public Point3d(){
        this(0, 0, 0);
    }

//Возвращение координат X,Y,Z
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }

//Устанавливаем координаты для X,Y,Z
    public void setX(double coord){
        xCoord = coord;
    }
    public void setY(double coord){
        yCoord = coord;
    }
    public void setZ(double coord){
        zCoord = coord;
    }

//Проверка на равенство 
    public boolean compare(Point3d com) {
        return (this.getX() == com.getX() && this.getY() == com.getY() && this.getZ() == com.getZ());
    }
    
//Вычисляем расстояние до 2 точки
    public double distanceTo(Point3d TwoCoord){
        double x1 = this.getX(), x2 = TwoCoord.getX();
        double y1 = this.getY(), y2 = TwoCoord.getY();
        double z1 = this.getZ(), z2 = TwoCoord.getZ();
        double dist = Math.sqrt( Math.pow(x2-x1, 2) +  Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2));
        return dist;
    }
}