/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.inventario;

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
 * @author nil_b
 */
@Entity
@Table(name = "moveis_lab", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "MoveisLab.findAll", query = "SELECT m FROM MoveisLab m")
    , @NamedQuery(name = "MoveisLab.findByIdMoveis", query = "SELECT m FROM MoveisLab m WHERE m.idMoveis = :idMoveis")
    , @NamedQuery(name = "MoveisLab.findByMovel", query = "SELECT m FROM MoveisLab m WHERE m.movel = :movel")
    , @NamedQuery(name = "MoveisLab.findByTipoMovel", query = "SELECT m FROM MoveisLab m WHERE m.tipoMovel = :tipoMovel")
    , @NamedQuery(name = "MoveisLab.findByDescricao", query = "SELECT m FROM MoveisLab m WHERE m.descricao = :descricao")
    , @NamedQuery(name = "MoveisLab.findByObsMovel", query = "SELECT m FROM MoveisLab m WHERE m.obsMovel = :obsMovel")
    , @NamedQuery(name = "MoveisLab.findByCodMovel", query = "SELECT m FROM MoveisLab m WHERE m.codMovel = :codMovel")
    , @NamedQuery(name = "MoveisLab.findByLocalizacao", query = "SELECT m FROM MoveisLab m WHERE m.localizacao = :localizacao")
    , @NamedQuery(name = "MoveisLab.findByLaboratorio", query = "SELECT m FROM MoveisLab m WHERE m.laboratorio = :laboratorio")
    , @NamedQuery(name = "MoveisLab.findByIdLab", query = "SELECT m FROM MoveisLab m WHERE m.idLab = :idLab")
    , @NamedQuery(name = "MoveisLab.findByIdLocalizacao", query = "SELECT m FROM MoveisLab m WHERE m.idLocalizacao = :idLocalizacao")})
public class MoveisLab implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MOVEIS")
    private Integer idMoveis;
    @Column(name = "MOVEL")
    private String movel;
    @Column(name = "TIPO_MOVEL")
    private String tipoMovel;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "OBS_MOVEL")
    private String obsMovel;
    @Column(name = "COD_MOVEL")
    private String codMovel;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCALIZACAO")
    private String idLocalizacao;

    public MoveisLab() {
    }

    public MoveisLab(Integer idMoveis) {
        this.idMoveis = idMoveis;
    }

    public Integer getIdMoveis() {
        return idMoveis;
    }

    public void setIdMoveis(Integer idMoveis) {
        Integer oldIdMoveis = this.idMoveis;
        this.idMoveis = idMoveis;
        changeSupport.firePropertyChange("idMoveis", oldIdMoveis, idMoveis);
    }

    public String getMovel() {
        return movel;
    }

    public void setMovel(String movel) {
        String oldMovel = this.movel;
        this.movel = movel;
        changeSupport.firePropertyChange("movel", oldMovel, movel);
    }

    public String getTipoMovel() {
        return tipoMovel;
    }

    public void setTipoMovel(String tipoMovel) {
        String oldTipoMovel = this.tipoMovel;
        this.tipoMovel = tipoMovel;
        changeSupport.firePropertyChange("tipoMovel", oldTipoMovel, tipoMovel);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getObsMovel() {
        return obsMovel;
    }

    public void setObsMovel(String obsMovel) {
        String oldObsMovel = this.obsMovel;
        this.obsMovel = obsMovel;
        changeSupport.firePropertyChange("obsMovel", oldObsMovel, obsMovel);
    }

    public String getCodMovel() {
        return codMovel;
    }

    public void setCodMovel(String codMovel) {
        String oldCodMovel = this.codMovel;
        this.codMovel = codMovel;
        changeSupport.firePropertyChange("codMovel", oldCodMovel, codMovel);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        String oldLocalizacao = this.localizacao;
        this.localizacao = localizacao;
        changeSupport.firePropertyChange("localizacao", oldLocalizacao, localizacao);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        String oldIdLab = this.idLab;
        this.idLab = idLab;
        changeSupport.firePropertyChange("idLab", oldIdLab, idLab);
    }

    public String getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(String idLocalizacao) {
        String oldIdLocalizacao = this.idLocalizacao;
        this.idLocalizacao = idLocalizacao;
        changeSupport.firePropertyChange("idLocalizacao", oldIdLocalizacao, idLocalizacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMoveis != null ? idMoveis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoveisLab)) {
            return false;
        }
        MoveisLab other = (MoveisLab) object;
        if ((this.idMoveis == null && other.idMoveis != null) || (this.idMoveis != null && !this.idMoveis.equals(other.idMoveis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.inventario.MoveisLab[ idMoveis=" + idMoveis + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
