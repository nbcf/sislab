/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author canep
 */
@Entity
@Table(name = "composicao_cab", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "ComposicaoCab.findAll", query = "SELECT c FROM ComposicaoCab c")
    , @NamedQuery(name = "ComposicaoCab.findByIdCompCab", query = "SELECT c FROM ComposicaoCab c WHERE c.idCompCab = :idCompCab")
    , @NamedQuery(name = "ComposicaoCab.findByProjeto", query = "SELECT c FROM ComposicaoCab c WHERE c.projeto = :projeto")
    , @NamedQuery(name = "ComposicaoCab.findByDataProjeto", query = "SELECT c FROM ComposicaoCab c WHERE c.dataProjeto = :dataProjeto")
    , @NamedQuery(name = "ComposicaoCab.findByAutor", query = "SELECT c FROM ComposicaoCab c WHERE c.autor = :autor")
    , @NamedQuery(name = "ComposicaoCab.findByNomeComposicao", query = "SELECT c FROM ComposicaoCab c WHERE c.nomeComposicao = :nomeComposicao")
    , @NamedQuery(name = "ComposicaoCab.findByQrCod", query = "SELECT c FROM ComposicaoCab c WHERE c.qrCod = :qrCod")
    , @NamedQuery(name = "ComposicaoCab.findByDataComposicao", query = "SELECT c FROM ComposicaoCab c WHERE c.dataComposicao = :dataComposicao")
    , @NamedQuery(name = "ComposicaoCab.findByHoraComposicao", query = "SELECT c FROM ComposicaoCab c WHERE c.horaComposicao = :horaComposicao")
    , @NamedQuery(name = "ComposicaoCab.findByEstoque1", query = "SELECT c FROM ComposicaoCab c WHERE c.estoque1 = :estoque1")
    , @NamedQuery(name = "ComposicaoCab.findByEstoque2", query = "SELECT c FROM ComposicaoCab c WHERE c.estoque2 = :estoque2")
    , @NamedQuery(name = "ComposicaoCab.findByEstoque3", query = "SELECT c FROM ComposicaoCab c WHERE c.estoque3 = :estoque3")
    , @NamedQuery(name = "ComposicaoCab.findByLocalizacao", query = "SELECT c FROM ComposicaoCab c WHERE c.localizacao = :localizacao")
    , @NamedQuery(name = "ComposicaoCab.findByLaboratorio", query = "SELECT c FROM ComposicaoCab c WHERE c.laboratorio = :laboratorio")
    , @NamedQuery(name = "ComposicaoCab.findByIdLab", query = "SELECT c FROM ComposicaoCab c WHERE c.idLab = :idLab")
    , @NamedQuery(name = "ComposicaoCab.findByIdLocal", query = "SELECT c FROM ComposicaoCab c WHERE c.idLocal = :idLocal")
    , @NamedQuery(name = "ComposicaoCab.findByIdEstoque", query = "SELECT c FROM ComposicaoCab c WHERE c.idEstoque = :idEstoque")
    , @NamedQuery(name = "ComposicaoCab.findByIdUsuario", query = "SELECT c FROM ComposicaoCab c WHERE c.idUsuario = :idUsuario")
    , @NamedQuery(name = "ComposicaoCab.findByUsuario", query = "SELECT c FROM ComposicaoCab c WHERE c.usuario = :usuario")})
