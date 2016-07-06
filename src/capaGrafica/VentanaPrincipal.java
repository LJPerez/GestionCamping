package capaGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnRegistrarVisitantes;
	private JButton btnNroVisitantes;
	private JButton btnNuevoUsuario;
	private JButton btnGestionLugares;
	private JButton btnPromedioDias;
	private JButton btnIngresosMensuales;
	private JButton btnCerrarSesion;
	private boolean ready = false;
	private boolean pressGL = false;
	private boolean pressRV = false;
	
	/**
	 * selector ready
	 */
	
	public boolean getReady()
	{
		return ready;
	}
	
	/**
	 * modificador ready
	 */
	
	public void setReady (boolean ready)
	{
		this.ready = ready;
	}
	
	/**
	 * Selector de gestion lugares GL
	 */
	
	public boolean getPressGL()
	{
		return pressGL;
	}
	
	/**
	 * Modificador GL
	 * @param pressGL
	 */
	
	public void setGL (boolean pressGL)
	{
		this.pressGL = pressGL;
	}
	
	/**
	 * Selector pressRV (Registrar VIsitantes)
	 */
	
	public boolean getPressRV()
	{
		return pressRV;
	}
	
	/**
	 * Modificador RV
	 * @param pressRV
	 */
	
	public void setPressRV(boolean pressRV)
	{
		this.pressRV = pressRV;
	}
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBienvenidoACas = new JLabel("Bienvenido a CAS (nombre usuario) elige una opcion: ");
		
		btnRegistrarVisitantes = new JButton("Registrar Visitantes");
		btnRegistrarVisitantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				pressRV = true;
				ready = true;
			}
		});
		
		btnNroVisitantes = new JButton("Comprobar Visitantes");
		
		btnGestionLugares = new JButton("Gestion Lugares");
		btnGestionLugares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pressGL = true;
				ready = true;
			}
		});
		
		btnPromedioDias = new JButton("Promedio D\u00EDas");
		
		btnNuevoUsuario = new JButton("Nuevo Usuario");
		
		btnIngresosMensuales = new JButton("Ingresos Mensuales");
		
		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		
		JLabel lblSePuedeAadir = new JLabel("SE PUEDE A\u00D1ADIR UN MENU ACA");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(79)
								.addComponent(lblBienvenidoACas))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnRegistrarVisitantes)
									.addComponent(btnNroVisitantes)
									.addComponent(btnNuevoUsuario))
								.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnPromedioDias)
									.addComponent(btnGestionLugares)
									.addComponent(btnIngresosMensuales))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(139)
							.addComponent(btnCerrarSesion))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblSePuedeAadir)))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblSePuedeAadir)
					.addGap(49)
					.addComponent(lblBienvenidoACas)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegistrarVisitantes)
						.addComponent(btnGestionLugares))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNroVisitantes)
						.addComponent(btnPromedioDias))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIngresosMensuales)
						.addComponent(btnNuevoUsuario))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(btnCerrarSesion))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
