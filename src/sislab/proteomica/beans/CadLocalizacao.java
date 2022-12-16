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
@Table(name = "cad_localizacao", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadLocalizacao.findAll", query = "SELECT c FROM CadLocalizacao c")
    , @NamedQuery(name = "CadLocalizacao.findByIdLocalizacao", query = "SELECT c FROM CadLocalizacao c WHERE c.idLocalizacao = :idLocalizacao")
    , @NamedQuery(name = "CadLocalizacao.findByLocal", query = "SELECT c FROM CadLocalizacao c WHERE c.local = :local")
    , @NamedQuery(name = "CadLocalizacao.findBySala", query = "SELECT c FROM CadLocalizacao c WHERE c.sala = :sala")
    , @NamedQuery(name = "CadLocalizacao.findByTel", query = "SELECT c FROM CadLocalizacao c WHERE c.tel = :tel")
    , @NamedQuery(name = "CadLocalizacao.findByRamal", query = "SELECT c FROM CadLocalizacao c WHERE c.ramal = :ramal")
    , @NamedQuery(name = "CadLocalizacao.findByIdLab", query = "SELECT c FROM CadLocalizacao c WHERE c.idLab = :idLab")
    , @NamedQuery(name = "CadLocalizacao.findByLaboratorio", query = "SELECT c FROM CadLocalizacao c WHERE c.laboratorio = :laboratorio")
    , @NamedQuery(name = "CadLocalizacao.BuscaLocalizacao", query = "SELECT c FROM CadLocalizacao c WHERE c.idLocalizacao = :idLocalizacao AND c.idLab = :idLab")})
public class CadLocalizacao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LOCALIZACAO")
    private Integer idLocalizacao;
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "RAMAL")
    private String ramal;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "LABORATORIO")
    private String laboratorio;

    public CadLocalizacao() {
    }

    public CadLocalizacao(Integer idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Integer getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Integer idLocalizacao) {
        Integer oldIdLocalizacao = this.idLocalizacao;
        this.idLocalizacao = idLocalizacao;
        changeSupport.firePropertyChange("idLocalizacao", oldIdLocalizacao, idLocalizacao);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        String oldLocal = this.local;
        this.local = local;
        changeSupport.firePropertyChange("local", oldLocal, local);
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        String oldSala = this.sala;
        this.sala = sala;
        changeSupport.firePropertyChange("sala", oldSala, sala);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        String oldRamal = this.ramal;
        this.ramal = ramal;
        changeSupport.firePropertyChange("ramal", oldRamal, ramal);
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
        hash += (idLocalizacao != null ? idLocalizacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadLocalizacao)) {
            return false;
        }
        CadLocalizacao other = (CadLocalizacao) object;
        if ((this.idLocalizacao == null && other.idLocalizacao != null) || (this.idLocalizacao != null && !this.idLocalizacao.equals(other.idLocalizacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.beans.CadLocalizacao[ idLocalizacao=" + idLocalizacao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
