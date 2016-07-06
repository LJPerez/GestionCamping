package capaLogica;
import capaGrafica.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login log = new Login();
		Registros rVisitantes = new Registros();
		GestionLugares GL = new GestionLugares();		
		VentanaRegistrar regUsuarios = new VentanaRegistrar();
		VentanaPrincipal vPrincipal = new VentanaPrincipal();
		
		// Loop infinito
		
		while (true)
		{			
			while (log.getReady() == false)
			{
				log.setVisible(true);
			}
			log.setVisible(false);
		
			if (log.getPressRegistrar() == true);
			{
				while ((regUsuarios.getReady() == false) && (regUsuarios.getPressCancelar() == false) && (regUsuarios.getPressRegistrar() == false))
				{
					regUsuarios.setVisible(true);
				}
			
				regUsuarios.setVisible(false);
			
				if (regUsuarios.getPressCancelar() == true)
				{
					log.setVisible(true);
					regUsuarios.setVisible(false);
					regUsuarios.setReady(false);
					regUsuarios.setCancelar(false);
					regUsuarios.setPressRegistrar(false);
					log.setPressRegistrar(false);
					log.setReady(false);
								
				}	
			}
		
			while (vPrincipal.getReady() == false )
			{
				vPrincipal.setVisible(true);
			}
				
			vPrincipal.setVisible(false);
			
			
			if (vPrincipal.getPressGL() == true)
			{
				while ((GL.getReady() == false) && (GL.getPressCancelar() == false) && (GL.getPressIngresar() == false))
				GL.setVisible(true);
			}
		
			if (GL.getPressCancelar() == true)
			{
				vPrincipal.setVisible(true);
				vPrincipal.setReady(false);
				GL.setReady(false);
				GL.setVisible(false);
				GL.setPressCancelar(false);
			
			}
			else
			{
				GL.setReady(false);
				GL.setPressIngresar(false);
			}
		
			if (vPrincipal.getPressRV() == true)
			{
				while ((rVisitantes.getReady() == false) && (rVisitantes.getPressCancelar() == false) && (rVisitantes.getPressRegistrar() == false))
				{
					rVisitantes.setVisible(true);
				}
			
				if (rVisitantes.getPressCancelar() == true)
				{
					vPrincipal.setVisible(true);
					vPrincipal.setReady(false);
					rVisitantes.setVisible(false);
					rVisitantes.setPressRegistrar(false);
					rVisitantes.setPressCancelar(false);
				}
				else
				{
					rVisitantes.setReady(false);
					rVisitantes.setPressRegistrar(false);
				}
			}
		}
	}	
}