public class ComposicaoCab implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COMP_CAB")
    private Integer idCompCab;
    @Column(name = "PROJETO")
    private String projeto;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @Column(name = "DATA_PROJETO")
    @Temporal(TemporalType.DATE)
    private Date dataProjeto;
    @Column(name = "AUTOR")
    private String autor;
    @Column(name = "NOME_COMPOSICAO")
    private String nomeComposicao;
    @Column(name = "QR_COD")
    private String qrCod;
    @Column(name = "DATA_COMPOSICAO")
    @Temporal(TemporalType.DATE)
    private Date dataComposicao;
    @Column(name = "HORA_COMPOSICAO")
    private String horaComposicao;
    @Lob
    @Column(name = "OBS_COMPOSICAO")
    private String obsComposicao;
    @Column(name = "ESTOQUE1")
    private String estoque1;
    @Column(name = "ESTOQUE2")
    private String estoque2;
    @Column(name = "ESTOQUE3")
    private String estoque3;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCAL")
    private String idLocal;
    @Column(name = "ID_ESTOQUE")
    private String idEstoque;
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Column(name = "USUARIO")
    private String usuario;
    @OneToMany(mappedBy = "idCompCab")
    private List<ComposicaoDet> composicaoDetList;

    public ComposicaoCab() {
    }

    public ComposicaoCab(Integer idCompCab) {
        this.idCompCab = idCompCab;
    }

    public Integer getIdCompCab() {
        return idCompCab;
    }

    public void setIdCompCab(Integer idCompCab) {
        Integer oldIdCompCab = this.idCompCab;
        this.idCompCab = idCompCab;
        changeSupport.firePropertyChange("idCompCab", oldIdCompCab, idCompCab);
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        String oldProjeto = this.projeto;
        this.projeto = projeto;
        changeSupport.firePropertyChange("projeto", oldProjeto, projeto);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    public Date getDataProjeto() {
        return dataProjeto;
    }

    public void setDataProjeto(Date dataProjeto) {
        Date oldDataProjeto = this.dataProjeto;
        this.dataProjeto = dataProjeto;
        changeSupport.firePropertyChange("dataProjeto", oldDataProjeto, dataProjeto);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        String oldAutor = this.autor;
        this.autor = autor;
        changeSupport.firePropertyChange("autor", oldAutor, autor);
    }

    public String getNomeComposicao() {
        return nomeComposicao;
    }

    public void setNomeComposicao(String nomeComposicao) {
        String oldNomeComposicao = this.nomeComposicao;
        this.nomeComposicao = nomeComposicao;
        changeSupport.firePropertyChange("nomeComposicao", oldNomeComposicao, nomeComposicao);
    }

    public String getQrCod() {
        return qrCod;
    }

    public void setQrCod(String qrCod) {
        String oldQrCod = this.qrCod;
        this.qrCod = qrCod;
        changeSupport.firePropertyChange("qrCod", oldQrCod, qrCod);
    }

    public Date getDataComposicao() {
        return dataComposicao;
    }

    public void setDataComposicao(Date dataComposicao) {
        Date oldDataComposicao = this.dataComposicao;
        this.dataComposicao = dataComposicao;
        changeSupport.firePropertyChange("dataComposicao", oldDataComposicao, dataComposicao);
    }

    public String getHoraComposicao() {
        return horaComposicao;
    }

    public void setHoraComposicao(String horaComposicao) {
        String oldHoraComposicao = this.horaComposicao;
        this.horaComposicao = horaComposicao;
        changeSupport.firePropertyChange("horaComposicao", oldHoraComposicao, horaComposicao);
    }

    public String getObsComposicao() {
        return obsComposicao;
    }

    public void setObsComposicao(String obsComposicao) {
        String oldObsComposicao = this.obsComposicao;
        this.obsComposicao = obsComposicao;
        changeSupport.firePropertyChange("obsComposicao", oldObsComposicao, obsComposicao);
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

    public String getEstoque3() {
        return estoque3;
    }

    public void setEstoque3(String estoque3) {
        String oldEstoque3 = this.estoque3;
        this.estoque3 = estoque3;
        changeSupport.firePropertyChange("estoque3", oldEstoque3, estoque3);
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

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        String oldIdLocal = this.idLocal;
        this.idLocal = idLocal;
        changeSupport.firePropertyChange("idLocal", oldIdLocal, idLocal);
    }

    public String getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(String idEstoque) {
        String oldIdEstoque = this.idEstoque;
        this.idEstoque = idEstoque;
        changeSupport.firePropertyChange("idEstoque", oldIdEstoque, idEstoque);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        String oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public List<ComposicaoDet> getComposicaoDetList() {
        return composicaoDetList;
    }

    public void setComposicaoDetList(List<ComposicaoDet> composicaoDetList) {
        this.composicaoDetList = composicaoDetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompCab != null ? idCompCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComposicaoCab)) {
            return false;
        }
        ComposicaoCab other = (ComposicaoCab) object;
        if ((this.idCompCab == null && other.idCompCab != null) || (this.idCompCab != null && !this.idCompCab.equals(other.idCompCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.ComposicaoCab[ idCompCab=" + idCompCab + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
