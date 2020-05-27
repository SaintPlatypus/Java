import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator
{
	 public static final int MAX_ITERATIONS = 2000;//Максимальное число итераций 

    public void getInitialRange(Rectangle2D.Double range){//Определение области для конкретного фрактала
	    range.x = -2;
	    range.y = -1.5;
	    range.height = 4;
	    range.width = 4;
	}
    public int numIterations(double x, double y) {//Метод реализует итеративную функцию для фрактала Мандельброта
	    double x1 = 0;
        double y1 = 0;
        
        for(int i = 0; i < MAX_ITERATIONS; i++){
	        double x2 = x1 * x1 - y1 * y1 + x; 
	        double y2 =-2 * x1 * y1 + y;
	        x1 = x2;
	        y1 = y2;
            if (x1 * x1 + y1 * y1 > 4)
	            return i; 
	    }
	    return -1; // выход за границы
	}
	 public String toString() {//Управлять коллекцией объектов
        return "Tricorn";
    }
}