package form;

import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import java.io.Serializable;

public class ClientForm implements Serializable {

	private static final long serialVersionUID = -3523783484400524581L;

	@MvcBinding @FormParam("nom")
	@Size(min = 1, max = 50)
	private String nom;

	@MvcBinding @FormParam("code")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String code;

	// Getters, setters
	
	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(final String code) {
		this.code = code;
	}
}
