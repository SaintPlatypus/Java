import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class JImageDisplay extends JComponent{

    private BufferedImage image;
    public JImageDisplay(int x, int y) {//Конструктор
		image = new BufferedImage(x,y,TYPE_INT_RGB); //ширина,высота и тип изображения(красные, зеленые и синие компоненты имеют по 8 битов)
	    setPreferredSize(new Dimension(x, y));//метод родительского класса метод с указанной шириной и высотой
    }
    public void paintComponent (Graphics g){//Отрисовка фракталов
		g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
    public void clearImage (){ //Все цвета в черной (RGB 0)
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++)
			    image.setRGB(x, y, 0);
		}
    }
    public void drawPixel (int x, int y, int rgbColor) {//Устанавливают на пиксели опр изображения
	    image.setRGB(x, y, rgbColor);
    }
}