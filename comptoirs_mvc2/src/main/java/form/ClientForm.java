package form;

import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import java.io.Serializable;

public class ClientForm implements Serializable {

	private static final long serialVersionUID = -3523783484400524581L;

	@MvcBinding @FormParam("contact")
	@Size(min = 1, max = 50)
	private String contact;

	@MvcBinding @FormParam("code")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String code;
        
        @MvcBinding @FormParam("societe")
	@Size(min = 1, max = 50)
	private String societe;
        
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
        
        @MvcBinding @FormParam("région")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String region;
        
        @MvcBinding @FormParam("code postal")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String code_postal;
        
        @MvcBinding @FormParam("pays")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String pays;
        
        @MvcBinding @FormParam("téléphone")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String telephone;
        
        @MvcBinding @FormParam("fax")
	@NotEmpty
	@Size(min = 1, max = 255)
	private String fax;
	// Getters, setters
	
	public String getContact() {
		return contact;
	}

	public void setContact(final String contact) {
		this.contact = contact;
	}

	public String getCode() {
		return code;
	}

	public void setCode(final String code) {
		this.code = code;
	}
        
        public void setSociete(final String societe){
            this.societe = societe;
        }
        
        public String getSociete() {
		return societe;
	}
               
        
        public String getFonction() {
		return fonction;
	}
        
        public void setFonction(final String fonction){
                this.fonction = fonction;
        }
        
        public String getAdresse() {
		return adresse;
        }
        public void setAdresse(final String adresse) {
		this.adresse = adresse;
	}
        public String getVille() {
		return ville;
	}
        
         public void setVille(final String ville) {
		this.ville = ville;
	}
            
         public void setRegion(final String region) {
		this.region = region;
	}
        
        public String getRegion() {
		return region;
	}
        
         public void setCodePostal(final String code_postal) {
		this.code_postal = code_postal;
	}
        
        public String getCodePostal() {
		return code_postal;
	}
        
         public void setPays(final String pays) {
		this.pays = pays;
	}
        
        public String getPays() {
		return pays;
	}
        
         public void setTelephone(final String telephone) {
		this.telephone = telephone;
	}
        
        public String getTelephone() {
		return telephone;
	}
        
         public void setFax(final String fax) {
		this.fax = fax;
	}
        
        public String getFax() {
		return fax;
	}
}
