import java.awt.*;
import javax.swing.*;

public class ColorPalette {
	public static void main(String[]args) {
		JFrame frame = new JFrame("Color Palette");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WindowPanel windowPanel = new WindowPanel();

		frame.getContentPane().add(windowPanel);

		frame.pack();
		frame.setVisible(true);
	}
}
