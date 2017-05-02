import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Admin extends JPanel implements MouseListener{
	private JButton bEliminar,
				    bProducto,
				    bEditar,
				    bArchivo,
				    bGuardar;
	private JTextField tfTipo,
					   tfPrecio,
					   tfCantidad,
					   tfArchivo;
	private Label lAdmin;
	private JFileChooser fcarchivo;
	private Producto producto;
	private Inventario inventario;
	
	public Admin(){
		super();
		this.setPreferredSize(new Dimension(200,600));
		this.producto=new Producto(0,null,0,0.0);
		this.inventario=new Inventario(null);
		this.addMouseListener(this);
		
		this.lAdmin=new Label("Administrador");
		this.add(this.lAdmin);
		
		this.tfTipo=new JTextField("Tipo",15);
		this.add(tfTipo);
		this.tfTipo.addMouseListener(this);
		
		
		this.tfPrecio=new JTextField("Precio",15);
		this.add(tfPrecio);
		this.tfPrecio.addMouseListener(this);
		this.tfCantidad=new JTextField("Cantidad",15);
		this.add(tfCantidad);
		this.tfCantidad.addMouseListener(this);
		this.bProducto=new JButton("++");
		this.bProducto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Admin.this.producto.setTipo(Admin.this.tfTipo.getText());
				Admin.this.producto.setCantidad(Integer.parseInt(Admin.this.tfCantidad.getText()));
				Admin.this.producto.setPrecio(Double.parseDouble(Admin.this.tfPrecio.getText()));
				Admin.this.producto.setContador();
				Admin.this.producto.setId(Admin.this.producto.getContador());
				Admin.this.inventario.getProducto().add(new Producto(producto.getId(), producto.getTipo(), producto.getCantidad(), producto.getPrecio()));
				Admin.this.inventario.repaint();
			}
		});
		this.add(this.bProducto);
		this.bEliminar=new JButton("--");
		this.add(this.bEliminar);
		this.bEditar=new JButton("Editar");
		this.add(this.bEditar);
		
		this.tfArchivo=new JTextField(15);
		this.add(this.tfArchivo);
		this.fcarchivo=new JFileChooser();
		this.bArchivo=new JButton("Selecciona Archivo");
		this.add(this.bArchivo);
		
		this.add(new Label("                                   "));
		this.bGuardar=new JButton("Guardar");
		this.add(this.bGuardar);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==this.tfTipo && this.tfTipo.getText().equals("Tipo")){
			this.tfTipo.setText("");
		}
		if(e.getSource()==this.tfCantidad && this.tfCantidad.getText().equals("Cantidad")){
			this.tfCantidad.setText("");
		}
		if(e.getSource()==this.tfPrecio && this.tfPrecio.getText().equals("Precio")){
			this.tfPrecio.setText("");
		}
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==this.tfTipo && this.tfTipo.getText().equals("")){
			this.tfTipo.setText("Tipo");
		}
		if(e.getSource()==this.tfCantidad && this.tfCantidad.getText().equals("")){
			this.tfCantidad.setText("Cantidad");
		}
		if(e.getSource()==this.tfPrecio && this.tfPrecio.getText().equals("")){
			this.tfPrecio.setText("Precio");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
