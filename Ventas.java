import java.awt.Dimension;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventas extends JPanel{
	private JButton bVendidos;
	private JTextField tfTipo,
					   tfVendidos;
	private Label lAdmin;

	public Ventas(){
		super();
		this.setPreferredSize(new Dimension(200,600));

		this.lAdmin=new Label("Ventas");
		this.add(this.lAdmin);

		this.tfTipo=new JTextField(15);
		this.add(tfTipo);

		this.tfVendidos=new JTextField(15);
		this.add(tfVendidos);
		
		this.bVendidos=new JButton("Vendidos");
		this.add(this.bVendidos);
	}
}
