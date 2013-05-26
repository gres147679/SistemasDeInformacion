/**
 * 
 */
package net.excelsior.Authentication;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author gustavo
 *
 */
public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	
	public String authenticate() throws InstantiationException, IllegalAccessException{
		if (DatabaseLookups.checkPassword(this.username,this.password)){
			return "success";
		}
		else{
			addActionError(getText("error.login"));
			return "error";
		}		
		
	}
	
	/**
	 * Obtiene el nombre de usuario de la instancia.
	 * Este m�todo siempre retorna.
	 * 
	 * @return	Nombre de usuario
	 */
	public String getUsername(){
		return this.username;
	}
	
	/**
	 * Obtiene la clave de la instancia.
	 * Este m�todo siempre retorna.
	 * 
	 * @return	Clave
	 */
	public String getPassword(){
		return this.password;
	}
	
	/**
	 * Setea el nombre de usuario de la instancia.
	 * Este m�todo siempre retorna.
	 * @param	usuario		Nombre de usuario
	 */
	public void setUsername(String user){
		this.username = user;
	}
	/**
	 * Setea la clave de la instancia.
	 * Este m�todo siempre retorna.
	 * @param Clave
	 */
	public void setPassword(String pass){
		this.password = pass;
	}
	
	/**
	 * M�todo: autentica
	 * Descripci�n: Obtiene al informaci�n de la base de datos para
	 * determinar si el usuario est� autenticado
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * 
	 */
}
