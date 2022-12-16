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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author NILDO
 */
@Entity
@Table(name = "fornecedor", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f")
    , @NamedQuery(name = "Fornecedor.findByIdFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idFornecedor = :idFornecedor")
    , @NamedQuery(name = "Fornecedor.findByFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.fornecedor = :fornecedor")
    , @NamedQuery(name = "Fornecedor.findByTel1", query = "SELECT f FROM Fornecedor f WHERE f.tel1 = :tel1")
    , @NamedQuery(name = "Fornecedor.findByTel2", query = "SELECT f FROM Fornecedor f WHERE f.tel2 = :tel2")
    , @NamedQuery(name = "Fornecedor.findByEmail", query = "SELECT f FROM Fornecedor f WHERE f.email = :email")
    , @NamedQuery(name = "Fornecedor.findBySite", query = "SELECT f FROM Fornecedor f WHERE f.site = :site")
    , @NamedQuery(name = "Fornecedor.findByIdLab", query = "SELECT f FROM Fornecedor f WHERE f.idLab = :idLab")
    , @NamedQuery(name = "Fornecedor.findByLaboratorio", query = "SELECT f FROM Fornecedor f WHERE f.laboratorio = :laboratorio")})
public class Fornecedor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_FORNECEDOR")
    private Integer idFornecedor;
    @Column(name = "FORNECEDOR")
    private String fornecedor;
    @Column(name = "TEL1")
    private String tel1;
    @Column(name = "TEL2")
    private String tel2;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SITE")
    private String site;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "LABORATORIO")
    private String laboratorio;

    public Fornecedor() {
    }

    public Fornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        Integer oldIdFornecedor = this.idFornecedor;
        this.idFornecedor = idFornecedor;
        changeSupport.firePropertyChange("idFornecedor", oldIdFornecedor, idFornecedor);
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        String oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        String oldTel1 = this.tel1;
        this.tel1 = tel1;
        changeSupport.firePropertyChange("tel1", oldTel1, tel1);
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        String oldTel2 = this.tel2;
        this.tel2 = tel2;
        changeSupport.firePropertyChange("tel2", oldTel2, tel2);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
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

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        String oldIdLab = this.idLab;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFornecedor != null ? idFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idFornecedor == null && other.idFornecedor != null) || (this.idFornecedor != null && !this.idFornecedor.equals(other.idFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.beans.Fornecedor[ idFornecedor=" + idFornecedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
