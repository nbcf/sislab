/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author NILDO
 */
@Entity
@Table(name = "cad_laboratorio", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadLaboratorio.findAll", query = "SELECT c FROM CadLaboratorio c")
    , @NamedQuery(name = "CadLaboratorio.findByIdLab", query = "SELECT c FROM CadLaboratorio c WHERE c.idLab = :idLab")
    , @NamedQuery(name = "CadLaboratorio.findByLaboratorio", query = "SELECT c FROM CadLaboratorio c WHERE c.laboratorio = :laboratorio")
    , @NamedQuery(name = "CadLaboratorio.findBySigla", query = "SELECT c FROM CadLaboratorio c WHERE c.sigla = :sigla")
    , @NamedQuery(name = "CadLaboratorio.findBySede", query = "SELECT c FROM CadLaboratorio c WHERE c.sede = :sede")
    , @NamedQuery(name = "CadLaboratorio.findByResponsavel", query = "SELECT c FROM CadLaboratorio c WHERE c.responsavel = :responsavel")
    , @NamedQuery(name = "CadLaboratorio.findByDepto", query = "SELECT c FROM CadLaboratorio c WHERE c.depto = :depto")
    , @NamedQuery(name = "CadLaboratorio.findByLogo", query = "SELECT c FROM CadLaboratorio c WHERE c.logo = :logo")
    , @NamedQuery(name = "CadLaboratorio.findBySenhaLab", query = "SELECT c FROM CadLaboratorio c WHERE c.senhaLab = :senhaLab")
    , @NamedQuery(name = "CadLaboratorio.findByLoginLab", query = "SELECT c FROM CadLaboratorio c WHERE c.loginLab = :loginLab")
    , @NamedQuery(name = "CadLaboratorio.findByEmail", query = "SELECT c FROM CadLaboratorio c WHERE c.email = :email")
        
    , @NamedQuery(name = "CadLaboratorio.loginAcessoConf", query = "SELECT c FROM CadLaboratorio c WHERE c.idLab = :idLab AND c.loginLab = :loginLab AND c.senhaLab = :senhaLab")
    , @NamedQuery(name = "CadLaboratorio.findBySite", query = "SELECT c FROM CadLaboratorio c WHERE c.site = :site")

})
public class CadLaboratorio implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LAB")
    private Integer idLab;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "SEDE")
    private String sede;
    @Column(name = "RESPONSAVEL")
    private String responsavel;
    @Column(name = "DEPTO")
    private String depto;
    @Column(name = "LOGO")
    private String logo;
    @Column(name = "SENHA_LAB")
    private String senhaLab;
    @Column(name = "LOGIN_LAB")
    private String loginLab;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SITE")
    private String site;
    @Column(name = "MONITORAR_DIAS_INTERVALO")
    private String monitorarDiasIntevalo;
    public CadLaboratorio() {
    }

    public CadLaboratorio(Integer idLab) {
        this.idLab = idLab;
    }

    public Integer getIdLab() {
        return idLab;
    }

    public void setIdLab(Integer idLab) {
        Integer oldIdLab = this.idLab;
        this.idLab = idLab;
        changeSupport.firePropertyChange("idLab", oldIdLab, idLab);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        String oldSigla = this.sigla;
        this.sigla = sigla;
        changeSupport.firePropertyChange("sigla", oldSigla, sigla);
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        String oldSede = this.sede;
        this.sede = sede;
        changeSupport.firePropertyChange("sede", oldSede, sede);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        String oldResponsavel = this.responsavel;
        this.responsavel = responsavel;
        changeSupport.firePropertyChange("responsavel", oldResponsavel, responsavel);
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        String oldDepto = this.depto;
        this.depto = depto;
        changeSupport.firePropertyChange("depto", oldDepto, depto);
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        String oldLogo = this.logo;
        this.logo = logo;
        changeSupport.firePropertyChange("logo", oldLogo, logo);
    }

    public String getSenhaLab() {
        return senhaLab;
    }

    public void setSenhaLab(String senhaLab) {
        String oldSenhaLab = this.senhaLab;
        this.senhaLab = senhaLab;
        changeSupport.firePropertyChange("senhaLab", oldSenhaLab, senhaLab);
    }

    public String getLoginLab() {
        return loginLab;
    }

    public void setLoginLab(String loginLab) {
        String oldLoginLab = this.loginLab;
        this.loginLab = loginLab;
        changeSupport.firePropertyChange("loginLab", oldLoginLab, loginLab);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        String oldSite = this.site;
        this.site = site;
        changeSupport.firePropertyChange("site", oldSite, site);
    }

    public String getMonitorarDiasIntervalo() {
        return monitorarDiasIntevalo;
    }

    public void setMonitorarDiasIntervalo(String monitorarDiasIntevalo) {
        String oldMonitorarDiasIntervalo = this.monitorarDiasIntevalo;
        this.monitorarDiasIntevalo = monitorarDiasIntevalo;
        changeSupport.firePropertyChange("monitorarDiasIntevalo", oldMonitorarDiasIntervalo, monitorarDiasIntevalo);
    }
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLab != null ? idLab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadLaboratorio)) {
            return false;
        }
        CadLaboratorio other = (CadLaboratorio) object;
        if ((this.idLab == null && other.idLab != null) || (this.idLab != null && !this.idLab.equals(other.idLab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.CadLaboratorio[ idLab=" + idLab + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
