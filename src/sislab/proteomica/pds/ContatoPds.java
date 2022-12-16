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
@Table(name = "contato_pds", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "ContatoPds.findAll", query = "SELECT c FROM ContatoPds c")
    , @NamedQuery(name = "ContatoPds.findByIdContatoPds", query = "SELECT c FROM ContatoPds c WHERE c.idContatoPds = :idContatoPds")
    , @NamedQuery(name = "ContatoPds.findByIdPds", query = "SELECT c FROM ContatoPds c WHERE c.idPds = :idPds")
    , @NamedQuery(name = "ContatoPds.findByNomePds", query = "SELECT c FROM ContatoPds c WHERE c.nomePds = :nomePds")
    , @NamedQuery(name = "ContatoPds.findByDeptoPds", query = "SELECT c FROM ContatoPds c WHERE c.deptoPds = :deptoPds")
    , @NamedQuery(name = "ContatoPds.findByLocalizacaoPds", query = "SELECT c FROM ContatoPds c WHERE c.localizacaoPds = :localizacaoPds")
    , @NamedQuery(name = "ContatoPds.findBySalaPds", query = "SELECT c FROM ContatoPds c WHERE c.salaPds = :salaPds")
    , @NamedQuery(name = "ContatoPds.findByTelPds", query = "SELECT c FROM ContatoPds c WHERE c.telPds = :telPds")
    , @NamedQuery(name = "ContatoPds.findByResponsavelLab", query = "SELECT c FROM ContatoPds c WHERE c.responsavelLab = :responsavelLab")
    , @NamedQuery(name = "ContatoPds.findByNomeCont", query = "SELECT c FROM ContatoPds c WHERE c.nomeCont = :nomeCont")
    , @NamedQuery(name = "ContatoPds.findByVinculacao", query = "SELECT c FROM ContatoPds c WHERE c.vinculacao = :vinculacao")
    , @NamedQuery(name = "ContatoPds.findByContatoCont", query = "SELECT c FROM ContatoPds c WHERE c.contatoCont = :contatoCont")
    , @NamedQuery(name = "ContatoPds.findByIdLab", query = "SELECT c FROM ContatoPds c WHERE c.idLab = :idLab")})
public class ContatoPds implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CONTATO_PDS")
    private Integer idContatoPds;
    @Column(name = "ID_PDS")
    private String idPds;
    @Column(name = "NOME_PDS")
    private String nomePds;
    @Column(name = "DEPTO_PDS")
    private String deptoPds;
    @Column(name = "LOCALIZACAO_PDS")
    private String localizacaoPds;
    @Column(name = "SALA_PDS")
    private String salaPds;
    @Column(name = "TEL_PDS")
    private String telPds;
    @Column(name = "RESPONSAVEL_LAB")
    private String responsavelLab;
    @Column(name = "NOME_CONT")
    private String nomeCont;
    @Column(name = "VINCULACAO")
    private String vinculacao;
    @Column(name = "CONTATO_CONT")
    private String contatoCont;
    @Column(name = "ID_LAB")
    private String idLab;

    public ContatoPds() {
    }

    public ContatoPds(Integer idContatoPds) {
        this.idContatoPds = idContatoPds;
    }

    public Integer getIdContatoPds() {
        return idContatoPds;
    }

    public void setIdContatoPds(Integer idContatoPds) {
        Integer oldIdContatoPds = this.idContatoPds;
        this.idContatoPds = idContatoPds;
        changeSupport.firePropertyChange("idContatoPds", oldIdContatoPds, idContatoPds);
    }

    public String getIdPds() {
        return idPds;
    }

    public void setIdPds(String idPds) {
        String oldIdPds = this.idPds;
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

    public String getTelPds() {
        return telPds;
    }

    public void setTelPds(String telPds) {
        String oldTelPds = this.telPds;
        this.telPds = telPds;
        changeSupport.firePropertyChange("telPds", oldTelPds, telPds);
    }

    public String getResponsavelLab() {
        return responsavelLab;
    }

    public void setResponsavelLab(String responsavelLab) {
        String oldResponsavelLab = this.responsavelLab;
        this.responsavelLab = responsavelLab;
        changeSupport.firePropertyChange("responsavelLab", oldResponsavelLab, responsavelLab);
    }

    public String getNomeCont() {
        return nomeCont;
    }

    public void setNomeCont(String nomeCont) {
        String oldNomeCont = this.nomeCont;
        this.nomeCont = nomeCont;
        changeSupport.firePropertyChange("nomeCont", oldNomeCont, nomeCont);
    }

    public String getVinculacao() {
        return vinculacao;
    }

    public void setVinculacao(String vinculacao) {
        String oldVinculacao = this.vinculacao;
        this.vinculacao = vinculacao;
        changeSupport.firePropertyChange("vinculacao", oldVinculacao, vinculacao);
    }

    public String getContatoCont() {
        return contatoCont;
    }

    public void setContatoCont(String contatoCont) {
        String oldContatoCont = this.contatoCont;
        this.contatoCont = contatoCont;
        changeSupport.firePropertyChange("contatoCont", oldContatoCont, contatoCont);
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
        hash += (idContatoPds != null ? idContatoPds.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContatoPds)) {
            return false;
        }
        ContatoPds other = (ContatoPds) object;
        if ((this.idContatoPds == null && other.idContatoPds != null) || (this.idContatoPds != null && !this.idContatoPds.equals(other.idContatoPds))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.movimento.ContatoPds[ idContatoPds=" + idContatoPds + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
