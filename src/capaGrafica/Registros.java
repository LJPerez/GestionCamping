package capaGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Registros extends JFrame {

	private JPanel contentPane;
	private JTextField txtAlojamiento;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JComboBox comboNacionalidad;
	private JTextField txtCantPersonas;
	private JTextField txtNroTarjeta;
	private JTextField txtTelefono;
	private JTextField txtEdad;
	private JDateChooser dateFechaSalida;
	private JDateChooser dateFechaIngreso;
	private JTextField txtMontoPagar;
	private JButton btnRegistrar;
	private JButton btnCancelar;
	private boolean ready = false;
	private boolean pressCancelar = false;
	private boolean pressRegistrar =false;

	/**
	 * Selector ready
	 */
	
	public boolean getReady()
	{
		return ready;
	}
	
	/**
	 * Modificador ready
	 * @param ready
	 */
	
	public void setReady (boolean ready)
	{
		this.ready = ready;
	}
	 /**
	  * selector pressCacelar
	  * @return true si cancelar fue precionado
	  * 
	  */
	public boolean getPressCancelar()
	{
		return pressCancelar;
	}
	
	/**
	 * Modificador pressCancelar
	 * @param pressCancelar
	 */
	
	public void setPressCancelar(boolean pressCancelar)
	{
		this.pressCancelar = pressCancelar;
	}
	
	/**
	 * Selector pressRegistrar
	 * @return true si el boton registrar fue precionado
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
	public Registros() {
		setTitle("Registros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 142, 35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		JLabel lblDocumento = new JLabel("Documento:");
		
		JLabel lblNewLabel = new JLabel("Nacionalidad:");
		
		JLabel lblNewLabel_1 = new JLabel("Alojamiento:");
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de ingreso:");
		
		JLabel lblMontoAPagar = new JLabel("Monto a pagar:");
		
		txtAlojamiento = new JTextField();
		txtAlojamiento.setToolTipText("Ingrese aqui en donde se hospedara");
		txtAlojamiento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setToolTipText("Ingrese aqui su documento sin puntos ni guiones");
		txtDocumento.setColumns(10);
		
		comboNacionalidad = new JComboBox();
		comboNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"Uruguay", "Argentina", "Brasil", "Paraguay", "Chile", "Otra"}));
		comboNacionalidad.setToolTipText("Ingrese aqui su nacionalidad");
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("Ingrese aqui su nombre y su apellido");
		txtNombre.setColumns(10);
		
		dateFechaIngreso = new JDateChooser();
		dateFechaIngreso.setToolTipText("Ingrese aqui cuando se alojara en el camping");
		
		JLabel lblEdad = new JLabel("Edad:");
		
		JLabel lblTelefono = new JLabel("Telefono:");
		
		JLabel lblCantDePersonas = new JLabel("Cantidad de personas:");
		
		JLabel lblNewLabel_2 = new JLabel("Nro tarjeta de credito:");
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de salida:");
		
		txtCantPersonas = new JTextField();
		txtCantPersonas.setToolTipText("Ingrese aqui la cantidad de personas que se alojaran con usted");
		txtCantPersonas.setColumns(10);
		
		txtNroTarjeta = new JTextField();
		txtNroTarjeta.setToolTipText("Ingrese aqui un numero de tarjeta de credito(esto es por motivos de seguridad para el camping, en caso de que se quiera ir sin pagar)");
		txtNroTarjeta.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setToolTipText("Ingrese aqui su telefono o celular");
		txtTelefono.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setToolTipText("Ingrese aqui su edad");
		txtEdad.setColumns(10);
		
		dateFechaSalida = new JDateChooser();
		dateFechaSalida.setToolTipText("Ingrese aqui cuando se retirara");
		
		txtMontoPagar = new JTextField();
		txtMontoPagar.setToolTipText("El monto se ingresara automaticamente despues de completar todos los espacios en blanco");
		txtMontoPagar.setText("$");
		txtMontoPagar.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(UIManager.getColor("Button.shadow"));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pressRegistrar = false;
				pressCancelar = true;				
			}
		});
		btnCancelar.setForeground(Color.RED);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(UIManager.getColor("Button.shadow"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				pressCancelar = false;
				pressRegistrar = true;
			}
		});
		btnRegistrar.setForeground(new Color(0, 128, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFechaDeIngreso)
								.addComponent(lblMontoAPagar)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblDocumento)
										.addComponent(lblNewLabel)
										.addComponent(lblNombre))
									.addGap(33)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addComponent(comboNacionalidad, 0, 190, Short.MAX_VALUE)
										.addComponent(txtDocumento, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addComponent(txtAlojamiento, 0, 0, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(txtMontoPagar, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addComponent(dateFechaIngreso, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblEdad)
										.addComponent(lblTelefono)
										.addComponent(lblCantDePersonas, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtTelefono)
								.addComponent(txtNroTarjeta)
								.addComponent(txtCantPersonas, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(dateFechaSalida, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnRegistrar)
							.addGap(12)
							.addComponent(btnCancelar)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEdad)
						.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDocumento)
						.addComponent(txtDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefono)
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboNacionalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCantDePersonas)
						.addComponent(txtCantPersonas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtAlojamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtNroTarjeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblFechaDeIngreso)
							.addGap(87)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMontoAPagar)
								.addComponent(txtMontoPagar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(dateFechaIngreso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(dateFechaSalida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegistrar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblNombre, txtNombre, lblEdad, txtEdad, lblDocumento, txtDocumento, lblNewLabel_2, txtNroTarjeta, lblTelefono, txtTelefono, lblNewLabel, comboNacionalidad, lblFechaDeIngreso, dateFechaIngreso, lblNewLabel_3, dateFechaSalida, lblNewLabel_1, txtAlojamiento, lblCantDePersonas, txtCantPersonas, lblMontoAPagar, txtMontoPagar, btnCancelar, btnRegistrar, dateFechaSalida.getCalendarButton(), dateFechaIngreso.getCalendarButton()}));
	}
}
