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
        
        @MvcBinding @FormParam("fonction")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String fonction;
        
        @MvcBinding @FormParam("adresse")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String adresse;

        @MvcBinding @FormParam("ville")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String ville;
        
        @MvcBinding @FormParam("region")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String region;
        
        @MvcBinding @FormParam("code_postal")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String code_postal;
        
        @MvcBinding @FormParam("pays")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String pays;
        
        @MvcBinding @FormParam("telephone")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String telephone;
        
        @MvcBinding @FormParam("fax")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String fax;
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
        
        
        
        public String getfonction() {
		return fonction;
	}
        
        public void setfonction(final String fonction){
                this.fonction = fonction;
        }
        
        public String getadresse() {
		return adresse;
        }
        public void setadresse(final String adresse) {
		this.adresse = adresse;
	}
        public String getville() {
		return ville;
	}
        
         public void setville(final String ville) {
		this.ville = ville;
	}
            
         public void setregion(final String region) {
		this.region = region;
	}
        
        public String getregion() {
		return region;
	}
        
         public void setcode_postal(final String code_postal) {
		this.code_postal = code_postal;
	}
        
        public String getcode_postal() {
		return code_postal;
	}
        
         public void setpays(final String pays) {
		this.pays = pays;
	}
        
        public String getpays() {
		return pays;
	}
        
         public void settelephone(final String telephone) {
		this.telephone = telephone;
	}
        
        public String gettelephone() {
		return telephone;
	}
        
         public void setfax(final String fax) {
		this.fax = fax;
	}
        
        public String getfax() {
		return fax;
	}
}
