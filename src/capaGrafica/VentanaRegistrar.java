package capaGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistrar extends JFrame {

	private JPanel contentPane;	
	private JPasswordField pass;
	private JTextField txtUsuario;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private boolean ready = false;
	private boolean cancelar = false;
	private boolean pressRegistrar = false;
	
	/** selector ready	 * 
	 * @return ready
	 */
	
	public boolean getReady()
	{
		return ready;
	}
	
	/**
	 * Modifucador ready
	 * @param ready
	 */
	public void setReady (boolean ready)
	{
		this.ready = ready;
	}
	
	
	public boolean getPressCancelar()
	{
		return cancelar;
	}
	
	/**
	 * Modificador Cancelar
	 * @param cancelar
	 */
	
	public void setCancelar (boolean cancelar)
	{
		this.cancelar = cancelar;
	}
	
	/**
	 * Selector pressRegistrar
	 * @return true si el boton Registrar fue precionado
	 */
	
	public boolean getPressRegistrar()
	{
		return pressRegistrar;
	}
	
	public void setPressRegistrar(boolean pressRegistrar)
	{
		this.pressRegistrar = pressRegistrar;
	}
	
	/**
	 * Create the frame.
	 */
	public VentanaRegistrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Ingrese los siguentes datos para completar su registro");
		lblRegistro.setBounds(115, 11, 289, 14);
		contentPane.add(lblRegistro);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 47, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 82, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 119, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 154, 75, 14);
		contentPane.add(lblContrasea);
		
		pass = new JPasswordField();
		pass.setBounds(115, 151, 289, 17);
		contentPane.add(pass);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(115, 116, 289, 17);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(115, 79, 289, 17);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(115, 44, 289, 17);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pressRegistrar = true;
				cancelar = false;
				ready = true;				
			}
		});
		btnRegistrar.setBounds(115, 228, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cancelar = true;
				ready = true;
			}
		});
		btnCancelar.setBounds(276, 228, 89, 23);
		contentPane.add(btnCancelar);
	}
}
