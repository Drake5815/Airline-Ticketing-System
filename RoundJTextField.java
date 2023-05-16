/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_ticketing_system;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
/**
 *
 * @author Engilo Grave
 */
public class RoundJTextField extends javax.swing.JTextField{
    private Shape shape;
	public RoundJTextField() {}
	public RoundJTextField(int size) {
		super(size);
		setOpaque(false);
	}
	
	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		super.paintComponent(g);
	}
	
	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	
	public boolean contains(int x, int y) {
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		}
		return shape.contains(x, y);
	}
}
