import java.awt.Graphics;

public class Producto {
	private String tipo;
	private int cantidad,
				id,
				contador,
				vendidos;
	private double precio,
				   ganancias;
	
	public Producto(int id, String tipo, int cantidad, double precio) {
		this.tipo=tipo;
		this.cantidad=cantidad;
		this.precio=precio;
		this.contador=0;
	}
	public void Ventas(int vendidos){
		this.vendidos=this.cantidad-vendidos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGanancias() {
		return ganancias;
	}
	public void setGanancias(double vendidos) {
		this.ganancias = vendidos;
	}
	public void setContador(){
		this.contador++;
	}
	public int getContador(){
		return this.contador;
	}
	public void setVendidos(int vendidos){
		this.vendidos=vendidos;
	}
	public int getVendidos(){
		return this.vendidos;
	}
	public void pintate(Graphics g){
		g.drawString(Integer.toString(this.id), 50, 60+10*this.contador);
		g.drawString(this.tipo, 100, 60+10*this.contador);
		g.drawString(Integer.toString(this.cantidad), 250, 60+10*this.contador);
		g.drawString(Integer.toString(this.vendidos), 400, 60+10*this.contador);
		g.drawString(Double.toString(this.ganancias), 550, 60+10*this.contador); 
	}
	
}
