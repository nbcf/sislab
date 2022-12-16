/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.estoque;

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
@Table(name = "tipo_estoque", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "TipoEstoque.findAll", query = "SELECT t FROM TipoEstoque t")
    , @NamedQuery(name = "TipoEstoque.findByIdTipoEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.idTipoEstoque = :idTipoEstoque")
    , @NamedQuery(name = "TipoEstoque.findByTipoEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.tipoEstoque = :tipoEstoque")
    , @NamedQuery(name = "TipoEstoque.findByNomeEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.nomeEstoque = :nomeEstoque")
    , @NamedQuery(name = "TipoEstoque.findByIdLab", query = "SELECT t FROM TipoEstoque t WHERE t.idLab = :idLab")
    , @NamedQuery(name = "TipoEstoque.findByIdLocal", query = "SELECT t FROM TipoEstoque t WHERE t.idLocal = :idLocal")
    , @NamedQuery(name = "TipoEstoque.findByLocalizacao", query = "SELECT t FROM TipoEstoque t WHERE t.localizacao = :localizacao")
    , @NamedQuery(name = "TipoEstoque.findBySala", query = "SELECT t FROM TipoEstoque t WHERE t.sala = :sala")
    , @NamedQuery(name = "TipoEstoque.findByLaboratorio", query = "SELECT t FROM TipoEstoque t WHERE t.laboratorio = :laboratorio")
    , @NamedQuery(name = "TipoEstoque.findByIdNomeEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.idNomeEstoque = :idNomeEstoque")

        
    , @NamedQuery(name = "TipoEstoque.BuscaLocalizacao", query = "SELECT t FROM TipoEstoque t WHERE t.idLab = :idLab AND t.idLocal = :idLocal")
     , @NamedQuery(name = "TipoEstoque.BuscaLocalizacaoImport", query = "SELECT t FROM TipoEstoque t WHERE t.idLab = :idLab AND t.idLocal = :idLocal")    
//    , @NamedQuery(name = "TipoEstoque.BuscaTodosTiposEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.idLab")
//    , @NamedQuery(name = "TipoEstoque.BuscaLocalTiposEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.idLab = :idLab AND t.idLocal = :idLocal")    
//    , @NamedQuery(name = "TipoEstoque.BuscaEspecificoLocalTiposEstoque", query = "SELECT t FROM TipoEstoque t WHERE t.idLab = :idLab AND t.idLocal = :idLocal AND t.tipoEstoque = :tipoEstoque")    

})
public class TipoEstoque implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIPO_ESTOQUE")
    private Integer idTipoEstoque;
    @Column(name = "TIPO_ESTOQUE")
    private String tipoEstoque;
    @Column(name = "NOME_ESTOQUE")
    private String nomeEstoque;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCAL")
    private String idLocal;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "ID_NOME_ESTOQUE")
    private String idNomeEstoque;

    public TipoEstoque() {
    }

    public TipoEstoque(Integer idTipoEstoque) {
        this.idTipoEstoque = idTipoEstoque;
    }

    public Integer getIdTipoEstoque() {
        return idTipoEstoque;
    }

    public void setIdTipoEstoque(Integer idTipoEstoque) {
        Integer oldIdTipoEstoque = this.idTipoEstoque;
        this.idTipoEstoque = idTipoEstoque;
        changeSupport.firePropertyChange("idTipoEstoque", oldIdTipoEstoque, idTipoEstoque);
    }

    public String getTipoEstoque() {
        return tipoEstoque;
    }

    public void setTipoEstoque(String tipoEstoque) {
        String oldTipoEstoque = this.tipoEstoque;
        this.tipoEstoque = tipoEstoque;
        changeSupport.firePropertyChange("tipoEstoque", oldTipoEstoque, tipoEstoque);
    }

    public String getNomeEstoque() {
        return nomeEstoque;
    }

    public void setNomeEstoque(String nomeEstoque) {
        String oldNomeEstoque = this.nomeEstoque;
        this.nomeEstoque = nomeEstoque;
        changeSupport.firePropertyChange("nomeEstoque", oldNomeEstoque, nomeEstoque);
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        String oldIdLab = this.idLab;
        this.idLab = idLab;
        changeSupport.firePropertyChange("idLab", oldIdLab, idLab);
    }

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        String oldIdLocal = this.idLocal;
        this.idLocal = idLocal;
        changeSupport.firePropertyChange("idLocal", oldIdLocal, idLocal);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        String oldLocalizacao = this.localizacao;
        this.localizacao = localizacao;
        changeSupport.firePropertyChange("localizacao", oldLocalizacao, localizacao);
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        String oldSala = this.sala;
        this.sala = sala;
        changeSupport.firePropertyChange("sala", oldSala, sala);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
    }

    public String getIdNomeEstoque() {
        return idNomeEstoque;
    }

    public void setIdNomeEstoque(String idNomeEstoque) {
        String oldIdNomeEstoque = this.idNomeEstoque;
        this.idNomeEstoque = idNomeEstoque;
        changeSupport.firePropertyChange("idNomeEstoque", oldIdNomeEstoque, idNomeEstoque);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoEstoque != null ? idTipoEstoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEstoque)) {
            return false;
        }
        TipoEstoque other = (TipoEstoque) object;
        if ((this.idTipoEstoque == null && other.idTipoEstoque != null) || (this.idTipoEstoque != null && !this.idTipoEstoque.equals(other.idTipoEstoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.beans.TipoEstoque[ idTipoEstoque=" + idTipoEstoque + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
