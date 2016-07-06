package capaGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * @author Gonzalo
 * 
 * Es la ventana del Login va a ser la primera ventana que se muestre una vez echo el login se pasa a la ventana principal
 *  
 */


public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPass;
	private JTextField txtUsuario;
	private JButton btnRegistrarme;
	private JButton btnIniciarSesion;
	private boolean ready = false;
	private boolean pressRegistrar = false;

	
	/**
	 * Selector ready
	 */
	
	public boolean getReady()
	{
		return ready;
	}
	
	/**
	 * Modificador ready Login
	 * @param ready
	 */
	
	public void setReady (boolean ready)
	{
		this.ready = ready;
	}
	
	public boolean getPressRegistrar()
	{
		return pressRegistrar;
	}
	
	/**
	 * Modificador del boton registrar
	 * @param pressRegistrar
	 */
	
	public void setPressRegistrar(boolean pressRegistrar)
	{
		this.pressRegistrar = pressRegistrar;
	}
	
	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Imagenes/IconoPrograma.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel Bienvenido = new JLabel("Bienvenido a (Nombre del programa) por favor inicie sesi\u00F3n para continuar");
		
		JLabel lblUsuario = new JLabel("Usuario :");
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		
		btnIniciarSesion = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ready = true;
			}
		});
		
		btnRegistrarme = new JButton("Registrar");
		btnRegistrarme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pressRegistrar = true;
				ready = true;
			}
		});
		
		txtPass = new JPasswordField();
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(Bienvenido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtUsuario)
								.addComponent(txtPass, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btnIniciarSesion, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
									.addComponent(btnRegistrarme, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))))
					.addGap(26))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(Bienvenido)
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea)
						.addComponent(txtPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegistrarme)
						.addComponent(btnIniciarSesion))
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
