package net.excelsior.domain;

import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="PROFESOR")
public class Profesor {
 
//    @Id
//    @Column(name="MEETING_ID")
//    @GeneratedValue
//    private Long meetingId;
	
	@Id
    @Column(name="NOMBRE_USUARIO")
    private String nombreUsuario;
     
    @ManyToMany(mappedBy="profesores")
    private Set<MaterialApoyo> materiales = new HashSet<MaterialApoyo>();
     
    public Profesor() {

    }
    
    public Profesor(String nombreUsuario) {
        this.setNombreUsuario(nombreUsuario);
    }

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public boolean equals(Object o){
		return o instanceof Profesor && ((Profesor)o).nombreUsuario.equals(this.nombreUsuario);
	}
     
    // Getter and Setter methods
}