package net.excelsior.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.hibernate.validator.Valid;

import net.excelsior.dao.TituloDAO;
import net.excelsior.dao.TituloDAOImpl;
import net.excelsior.domain.Titulo;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TituloAction extends ActionSupport implements ModelDriven<Titulo> {

	private static final long serialVersionUID = -6659925652584240539L;
    
	@Valid
	private Titulo titulo = new Titulo();
	private List<Titulo> tituloList = new ArrayList<Titulo>();
	private TituloDAO tituloDAO = new TituloDAOImpl();
	
	
	
	public Titulo getModel() {
		return titulo;
	}
	
	/**
	 * To save or update user.
	 * @return String
	 */
	public String saveOrUpdate()
	{	
		tituloDAO.saveOrUpdateTitulo(titulo);
		return SUCCESS;
	}
	
	/**
	 * To list all users.
	 * @return String
	 */
	public String list()
	{
		Map<String, Object> session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		
		tituloList = tituloDAO.listTitulo(username);
		return SUCCESS;
	}

	public String Mod()
	{
		return SUCCESS;
	}
	/**
	 * To delete a user.
	 * @return String
	 */
	public String delete()
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		tituloDAO.deleteTitulo(Long.parseLong(request.getParameter("id")));
		return SUCCESS;
	}
	
	/**
	 * To list a single user by Id.
	 * @return String
	 */
	public String edit()
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		titulo = tituloDAO.listTituloById(Long.parseLong(request.getParameter("id")));
		return SUCCESS;
	}
	
	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public List<Titulo> getTituloList() {
		return tituloList;
	}

	public void setTituloList(List<Titulo> tituloList) {
		this.tituloList = tituloList;
	}

}
