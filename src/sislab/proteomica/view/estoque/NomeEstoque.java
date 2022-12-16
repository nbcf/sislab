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
@Table(name = "nome_estoque", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "NomeEstoque.findAll", query = "SELECT n FROM NomeEstoque n")
    , @NamedQuery(name = "NomeEstoque.findByIdNomeEstoque", query = "SELECT n FROM NomeEstoque n WHERE n.idNomeEstoque = :idNomeEstoque")
    , @NamedQuery(name = "NomeEstoque.findByNome", query = "SELECT n FROM NomeEstoque n WHERE n.nome = :nome")
    , @NamedQuery(name = "NomeEstoque.findByIdLab", query = "SELECT n FROM NomeEstoque n WHERE n.idLab = :idLab")
    , @NamedQuery(name = "NomeEstoque.findByIdLocalizacao", query = "SELECT n FROM NomeEstoque n WHERE n.idLocalizacao = :idLocalizacao")
    , @NamedQuery(name = "NomeEstoque.findByLocalizacao", query = "SELECT n FROM NomeEstoque n WHERE n.localizacao = :localizacao")
    , @NamedQuery(name = "NomeEstoque.findBySala", query = "SELECT n FROM NomeEstoque n WHERE n.sala = :sala")
    , @NamedQuery(name = "NomeEstoque.findByLaboratorio", query = "SELECT n FROM NomeEstoque n WHERE n.laboratorio = :laboratorio")


   , @NamedQuery(name = "NomeEstoque.BuscaLocalizacao", query = "SELECT n FROM NomeEstoque n WHERE n.idLab = :idLab AND n.idLocalizacao = :idLocalizacao")





})
public class NomeEstoque implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_NOME_ESTOQUE")
    private Integer idNomeEstoque;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCALIZACAO")
    private String idLocalizacao;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "LABORATORIO")
    private String laboratorio;

    public NomeEstoque() {
    }

    public NomeEstoque(Integer idNomeEstoque) {
        this.idNomeEstoque = idNomeEstoque;
    }

    public Integer getIdNomeEstoque() {
        return idNomeEstoque;
    }

    public void setIdNomeEstoque(Integer idNomeEstoque) {
        Integer oldIdNomeEstoque = this.idNomeEstoque;
        this.idNomeEstoque = idNomeEstoque;
        changeSupport.firePropertyChange("idNomeEstoque", oldIdNomeEstoque, idNomeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNomeEstoque != null ? idNomeEstoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NomeEstoque)) {
            return false;
        }
        NomeEstoque other = (NomeEstoque) object;
        if ((this.idNomeEstoque == null && other.idNomeEstoque != null) || (this.idNomeEstoque != null && !this.idNomeEstoque.equals(other.idNomeEstoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.NomeEstoque[ idNomeEstoque=" + idNomeEstoque + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
