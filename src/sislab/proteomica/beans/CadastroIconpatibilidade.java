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
@Table(name = "cadastro_iconpatibilidade", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadastroIconpatibilidade.findAll", query = "SELECT c FROM CadastroIconpatibilidade c")
    , @NamedQuery(name = "CadastroIconpatibilidade.findByIdIcom", query = "SELECT c FROM CadastroIconpatibilidade c WHERE c.idIcom = :idIcom")
    , @NamedQuery(name = "CadastroIconpatibilidade.findByIdLab", query = "SELECT c FROM CadastroIconpatibilidade c WHERE c.idLab = :idLab")})
public class CadastroIconpatibilidade implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ICOM")
    private Integer idIcom;
    @Lob
    @Column(name = "ICOM")
    private String icom;
    @Column(name = "ID_LAB")
    private String idLab;

    public CadastroIconpatibilidade() {
    }

    public CadastroIconpatibilidade(Integer idIcom) {
        this.idIcom = idIcom;
    }

    public Integer getIdIcom() {
        return idIcom;
    }

    public void setIdIcom(Integer idIcom) {
        Integer oldIdIcom = this.idIcom;
        this.idIcom = idIcom;
        changeSupport.firePropertyChange("idIcom", oldIdIcom, idIcom);
    }

    public String getIcom() {
        return icom;
    }

    public void setIcom(String icom) {
        String oldIcom = this.icom;
        this.icom = icom;
        changeSupport.firePropertyChange("icom", oldIcom, icom);
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
        hash += (idIcom != null ? idIcom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroIconpatibilidade)) {
            return false;
        }
        CadastroIconpatibilidade other = (CadastroIconpatibilidade) object;
        if ((this.idIcom == null && other.idIcom != null) || (this.idIcom != null && !this.idIcom.equals(other.idIcom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.CadastroIconpatibilidade[ idIcom=" + idIcom + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
