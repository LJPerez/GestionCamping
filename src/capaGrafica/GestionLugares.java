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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class GestionLugares extends JFrame {

	private JPanel contentPane;
	private JTextField txtCanCabanias;
	private JTextField txtCantParcelas;
	private JTextField txtCantPersonasPorCabania;
	private JTextField txtCantPersonasPorParcela;
	private JTextField txtPrecioCabania;
	private JTextField txtPrecioParcela;
	private boolean ready = false;
	private boolean pressCancelar = false;
	private boolean pressIngresar = false;
	
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
	
	public void setReady(boolean ready)
	{
		this.ready = ready;
	}
	
	/**
	 * Selector pressCancelar
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
	 * Selector pressIngresar
	 * @return true si el boton ingresar fue precionado
	 */
	
	public boolean getPressIngresar()
	{
		return pressIngresar;
	}
	
	public void setPressIngresar(boolean pressIngresar)
	{
		this.pressIngresar = pressIngresar;
	}
	
	/**
	 * Create the frame.
	 */
	public GestionLugares() {
		setTitle("Gestion de Lugares ");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCantidadDeCabaas = new JLabel("Cantidad de caba\u00F1as:");
		
		JLabel lblCantidadDeParcelas = new JLabel("Cantidad de parcelas:");
		
		JLabel label = new JLabel("");
		
		txtCanCabanias = new JTextField();
		txtCanCabanias.setColumns(10);
		
		txtCantParcelas = new JTextField();
		txtCantParcelas.setColumns(10);
		
		JLabel lblCantidadMaximaDe = new JLabel("Cantidad maxima de personas por caba\u00F1a:");
		
		JLabel lblCantidadMaximaDe_1 = new JLabel("Cantidad maxima de personas por parcela:");
		
		txtCantPersonasPorCabania = new JTextField();
		txtCantPersonasPorCabania.setColumns(10);
		
		txtCantPersonasPorParcela = new JTextField();
		txtCantPersonasPorParcela.setColumns(10);
		
		JLabel lblPrecioPorDia = new JLabel("Precio por dia para cada caba\u00F1a:");
		
		JLabel lblPrecioPorDia_1 = new JLabel("Precio por dia por persona en una parcela:");
		
		txtPrecioCabania = new JTextField();
		txtPrecioCabania.setColumns(10);
		
		txtPrecioParcela = new JTextField();
		txtPrecioParcela.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ready = false;
				pressCancelar = true;
			}
		});
		btnCancelar.setForeground(Color.RED);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ready = true;
			}
		});
		btnIngresar.setForeground(new Color(0, 128, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPrecioPorDia_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPrecioParcela, 0, 0, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblCantidadDeCabaas)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtCanCabanias, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblCantidadDeParcelas)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtCantParcelas, 0, 0, Short.MAX_VALUE))
											.addComponent(label))
										.addComponent(lblCantidadMaximaDe)
										.addComponent(lblCantidadMaximaDe_1)
										.addComponent(lblPrecioPorDia))
									.addGap(4)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtPrecioCabania, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtCantPersonasPorParcela, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
											.addComponent(txtCantPersonasPorCabania, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))))
							.addContainerGap(27, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnIngresar)
							.addGap(18)
							.addComponent(btnCancelar)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidadDeCabaas)
						.addComponent(txtCanCabanias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidadDeParcelas)
						.addComponent(txtCantParcelas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCantidadMaximaDe)
							.addComponent(txtCantPersonasPorCabania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidadMaximaDe_1)
						.addComponent(txtCantPersonasPorParcela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPrecioCabania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrecioPorDia))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPrecioPorDia_1)
						.addComponent(txtPrecioParcela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnIngresar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
