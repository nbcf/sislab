/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.Segurança;

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
@Table(name = "pcs_cadastrados", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "PcsCadastrados.findAll", query = "SELECT p FROM PcsCadastrados p")
    , @NamedQuery(name = "PcsCadastrados.findByIdPcc", query = "SELECT p FROM PcsCadastrados p WHERE p.idPcc = :idPcc")
    , @NamedQuery(name = "PcsCadastrados.findByLab", query = "SELECT p FROM PcsCadastrados p WHERE p.lab = :lab")
    , @NamedQuery(name = "PcsCadastrados.findByLocal", query = "SELECT p FROM PcsCadastrados p WHERE p.local = :local")
    , @NamedQuery(name = "PcsCadastrados.findBySala", query = "SELECT p FROM PcsCadastrados p WHERE p.sala = :sala")
    , @NamedQuery(name = "PcsCadastrados.findByDepto", query = "SELECT p FROM PcsCadastrados p WHERE p.depto = :depto")
    , @NamedQuery(name = "PcsCadastrados.findByPc", query = "SELECT p FROM PcsCadastrados p WHERE p.pc = :pc")
    , @NamedQuery(name = "PcsCadastrados.findByDescricao", query = "SELECT p FROM PcsCadastrados p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "PcsCadastrados.findByTipo", query = "SELECT p FROM PcsCadastrados p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "PcsCadastrados.findByNumero", query = "SELECT p FROM PcsCadastrados p WHERE p.numero = :numero")
    , @NamedQuery(name = "PcsCadastrados.findByEtiqueta", query = "SELECT p FROM PcsCadastrados p WHERE p.etiqueta = :etiqueta")
    , @NamedQuery(name = "PcsCadastrados.findByHd", query = "SELECT p FROM PcsCadastrados p WHERE p.hd = :hd")
    , @NamedQuery(name = "PcsCadastrados.findByMemoria", query = "SELECT p FROM PcsCadastrados p WHERE p.memoria = :memoria")
    , @NamedQuery(name = "PcsCadastrados.findBySistema", query = "SELECT p FROM PcsCadastrados p WHERE p.sistema = :sistema")
    , @NamedQuery(name = "PcsCadastrados.findByPlacaMae", query = "SELECT p FROM PcsCadastrados p WHERE p.placaMae = :placaMae")
    , @NamedQuery(name = "PcsCadastrados.findByPatrimonio", query = "SELECT p FROM PcsCadastrados p WHERE p.patrimonio = :patrimonio")
    , @NamedQuery(name = "PcsCadastrados.findByIdPlacaMae", query = "SELECT p FROM PcsCadastrados p WHERE p.idPlacaMae = :idPlacaMae")
    , @NamedQuery(name = "PcsCadastrados.findByIdHd", query = "SELECT p FROM PcsCadastrados p WHERE p.idHd = :idHd")
    , @NamedQuery(name = "PcsCadastrados.findByIp", query = "SELECT p FROM PcsCadastrados p WHERE p.ip = :ip")
    , @NamedQuery(name = "PcsCadastrados.findByIdf1", query = "SELECT p FROM PcsCadastrados p WHERE p.idf1 = :idf1")
    , @NamedQuery(name = "PcsCadastrados.findByIdf2", query = "SELECT p FROM PcsCadastrados p WHERE p.idf2 = :idf2")
    , @NamedQuery(name = "PcsCadastrados.findByIdf3", query = "SELECT p FROM PcsCadastrados p WHERE p.idf3 = :idf3")
    , @NamedQuery(name = "PcsCadastrados.findByIdLab", query = "SELECT p FROM PcsCadastrados p WHERE p.idLab = :idLab")
    , @NamedQuery(name = "PcsCadastrados.findByIdLocal", query = "SELECT p FROM PcsCadastrados p WHERE p.idLocal = :idLocal")
   , @NamedQuery(name = "PcsCadastrados.PesquisaPMCadastrada", query = "SELECT p FROM PcsCadastrados p WHERE p.idLab = :idLab AND p.idPlacaMae = :idPlacaMae")
})
public class PcsCadastrados implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PCC")
    private Integer idPcc;
    @Column(name = "LAB")
    private String lab;
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "DEPTO")
    private String depto;
    @Column(name = "PC")
    private String pc;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "ETIQUETA")
    private String etiqueta;
    @Column(name = "HD")
    private String hd;
    @Column(name = "MEMORIA")
    private String memoria;
    @Column(name = "SISTEMA")
    private String sistema;
    @Column(name = "PLACA_MAE")
    private String placaMae;
    @Column(name = "PATRIMONIO")
    private String patrimonio;
    @Column(name = "ID_PLACA_MAE")
    private String idPlacaMae;
    @Column(name = "ID_HD")
    private String idHd;
    @Column(name = "IP")
    private String ip;
    @Column(name = "IDF1")
    private String idf1;
    @Column(name = "IDF2")
    private String idf2;
    @Column(name = "IDF3")
    private String idf3;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCAL")
    private String idLocal;

    public PcsCadastrados() {
    }

    public PcsCadastrados(Integer idPcc) {
        this.idPcc = idPcc;
    }

    public Integer getIdPcc() {
        return idPcc;
    }

    public void setIdPcc(Integer idPcc) {
        Integer oldIdPcc = this.idPcc;
        this.idPcc = idPcc;
        changeSupport.firePropertyChange("idPcc", oldIdPcc, idPcc);
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        String oldLab = this.lab;
        this.lab = lab;
        changeSupport.firePropertyChange("lab", oldLab, lab);
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

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        String oldDepto = this.depto;
        this.depto = depto;
        changeSupport.firePropertyChange("depto", oldDepto, depto);
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        String oldPc = this.pc;
        this.pc = pc;
        changeSupport.firePropertyChange("pc", oldPc, pc);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        String oldEtiqueta = this.etiqueta;
        this.etiqueta = etiqueta;
        changeSupport.firePropertyChange("etiqueta", oldEtiqueta, etiqueta);
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        String oldHd = this.hd;
        this.hd = hd;
        changeSupport.firePropertyChange("hd", oldHd, hd);
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        String oldMemoria = this.memoria;
        this.memoria = memoria;
        changeSupport.firePropertyChange("memoria", oldMemoria, memoria);
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        String oldSistema = this.sistema;
        this.sistema = sistema;
        changeSupport.firePropertyChange("sistema", oldSistema, sistema);
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        String oldPlacaMae = this.placaMae;
        this.placaMae = placaMae;
        changeSupport.firePropertyChange("placaMae", oldPlacaMae, placaMae);
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        String oldPatrimonio = this.patrimonio;
        this.patrimonio = patrimonio;
        changeSupport.firePropertyChange("patrimonio", oldPatrimonio, patrimonio);
    }

    public String getIdPlacaMae() {
        return idPlacaMae;
    }

    public void setIdPlacaMae(String idPlacaMae) {
        String oldIdPlacaMae = this.idPlacaMae;
        this.idPlacaMae = idPlacaMae;
        changeSupport.firePropertyChange("idPlacaMae", oldIdPlacaMae, idPlacaMae);
    }

    public String getIdHd() {
        return idHd;
    }

    public void setIdHd(String idHd) {
        String oldIdHd = this.idHd;
        this.idHd = idHd;
        changeSupport.firePropertyChange("idHd", oldIdHd, idHd);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        String oldIp = this.ip;
        this.ip = ip;
        changeSupport.firePropertyChange("ip", oldIp, ip);
    }

    public String getIdf1() {
        return idf1;
    }

    public void setIdf1(String idf1) {
        String oldIdf1 = this.idf1;
        this.idf1 = idf1;
        changeSupport.firePropertyChange("idf1", oldIdf1, idf1);
    }

    public String getIdf2() {
        return idf2;
    }

    public void setIdf2(String idf2) {
        String oldIdf2 = this.idf2;
        this.idf2 = idf2;
        changeSupport.firePropertyChange("idf2", oldIdf2, idf2);
    }

    public String getIdf3() {
        return idf3;
    }

    public void setIdf3(String idf3) {
        String oldIdf3 = this.idf3;
        this.idf3 = idf3;
        changeSupport.firePropertyChange("idf3", oldIdf3, idf3);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPcc != null ? idPcc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PcsCadastrados)) {
            return false;
        }
        PcsCadastrados other = (PcsCadastrados) object;
        if ((this.idPcc == null && other.idPcc != null) || (this.idPcc != null && !this.idPcc.equals(other.idPcc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.Seguran\u00e7a.PcsCadastrados[ idPcc=" + idPcc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
