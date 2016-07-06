package capaLogica;

public class LoginUsuarios {

	/*
	 * @author Gonzalo
	 * 
	 * Esta clase va a almacenar los nuevos usuarios y a comprobar cuando un usuario inicia secion que se encuente en la lista
	 * de usuarios registrados
	 * 
	 */
	
	private String usuario;
	private char [] pass = new char [30];
	private String [] usuarios = new String [20];
	
	/*
	 * Este arreglo de arreglos va a almacenar las contraseñas de todos los usuarios registrados en el programa
	 * siendo 20 la cantidad maxima de usuarios que se pueden registar y la contraseña va a tener como maximo 30 caracteres
	 */	
	private char [][] contrasenias = new char [20][30];
	
	private int topeUsuarios = 0;
	private int topePass = 0;
	private int idUsuario;
	
	//Constructor de usuarios
	public LoginUsuarios (String usuario, char[] pass)
	{
		this.usuario = usuario;
		this.pass = pass;
	}
	
	//Modificador de usuario se va a usar para la confirmacion del usuario
	public void setUsuario (String usuario)
	{
		if (usuario != "")
			this.usuario = usuario;
	}
	
	//modifcador pass se va a usar para la confirmacion del pass
	
	public void setPass (char[] pass)
	{
		for (int i = 0; i< pass.length; i++)
		{
			this.pass[i] = pass[i];
		}
	}
	
	// agrega los nuevos usuarios al arreglo
	public void addUsuario()
	{
		
		if (topeUsuarios <=19){
			
			usuarios [topeUsuarios] = usuario;
			topeUsuarios++;		
		}			
	}
	
	// agregar las contraseñas al arreglo
	
	public void addPass ()
	{
		if (topePass <= 19)
		{
			for (int i = 0; i<pass.length; i++)
			{
				contrasenias[topeUsuarios-1][topePass] = pass[i];
			}
		}
			
	}
	
	/*Este metodo verifica si el usuario ingresado en la ventana Login existe en los usuarios registrados
	 * es muy importante que el metodo isUsuario se ejecute primero que el metodo isPass ya que uno le da una variable
	 * que utiliza el otro
	 */
	
	public boolean isUsuario (String usuario)
	{
		//variable de usuario en el while
		int i = 0; 
		boolean esUsuario= false;
		
		while (i < topeUsuarios)
		{
			if (usuario.compareTo(usuarios[i]) == 0)
			{
				esUsuario = true;
			}
			else
			{
				i++;
			}				
		}
		
		// La pocision que ocupa el usuario registrado en el arrey
		idUsuario = i;		
		return esUsuario;
	}
	
	// Este metodo verifica si la contraseña ingresada existe en las contraseñas de usuario
	//'\u0000' es el char nulo
	
	public boolean isPass (char [] pass)
	{	
		boolean contrasenia = true;
		int count = 0;
		int largoPass = 0;
		
		for (int i = 0; i<pass.length; i++)
		{
			if (pass[i] != '\u0000')
				largoPass++;
		}
		
		
		while ((contrasenia) && (count < largoPass))
		{
			if (pass[count] == contrasenias[idUsuario][count])			
				
				count++;
						
			else
				contrasenia = false;
		}
		
		return contrasenia;
	}
}
