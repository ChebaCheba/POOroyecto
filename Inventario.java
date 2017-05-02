import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Inventario extends JPanel{
	ArrayList<Producto> productos;
	private Admin adm;
	private Producto pro;
	
	public Inventario(Admin adm){
		super();
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.WHITE);
		this.adm=adm;
		this.productos =new ArrayList<Producto>(0);
		
	}
	
	public void addProducto(Producto p){
		productos.add(p);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString("INVENTARIO", this.getWidth()/2-30, 10);
		g.drawString("ID", 50, 50);
		g.drawString("Tipo de producto", 100, 50);
		g.drawString("Cantidad", 250, 50);
		g.drawString("Vendidos", 400, 50);
		g.drawString("Ganancias", 550, 50);
		
		for(int i=0;i<this.productos.size();i++){
			this.productos.get(i).pintate(g);
		}
		
	}
	
	public ArrayList<Producto> getProducto() {
	    return this.productos;
	  }
	
	
}
