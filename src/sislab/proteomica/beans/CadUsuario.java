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
 * @author nil_b
 */
@Entity
@Table(name = "cad_usuario", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadUsuario.findAll", query = "SELECT c FROM CadUsuario c")
    , @NamedQuery(name = "CadUsuario.findByIdUsuario", query = "SELECT c FROM CadUsuario c WHERE c.idUsuario = :idUsuario")
    , @NamedQuery(name = "CadUsuario.findByNome", query = "SELECT c FROM CadUsuario c WHERE c.nome = :nome")
    , @NamedQuery(name = "CadUsuario.findByLogin", query = "SELECT c FROM CadUsuario c WHERE c.login = :login")
    , @NamedQuery(name = "CadUsuario.findBySenha", query = "SELECT c FROM CadUsuario c WHERE c.senha = :senha")
    , @NamedQuery(name = "CadUsuario.findByVinculacao", query = "SELECT c FROM CadUsuario c WHERE c.vinculacao = :vinculacao")
    , @NamedQuery(name = "CadUsuario.findByTipoPermissao", query = "SELECT c FROM CadUsuario c WHERE c.tipoPermissao = :tipoPermissao")
    , @NamedQuery(name = "CadUsuario.findByIdLab", query = "SELECT c FROM CadUsuario c WHERE c.idLab = :idLab")
    , @NamedQuery(name = "CadUsuario.findByLaboratorio", query = "SELECT c FROM CadUsuario c WHERE c.laboratorio = :laboratorio")
    ,@NamedQuery(name = "CadUsuario.findByVerificaLogin", query = "SELECT c FROM CadUsuario c WHERE c.idLab = :idLab AND c.login = :login AND c.senha = :senha")
})
public class CadUsuario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "VINCULACAO")
    private String vinculacao;
    @Column(name = "TIPO_PERMISSAO")
    private String tipoPermissao;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "LABORATORIO")
    private String laboratorio;

    public CadUsuario() {
    }

    public CadUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        Integer oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getVinculacao() {
        return vinculacao;
    }

    public void setVinculacao(String vinculacao) {
        String oldVinculacao = this.vinculacao;
        this.vinculacao = vinculacao;
        changeSupport.firePropertyChange("vinculacao", oldVinculacao, vinculacao);
    }

    public String getTipoPermissao() {
        return tipoPermissao;
    }

    public void setTipoPermissao(String tipoPermissao) {
        String oldTipoPermissao = this.tipoPermissao;
        this.tipoPermissao = tipoPermissao;
        changeSupport.firePropertyChange("tipoPermissao", oldTipoPermissao, tipoPermissao);
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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadUsuario)) {
            return false;
        }
        CadUsuario other = (CadUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.beans.CadUsuario[ idUsuario=" + idUsuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
