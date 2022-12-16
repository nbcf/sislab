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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author NILDO
 */
@Entity
@Table(name = "reagente", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "Reagente.findAll", query = "SELECT r FROM Reagente r")
    , @NamedQuery(name = "Reagente.findByIdReagente", query = "SELECT r FROM Reagente r WHERE r.idReagente = :idReagente")
    , @NamedQuery(name = "Reagente.findByNome", query = "SELECT r FROM Reagente r WHERE r.nome = :nome")
    , @NamedQuery(name = "Reagente.findByTipoReagente", query = "SELECT r FROM Reagente r WHERE r.tipoReagente = :tipoReagente")
    , @NamedQuery(name = "Reagente.findByFabricante", query = "SELECT r FROM Reagente r WHERE r.fabricante = :fabricante")
    , @NamedQuery(name = "Reagente.findByConcentracao", query = "SELECT r FROM Reagente r WHERE r.concentracao = :concentracao")
    , @NamedQuery(name = "Reagente.findByCodPlanilha", query = "SELECT r FROM Reagente r WHERE r.codPlanilha = :codPlanilha")
    , @NamedQuery(name = "Reagente.findByQuantUnd", query = "SELECT r FROM Reagente r WHERE r.quantUnd = :quantUnd")
    , @NamedQuery(name = "Reagente.findByQuantMin", query = "SELECT r FROM Reagente r WHERE r.quantMin = :quantMin")
    , @NamedQuery(name = "Reagente.findByQuantAtual", query = "SELECT r FROM Reagente r WHERE r.quantAtual = :quantAtual")
    , @NamedQuery(name = "Reagente.findByTipoUnd", query = "SELECT r FROM Reagente r WHERE r.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "Reagente.findByFlagFracionado", query = "SELECT r FROM Reagente r WHERE r.flagFracionado = :flagFracionado")
    , @NamedQuery(name = "Reagente.findByFlagReagente", query = "SELECT r FROM Reagente r WHERE r.flagReagente = :flagReagente")
    , @NamedQuery(name = "Reagente.findByStatusReagente", query = "SELECT r FROM Reagente r WHERE r.statusReagente = :statusReagente")
    , @NamedQuery(name = "Reagente.findByLaboratorio", query = "SELECT r FROM Reagente r WHERE r.laboratorio = :laboratorio")
    , @NamedQuery(name = "Reagente.findByLocalizacao", query = "SELECT r FROM Reagente r WHERE r.localizacao = :localizacao")
    , @NamedQuery(name = "Reagente.findBySala", query = "SELECT r FROM Reagente r WHERE r.sala = :sala")
    , @NamedQuery(name = "Reagente.findByEst1", query = "SELECT r FROM Reagente r WHERE r.est1 = :est1")
    , @NamedQuery(name = "Reagente.findByEst2", query = "SELECT r FROM Reagente r WHERE r.est2 = :est2")
    , @NamedQuery(name = "Reagente.findByEstf", query = "SELECT r FROM Reagente r WHERE r.estf = :estf")
    , @NamedQuery(name = "Reagente.findByIdEstoque", query = "SELECT r FROM Reagente r WHERE r.idEstoque = :idEstoque")
    , @NamedQuery(name = "Reagente.findByIdFabricante", query = "SELECT r FROM Reagente r WHERE r.idFabricante = :idFabricante")
    , @NamedQuery(name = "Reagente.findBySiteFabricante", query = "SELECT r FROM Reagente r WHERE r.siteFabricante = :siteFabricante")
    , @NamedQuery(name = "Reagente.findByTelFabricante", query = "SELECT r FROM Reagente r WHERE r.telFabricante = :telFabricante")
    , @NamedQuery(name = "Reagente.findByCodQreagente", query = "SELECT r FROM Reagente r WHERE r.codQreagente = :codQreagente")
    , @NamedQuery(name = "Reagente.findByIdLab", query = "SELECT r FROM Reagente r WHERE r.idLab = :idLab")
    , @NamedQuery(name = "Reagente.findByIdLocalizacao", query = "SELECT r FROM Reagente r WHERE r.idLocalizacao = :idLocalizacao")
    , @NamedQuery(name = "Reagente.findByLperc", query = "SELECT r FROM Reagente r WHERE r.lperc = :lperc")
    , @NamedQuery(name = "Reagente.findByFlagToxico", query = "SELECT r FROM Reagente r WHERE r.flagToxico = :flagToxico")
    , @NamedQuery(name = "Reagente.findByCaraterReagente", query = "SELECT r FROM Reagente r WHERE r.caraterReagente = :caraterReagente")
    , @NamedQuery(name = "Reagente.findByTempCondi", query = "SELECT r FROM Reagente r WHERE r.tempCondi = :tempCondi")
    , @NamedQuery(name = "Reagente.findByFlagReagenteMaterail", query = "SELECT r FROM Reagente r WHERE r.flagReagenteMaterail = :flagReagenteMaterail")

 
    , @NamedQuery(name = "Reagente.findByProdEstoqueBaixo", query = "SELECT r FROM Reagente r WHERE r.idLab = :idLab AND r.quantAtual <= r.quantMin")
    , @NamedQuery(name = "Reagente.findByProdEstoqueBaixoLocal", query = "SELECT r FROM Reagente r WHERE r.idLab = :idLab AND r.idLocalizacao = :idLocalizacao")
    , @NamedQuery(name = "Reagente.FiltraPorLocal", query = "SELECT r FROM Reagente r WHERE r.idLab = :idLab AND r.idLocalizacao = :idLocalizacao")
    , @NamedQuery(name = "Reagente.FiltraPorNomeReagente", query = "SELECT r FROM Reagente r WHERE r.idLab = :idLab AND r.nome = :nome AND r.statusReagente = :statusReagente")     


})
public class Reagente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_REAGENTE")
    private Integer idReagente;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TIPO_REAGENTE")
    private String tipoReagente;
    @Column(name = "FABRICANTE")
    private String fabricante;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CONCENTRACAO")
    private Double concentracao;
    @Column(name = "COD_PLANILHA")
    private String codPlanilha;
    @Lob
    @Column(name = "INCOMPAT")
    private String incompat;
    @Column(name = "QUANT_UND")
    private Double quantUnd;
    @Column(name = "QUANT_MIN")
    private Integer quantMin;
    @Column(name = "QUANT_ATUAL")
    private Integer quantAtual;
    @Column(name = "TIPO_UND")
    private String tipoUnd;
    @Column(name = "FLAG_FRACIONADO")
    private String flagFracionado;
    @Column(name = "FLAG_REAGENTE")
    private String flagReagente;
    @Column(name = "STATUS_REAGENTE")
    private String statusReagente;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "EST1")
    private String est1;
    @Column(name = "EST2")
    private String est2;
    @Column(name = "ESTF")
    private String estf;
    @Column(name = "ID_ESTOQUE")
    private String idEstoque;
    @Column(name = "ID_FABRICANTE")
    private String idFabricante;
    @Column(name = "SITE_FABRICANTE")
    private String siteFabricante;
    @Column(name = "TEL_FABRICANTE")
    private String telFabricante;
    @Column(name = "COD_QREAGENTE")
    private String codQreagente;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "ID_LOCALIZACAO")
    private String idLocalizacao;
    @Column(name = "LPERC")
    private Double lperc;
    @Column(name = "FLAG_TOXICO")
    private String flagToxico;
    @Column(name = "CARATER_REAGENTE")
    private String caraterReagente;
    @Column(name = "TEMP_CONDI")
    private String tempCondi;
    @Column(name = "FLAG_REAGENTE_MATERAIL")
    private String flagReagenteMaterail;

    public Reagente() {
    }

    public Reagente(Integer idReagente) {
        this.idReagente = idReagente;
    }

    public Integer getIdReagente() {
        return idReagente;
    }

    public void setIdReagente(Integer idReagente) {
        Integer oldIdReagente = this.idReagente;
        this.idReagente = idReagente;
        changeSupport.firePropertyChange("idReagente", oldIdReagente, idReagente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getTipoReagente() {
        return tipoReagente;
    }

    public void setTipoReagente(String tipoReagente) {
        String oldTipoReagente = this.tipoReagente;
        this.tipoReagente = tipoReagente;
        changeSupport.firePropertyChange("tipoReagente", oldTipoReagente, tipoReagente);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        String oldFabricante = this.fabricante;
        this.fabricante = fabricante;
        changeSupport.firePropertyChange("fabricante", oldFabricante, fabricante);
    }

    public Double getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(Double concentracao) {
        Double oldConcentracao = this.concentracao;
        this.concentracao = concentracao;
        changeSupport.firePropertyChange("concentracao", oldConcentracao, concentracao);
    }

    public String getCodPlanilha() {
        return codPlanilha;
    }

    public void setCodPlanilha(String codPlanilha) {
        String oldCodPlanilha = this.codPlanilha;
        this.codPlanilha = codPlanilha;
        changeSupport.firePropertyChange("codPlanilha", oldCodPlanilha, codPlanilha);
    }

    public String getIncompat() {
        return incompat;
    }

    public void setIncompat(String incompat) {
        String oldIncompat = this.incompat;
        this.incompat = incompat;
        changeSupport.firePropertyChange("incompat", oldIncompat, incompat);
    }

    public Double getQuantUnd() {
        return quantUnd;
    }

    public void setQuantUnd(Double quantUnd) {
        Double oldQuantUnd = this.quantUnd;
        this.quantUnd = quantUnd;
        changeSupport.firePropertyChange("quantUnd", oldQuantUnd, quantUnd);
    }

    public Integer getQuantMin() {
        return quantMin;
    }

    public void setQuantMin(Integer quantMin) {
        Integer oldQuantMin = this.quantMin;
        this.quantMin = quantMin;
        changeSupport.firePropertyChange("quantMin", oldQuantMin, quantMin);
    }

    public Integer getQuantAtual() {
        return quantAtual;
    }

    public void setQuantAtual(Integer quantAtual) {
        Integer oldQuantAtual = this.quantAtual;
        this.quantAtual = quantAtual;
        changeSupport.firePropertyChange("quantAtual", oldQuantAtual, quantAtual);
    }

    public String getTipoUnd() {
        return tipoUnd;
    }

    public void setTipoUnd(String tipoUnd) {
        String oldTipoUnd = this.tipoUnd;
        this.tipoUnd = tipoUnd;
        changeSupport.firePropertyChange("tipoUnd", oldTipoUnd, tipoUnd);
    }

    public String getFlagFracionado() {
        return flagFracionado;
    }

    public void setFlagFracionado(String flagFracionado) {
        String oldFlagFracionado = this.flagFracionado;
        this.flagFracionado = flagFracionado;
        changeSupport.firePropertyChange("flagFracionado", oldFlagFracionado, flagFracionado);
    }

    public String getFlagReagente() {
        return flagReagente;
    }

    public void setFlagReagente(String flagReagente) {
        String oldFlagReagente = this.flagReagente;
        this.flagReagente = flagReagente;
        changeSupport.firePropertyChange("flagReagente", oldFlagReagente, flagReagente);
    }

    public String getStatusReagente() {
        return statusReagente;
    }

    public void setStatusReagente(String statusReagente) {
        String oldStatusReagente = this.statusReagente;
        this.statusReagente = statusReagente;
        changeSupport.firePropertyChange("statusReagente", oldStatusReagente, statusReagente);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
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

    public String getEst1() {
        return est1;
    }

    public void setEst1(String est1) {
        String oldEst1 = this.est1;
        this.est1 = est1;
        changeSupport.firePropertyChange("est1", oldEst1, est1);
    }

    public String getEst2() {
        return est2;
    }

    public void setEst2(String est2) {
        String oldEst2 = this.est2;
        this.est2 = est2;
        changeSupport.firePropertyChange("est2", oldEst2, est2);
    }

    public String getEstf() {
        return estf;
    }

    public void setEstf(String estf) {
        String oldEstf = this.estf;
        this.estf = estf;
        changeSupport.firePropertyChange("estf", oldEstf, estf);
    }

    public String getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(String idEstoque) {
        String oldIdEstoque = this.idEstoque;
        this.idEstoque = idEstoque;
        changeSupport.firePropertyChange("idEstoque", oldIdEstoque, idEstoque);
    }

    public String getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(String idFabricante) {
        String oldIdFabricante = this.idFabricante;
        this.idFabricante = idFabricante;
        changeSupport.firePropertyChange("idFabricante", oldIdFabricante, idFabricante);
    }

    public String getSiteFabricante() {
        return siteFabricante;
    }

    public void setSiteFabricante(String siteFabricante) {
        String oldSiteFabricante = this.siteFabricante;
        this.siteFabricante = siteFabricante;
        changeSupport.firePropertyChange("siteFabricante", oldSiteFabricante, siteFabricante);
    }

    public String getTelFabricante() {
        return telFabricante;
    }

    public void setTelFabricante(String telFabricante) {
        String oldTelFabricante = this.telFabricante;
        this.telFabricante = telFabricante;
        changeSupport.firePropertyChange("telFabricante", oldTelFabricante, telFabricante);
    }

    public String getCodQreagente() {
        return codQreagente;
    }

    public void setCodQreagente(String codQreagente) {
        String oldCodQreagente = this.codQreagente;
        this.codQreagente = codQreagente;
        changeSupport.firePropertyChange("codQreagente", oldCodQreagente, codQreagente);
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

    public Double getLperc() {
        return lperc;
    }

    public void setLperc(Double lperc) {
        Double oldLperc = this.lperc;
        this.lperc = lperc;
        changeSupport.firePropertyChange("lperc", oldLperc, lperc);
    }

    public String getFlagToxico() {
        return flagToxico;
    }

    public void setFlagToxico(String flagToxico) {
        String oldFlagToxico = this.flagToxico;
        this.flagToxico = flagToxico;
        changeSupport.firePropertyChange("flagToxico", oldFlagToxico, flagToxico);
    }

    public String getCaraterReagente() {
        return caraterReagente;
    }

    public void setCaraterReagente(String caraterReagente) {
        String oldCaraterReagente = this.caraterReagente;
        this.caraterReagente = caraterReagente;
        changeSupport.firePropertyChange("caraterReagente", oldCaraterReagente, caraterReagente);
    }

    public String getTempCondi() {
        return tempCondi;
    }

    public void setTempCondi(String tempCondi) {
        String oldTempCondi = this.tempCondi;
        this.tempCondi = tempCondi;
        changeSupport.firePropertyChange("tempCondi", oldTempCondi, tempCondi);
    }

    public String getFlagReagenteMaterail() {
        return flagReagenteMaterail;
    }

    public void setFlagReagenteMaterail(String flagReagenteMaterail) {
        String oldFlagReagenteMaterail = this.flagReagenteMaterail;
        this.flagReagenteMaterail = flagReagenteMaterail;
        changeSupport.firePropertyChange("flagReagenteMaterail", oldFlagReagenteMaterail, flagReagenteMaterail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReagente != null ? idReagente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reagente)) {
            return false;
        }
        Reagente other = (Reagente) object;
        if ((this.idReagente == null && other.idReagente != null) || (this.idReagente != null && !this.idReagente.equals(other.idReagente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.beans.Reagente[ idReagente=" + idReagente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
