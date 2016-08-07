package entrega2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	// ATRIBUTOS
	@Id
	@Column(name = "nombre")
	String nombreDeUsuario;

	@Column(name = "contrasenia")
	String passwordUsuario;

	// GETTERS Y SETTERS

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
		System.out.println("retorno el usuario");
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
}
