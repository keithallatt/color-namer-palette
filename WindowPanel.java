import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowPanel extends JPanel {
	Color selectedColor;

	public WindowPanel() {
		setPreferredSize(new Dimension(1000,500));
	
		selectedColor = Color.BLACK; // default color
	}

	public void paintComponent(Graphics g) {
		Graphics2D page = (Graphics2D)g;

		page.setColor(selectedColor);
		page.fillRect(0,0,1000,500);

		page.setColor(UIManager.getColor("Panel.background"));

		page.fillRect(5,5,990,490);		

		{	// Color panel picker (square, light on top, dark on bottom, hues in the middle)
			int xOffset = 30;
			int yOffset = 30;
			int height = 440;
			int width = 440;
			for (int i = 0; i < width; i++) {
				float hue = (float)i / width;
				for (int j = 0; j < height; j++) {
					float saturation, brightness;
					
					saturation = 1.0f;
					brightness = 1.0f;

					if (j < height / 2) {
						saturation = ( (float)j ) / ( height / 2 );
					} else {
						brightness = ( height - (float)j) / (height / 2);
					}

					page.setColor(Color.getHSBColor(hue, saturation, brightness));

					page.fillRect(xOffset + i, yOffset + j, 1, 1);
				}
			}

		}
	}
}
