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
@Table(name = "fabricante", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fabricante.findAll", query = "SELECT f FROM Fabricante f")
    , @NamedQuery(name = "Fabricante.findByIdFabricante", query = "SELECT f FROM Fabricante f WHERE f.idFabricante = :idFabricante")
    , @NamedQuery(name = "Fabricante.findByFabricante", query = "SELECT f FROM Fabricante f WHERE f.fabricante = :fabricante")
    , @NamedQuery(name = "Fabricante.findBySite", query = "SELECT f FROM Fabricante f WHERE f.site = :site")
    , @NamedQuery(name = "Fabricante.findByTel", query = "SELECT f FROM Fabricante f WHERE f.tel = :tel")
    , @NamedQuery(name = "Fabricante.findByIdLab", query = "SELECT f FROM Fabricante f WHERE f.idLab = :idLab")
    , @NamedQuery(name = "Fabricante.findByLaboratorio", query = "SELECT f FROM Fabricante f WHERE f.laboratorio = :laboratorio")})
public class Fabricante implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_FABRICANTE")
    private Integer idFabricante;
    @Column(name = "FABRICANTE")
    private String fabricante;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @Column(name = "SITE")
    private String site;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "LABORATORIO")
    private String laboratorio;

    public Fabricante() {
    }

    public Fabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        Integer oldIdFabricante = this.idFabricante;
        this.idFabricante = idFabricante;
        changeSupport.firePropertyChange("idFabricante", oldIdFabricante, idFabricante);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        String oldFabricante = this.fabricante;
        this.fabricante = fabricante;
        changeSupport.firePropertyChange("fabricante", oldFabricante, fabricante);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        String oldSite = this.site;
        this.site = site;
        changeSupport.firePropertyChange("site", oldSite, site);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
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
        hash += (idFabricante != null ? idFabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.idFabricante == null && other.idFabricante != null) || (this.idFabricante != null && !this.idFabricante.equals(other.idFabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.Fabricante[ idFabricante=" + idFabricante + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
