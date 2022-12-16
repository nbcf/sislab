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
@Table(name = "freezer_gel", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "FreezerGel.findAll", query = "SELECT f FROM FreezerGel f")
    , @NamedQuery(name = "FreezerGel.findByIdFreezer", query = "SELECT f FROM FreezerGel f WHERE f.idFreezer = :idFreezer")
    , @NamedQuery(name = "FreezerGel.findByMarca", query = "SELECT f FROM FreezerGel f WHERE f.marca = :marca")
    , @NamedQuery(name = "FreezerGel.findByModelo", query = "SELECT f FROM FreezerGel f WHERE f.modelo = :modelo")
    , @NamedQuery(name = "FreezerGel.findByCapacidade", query = "SELECT f FROM FreezerGel f WHERE f.capacidade = :capacidade")
    , @NamedQuery(name = "FreezerGel.findByTipoFreezer", query = "SELECT f FROM FreezerGel f WHERE f.tipoFreezer = :tipoFreezer")
    , @NamedQuery(name = "FreezerGel.findByVoltagem", query = "SELECT f FROM FreezerGel f WHERE f.voltagem = :voltagem")
    , @NamedQuery(name = "FreezerGel.findByCompartimentos", query = "SELECT f FROM FreezerGel f WHERE f.compartimentos = :compartimentos")
    , @NamedQuery(name = "FreezerGel.findByLocalizacao", query = "SELECT f FROM FreezerGel f WHERE f.localizacao = :localizacao")
    , @NamedQuery(name = "FreezerGel.findByLaboratorio", query = "SELECT f FROM FreezerGel f WHERE f.laboratorio = :laboratorio")
    , @NamedQuery(name = "FreezerGel.findByIdLocal", query = "SELECT f FROM FreezerGel f WHERE f.idLocal = :idLocal")
    , @NamedQuery(name = "FreezerGel.findByIdLab", query = "SELECT f FROM FreezerGel f WHERE f.idLab = :idLab")})
public class FreezerGel implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_FREEZER")
    private Integer idFreezer;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "CAPACIDADE")
    private String capacidade;
    @Column(name = "TIPO_FREEZER")
    private String tipoFreezer;
    @Column(name = "VOLTAGEM")
    private String voltagem;
    @Column(name = "COMPARTIMENTOS")
    private String compartimentos;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "ID_LOCAL")
    private String idLocal;
    @Column(name = "ID_LAB")
    private String idLab;

    public FreezerGel() {
    }

    public FreezerGel(Integer idFreezer) {
        this.idFreezer = idFreezer;
    }

    public Integer getIdFreezer() {
        return idFreezer;
    }

    public void setIdFreezer(Integer idFreezer) {
        Integer oldIdFreezer = this.idFreezer;
        this.idFreezer = idFreezer;
        changeSupport.firePropertyChange("idFreezer", oldIdFreezer, idFreezer);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        String oldCapacidade = this.capacidade;
        this.capacidade = capacidade;
        changeSupport.firePropertyChange("capacidade", oldCapacidade, capacidade);
    }

    public String getTipoFreezer() {
        return tipoFreezer;
    }

    public void setTipoFreezer(String tipoFreezer) {
        String oldTipoFreezer = this.tipoFreezer;
        this.tipoFreezer = tipoFreezer;
        changeSupport.firePropertyChange("tipoFreezer", oldTipoFreezer, tipoFreezer);
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        String oldVoltagem = this.voltagem;
        this.voltagem = voltagem;
        changeSupport.firePropertyChange("voltagem", oldVoltagem, voltagem);
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        String oldCompartimentos = this.compartimentos;
        this.compartimentos = compartimentos;
        changeSupport.firePropertyChange("compartimentos", oldCompartimentos, compartimentos);
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

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        String oldIdLocal = this.idLocal;
        this.idLocal = idLocal;
        changeSupport.firePropertyChange("idLocal", oldIdLocal, idLocal);
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
        hash += (idFreezer != null ? idFreezer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FreezerGel)) {
            return false;
        }
        FreezerGel other = (FreezerGel) object;
        if ((this.idFreezer == null && other.idFreezer != null) || (this.idFreezer != null && !this.idFreezer.equals(other.idFreezer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.inventario.FreezerGel[ idFreezer=" + idFreezer + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
