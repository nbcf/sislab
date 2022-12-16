/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.pds;

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
@Table(name = "pds", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pds.findAll", query = "SELECT p FROM Pds p")
    , @NamedQuery(name = "Pds.findByIdPds", query = "SELECT p FROM Pds p WHERE p.idPds = :idPds")
    , @NamedQuery(name = "Pds.findByNomePds", query = "SELECT p FROM Pds p WHERE p.nomePds = :nomePds")
    , @NamedQuery(name = "Pds.findByDeptoPds", query = "SELECT p FROM Pds p WHERE p.deptoPds = :deptoPds")
    , @NamedQuery(name = "Pds.findByResponsavelPds", query = "SELECT p FROM Pds p WHERE p.responsavelPds = :responsavelPds")
    , @NamedQuery(name = "Pds.findByLocalizacaoPds", query = "SELECT p FROM Pds p WHERE p.localizacaoPds = :localizacaoPds")
    , @NamedQuery(name = "Pds.findBySalaPds", query = "SELECT p FROM Pds p WHERE p.salaPds = :salaPds")
    , @NamedQuery(name = "Pds.findByTel1Pds", query = "SELECT p FROM Pds p WHERE p.tel1Pds = :tel1Pds")
    , @NamedQuery(name = "Pds.findByTel2Pds", query = "SELECT p FROM Pds p WHERE p.tel2Pds = :tel2Pds")
    , @NamedQuery(name = "Pds.findByIdLab", query = "SELECT p FROM Pds p WHERE p.idLab = :idLab")})
public class Pds implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PDS")
    private Integer idPds;
    @Column(name = "NOME_PDS")
    private String nomePds;
    @Column(name = "DEPTO_PDS")
    private String deptoPds;
    @Column(name = "RESPONSAVEL_PDS")
    private String responsavelPds;
    @Column(name = "LOCALIZACAO_PDS")
    private String localizacaoPds;
    @Column(name = "SALA_PDS")
    private String salaPds;
    @Column(name = "TEL1_PDS")
    private String tel1Pds;
    @Column(name = "TEL2_PDS")
    private String tel2Pds;
    @Column(name = "ID_LAB")
    private String idLab;

    public Pds() {
    }

    public Pds(Integer idPds) {
        this.idPds = idPds;
    }

    public Integer getIdPds() {
        return idPds;
    }

    public void setIdPds(Integer idPds) {
        Integer oldIdPds = this.idPds;
        this.idPds = idPds;
        changeSupport.firePropertyChange("idPds", oldIdPds, idPds);
    }

    public String getNomePds() {
        return nomePds;
    }

    public void setNomePds(String nomePds) {
        String oldNomePds = this.nomePds;
        this.nomePds = nomePds;
        changeSupport.firePropertyChange("nomePds", oldNomePds, nomePds);
    }

    public String getDeptoPds() {
        return deptoPds;
    }

    public void setDeptoPds(String deptoPds) {
        String oldDeptoPds = this.deptoPds;
        this.deptoPds = deptoPds;
        changeSupport.firePropertyChange("deptoPds", oldDeptoPds, deptoPds);
    }

    public String getResponsavelPds() {
        return responsavelPds;
    }

    public void setResponsavelPds(String responsavelPds) {
        String oldResponsavelPds = this.responsavelPds;
        this.responsavelPds = responsavelPds;
        changeSupport.firePropertyChange("responsavelPds", oldResponsavelPds, responsavelPds);
    }

    public String getLocalizacaoPds() {
        return localizacaoPds;
    }

    public void setLocalizacaoPds(String localizacaoPds) {
        String oldLocalizacaoPds = this.localizacaoPds;
        this.localizacaoPds = localizacaoPds;
        changeSupport.firePropertyChange("localizacaoPds", oldLocalizacaoPds, localizacaoPds);
    }

    public String getSalaPds() {
        return salaPds;
    }

    public void setSalaPds(String salaPds) {
        String oldSalaPds = this.salaPds;
        this.salaPds = salaPds;
        changeSupport.firePropertyChange("salaPds", oldSalaPds, salaPds);
    }

    public String getTel1Pds() {
        return tel1Pds;
    }

    public void setTel1Pds(String tel1Pds) {
        String oldTel1Pds = this.tel1Pds;
        this.tel1Pds = tel1Pds;
        changeSupport.firePropertyChange("tel1Pds", oldTel1Pds, tel1Pds);
    }

    public String getTel2Pds() {
        return tel2Pds;
    }

    public void setTel2Pds(String tel2Pds) {
        String oldTel2Pds = this.tel2Pds;
        this.tel2Pds = tel2Pds;
        changeSupport.firePropertyChange("tel2Pds", oldTel2Pds, tel2Pds);
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        String oldIdLab = this.idLab;
        this.idLab = idLab;
        changeSupport.firePropertyChange("idLab", oldIdLab, idLab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPds != null ? idPds.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pds)) {
            return false;
        }
        Pds other = (Pds) object;
        if ((this.idPds == null && other.idPds != null) || (this.idPds != null && !this.idPds.equals(other.idPds))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.movimento.Pds[ idPds=" + idPds + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
