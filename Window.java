import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame{
	public Window(){
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Ventas ven=new Ventas();
		Admin adm=new Admin();
		
		this.add(adm,BorderLayout.WEST);
		this.add(ven,BorderLayout.EAST);
		this.add(new Inventario(adm),BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args){
		Window win=new Window();
	}
}
