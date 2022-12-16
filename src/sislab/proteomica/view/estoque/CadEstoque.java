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
@Table(name = "cad_estoque", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadEstoque.findAll", query = "SELECT c FROM CadEstoque c")
    , @NamedQuery(name = "CadEstoque.findByIdCadest", query = "SELECT c FROM CadEstoque c WHERE c.idCadest = :idCadest")
    , @NamedQuery(name = "CadEstoque.findByEstoque1", query = "SELECT c FROM CadEstoque c WHERE c.estoque1 = :estoque1")
    , @NamedQuery(name = "CadEstoque.findByEstoque2", query = "SELECT c FROM CadEstoque c WHERE c.estoque2 = :estoque2")
    , @NamedQuery(name = "CadEstoque.findByEstoquef", query = "SELECT c FROM CadEstoque c WHERE c.estoquef = :estoquef")
    , @NamedQuery(name = "CadEstoque.findByLocalizacao", query = "SELECT c FROM CadEstoque c WHERE c.localizacao = :localizacao")
    , @NamedQuery(name = "CadEstoque.findBySala", query = "SELECT c FROM CadEstoque c WHERE c.sala = :sala")
    , @NamedQuery(name = "CadEstoque.findByLaboratorio", query = "SELECT c FROM CadEstoque c WHERE c.laboratorio = :laboratorio")
    , @NamedQuery(name = "CadEstoque.findByIdLab", query = "SELECT c FROM CadEstoque c WHERE c.idLab = :idLab")
    , @NamedQuery(name = "CadEstoque.findByIdLocal", query = "SELECT c FROM CadEstoque c WHERE c.idLocal = :idLocal")
    , @NamedQuery(name = "CadEstoque.findByIdEst1", query = "SELECT c FROM CadEstoque c WHERE c.idEst1 = :idEst1")
    , @NamedQuery(name = "CadEstoque.findByIdEst2", query = "SELECT c FROM CadEstoque c WHERE c.idEst2 = :idEst2")
    , @NamedQuery(name = "CadEstoque.findByIdEstf", query = "SELECT c FROM CadEstoque c WHERE c.idEstf = :idEstf")

        
    , @NamedQuery(name = "CadEstoque.BuscaLocalizacao", query = "SELECT c FROM CadEstoque c WHERE c.idLab = :idLab AND c.idLocal = :idLocal")
        
        
})
public class CadEstoque implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CADEST")
    private Integer idCadest;
    @Column(name = "ESTOQUE1")
    private String estoque1;
    @Column(name = "ESTOQUE2")
    private String estoque2;
    @Column(name = "ESTOQUEF")
    private String estoquef;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCAL")
    private String idLocal;
    @Column(name = "ID_EST1")
    private String idEst1;
    @Column(name = "ID_EST2")
    private String idEst2;
    @Column(name = "ID_ESTF")
    private String idEstf;

    public CadEstoque() {
    }

    public CadEstoque(Integer idCadest) {
        this.idCadest = idCadest;
    }

    public Integer getIdCadest() {
        return idCadest;
    }

    public void setIdCadest(Integer idCadest) {
        Integer oldIdCadest = this.idCadest;
        this.idCadest = idCadest;
        changeSupport.firePropertyChange("idCadest", oldIdCadest, idCadest);
    }

    public String getEstoque1() {
        return estoque1;
    }

    public void setEstoque1(String estoque1) {
        String oldEstoque1 = this.estoque1;
        this.estoque1 = estoque1;
        changeSupport.firePropertyChange("estoque1", oldEstoque1, estoque1);
    }

    public String getEstoque2() {
        return estoque2;
    }

    public void setEstoque2(String estoque2) {
        String oldEstoque2 = this.estoque2;
        this.estoque2 = estoque2;
        changeSupport.firePropertyChange("estoque2", oldEstoque2, estoque2);
    }

    public String getEstoquef() {
        return estoquef;
    }

    public void setEstoquef(String estoquef) {
        String oldEstoquef = this.estoquef;
        this.estoquef = estoquef;
        changeSupport.firePropertyChange("estoquef", oldEstoquef, estoquef);
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

    public String getIdEst1() {
        return idEst1;
    }

    public void setIdEst1(String idEst1) {
        String oldIdEst1 = this.idEst1;
        this.idEst1 = idEst1;
        changeSupport.firePropertyChange("idEst1", oldIdEst1, idEst1);
    }

    public String getIdEst2() {
        return idEst2;
    }

    public void setIdEst2(String idEst2) {
        String oldIdEst2 = this.idEst2;
        this.idEst2 = idEst2;
        changeSupport.firePropertyChange("idEst2", oldIdEst2, idEst2);
    }

    public String getIdEstf() {
        return idEstf;
    }

    public void setIdEstf(String idEstf) {
        String oldIdEstf = this.idEstf;
        this.idEstf = idEstf;
        changeSupport.firePropertyChange("idEstf", oldIdEstf, idEstf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadest != null ? idCadest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadEstoque)) {
            return false;
        }
        CadEstoque other = (CadEstoque) object;
        if ((this.idCadest == null && other.idCadest != null) || (this.idCadest != null && !this.idCadest.equals(other.idCadest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.beans.CadEstoque[ idCadest=" + idCadest + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
