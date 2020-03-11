import javax.swing.*;
import java.awt.event.*;

public class Square {
    public static String GreenFrog = "pieces/GreenFrog.png";
    public static String GreenFrog2 = "pieces/GreenFrog2.png";
    public static String LilyPad = "pieces/LilyPad.png";
    public static String RedFrog = "pieces/RedFrog.png";
    public static String RedFrog2 = "pieces/RedFrog2.png";
    public static String Water = "pieces/Water.png";
   
    private JButton btn;
	private int location;
	private String info;

    public Square(int location, String info) {
		this.location = location;
		btn = new JButton();
		this.info = info;
		ImageIcon icon = new ImageIcon(this.info);
		btn.setIcon(icon);

    
    }

    public JButton getBtn() {
		return btn;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
		ImageIcon icon = new ImageIcon(this.info);
		btn.setIcon(icon);
	}

	public void moveTo(Square squ) {
		squ.setInfo(this.info);
		this.setInfo(Water);

	}

	public boolean canMoveto(Square squ) {
		if (squ.getInfo().equals(Water)) {
			return true;
		} else
			return false;
	}

}