/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.lotesNotas;


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
import sislab.proteomica.view.movimento.MovDet;
/**
 *
 * @author NILDO
 */
@Entity
@Table(name = "cad_lotes", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadLotes.findAll", query = "SELECT c FROM CadLotes c")
    , @NamedQuery(name = "CadLotes.findByIdCadLotes", query = "SELECT c FROM CadLotes c WHERE c.idCadLotes = :idCadLotes")
    , @NamedQuery(name = "CadLotes.findByLaboratorio", query = "SELECT c FROM CadLotes c WHERE c.laboratorio = :laboratorio")
    , @NamedQuery(name = "CadLotes.findByTipoMovimento", query = "SELECT c FROM CadLotes c WHERE c.tipoMovimento = :tipoMovimento")
    , @NamedQuery(name = "CadLotes.findByNumeroNota", query = "SELECT c FROM CadLotes c WHERE c.numeroNota = :numeroNota")
    , @NamedQuery(name = "CadLotes.findBySerieNota", query = "SELECT c FROM CadLotes c WHERE c.serieNota = :serieNota")
    , @NamedQuery(name = "CadLotes.findByFornecedor", query = "SELECT c FROM CadLotes c WHERE c.fornecedor = :fornecedor")
    , @NamedQuery(name = "CadLotes.findByCodPlanilha", query = "SELECT c FROM CadLotes c WHERE c.codPlanilha = :codPlanilha")
    , @NamedQuery(name = "CadLotes.findByConcentracao", query = "SELECT c FROM CadLotes c WHERE c.concentracao = :concentracao")
    , @NamedQuery(name = "CadLotes.findByDataCompra", query = "SELECT c FROM CadLotes c WHERE c.dataCompra = :dataCompra")
    , @NamedQuery(name = "CadLotes.findByDataNota", query = "SELECT c FROM CadLotes c WHERE c.dataNota = :dataNota")
    , @NamedQuery(name = "CadLotes.findByDataCadastro", query = "SELECT c FROM CadLotes c WHERE c.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "CadLotes.findByQuantCompra", query = "SELECT c FROM CadLotes c WHERE c.quantCompra = :quantCompra")
    , @NamedQuery(name = "CadLotes.findByLote", query = "SELECT c FROM CadLotes c WHERE c.lote = :lote")
    , @NamedQuery(name = "CadLotes.findBySerieLote", query = "SELECT c FROM CadLotes c WHERE c.serieLote = :serieLote")
    , @NamedQuery(name = "CadLotes.findByValidadeLote", query = "SELECT c FROM CadLotes c WHERE c.validadeLote = :validadeLote")
    , @NamedQuery(name = "CadLotes.findByUsuario", query = "SELECT c FROM CadLotes c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "CadLotes.findByIdUsuario", query = "SELECT c FROM CadLotes c WHERE c.idUsuario = :idUsuario")
    , @NamedQuery(name = "CadLotes.findByIdForcedor", query = "SELECT c FROM CadLotes c WHERE c.idForcedor = :idForcedor")
    , @NamedQuery(name = "CadLotes.findByIdLaboratorio", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio")
    , @NamedQuery(name = "CadLotes.findByReagente", query = "SELECT c FROM CadLotes c WHERE c.reagente = :reagente")
    , @NamedQuery(name = "CadLotes.findByIdReagente", query = "SELECT c FROM CadLotes c WHERE c.idReagente = :idReagente")
    , @NamedQuery(name = "CadLotes.findByFlagNota", query = "SELECT c FROM CadLotes c WHERE c.flagNota = :flagNota")
    , @NamedQuery(name = "CadLotes.findByFlagLote", query = "SELECT c FROM CadLotes c WHERE c.flagLote = :flagLote")
    , @NamedQuery(name = "CadLotes.findByStatusNota", query = "SELECT c FROM CadLotes c WHERE c.statusNota = :statusNota")
    , @NamedQuery(name = "CadLotes.findByStatusLote", query = "SELECT c FROM CadLotes c WHERE c.statusLote = :statusLote")
    , @NamedQuery(name = "CadLotes.findByTipoReagente", query = "SELECT c FROM CadLotes c WHERE c.tipoReagente = :tipoReagente")
    , @NamedQuery(name = "CadLotes.findByFabricante", query = "SELECT c FROM CadLotes c WHERE c.fabricante = :fabricante")
    , @NamedQuery(name = "CadLotes.findByTipoUnd", query = "SELECT c FROM CadLotes c WHERE c.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "CadLotes.findByQuantUnd", query = "SELECT c FROM CadLotes c WHERE c.quantUnd = :quantUnd")
    , @NamedQuery(name = "CadLotes.findByFlagFracionado", query = "SELECT c FROM CadLotes c WHERE c.flagFracionado = :flagFracionado")
    , @NamedQuery(name = "CadLotes.findByFlagReagente", query = "SELECT c FROM CadLotes c WHERE c.flagReagente = :flagReagente")
    , @NamedQuery(name = "CadLotes.findByStatusReagente", query = "SELECT c FROM CadLotes c WHERE c.statusReagente = :statusReagente")
    , @NamedQuery(name = "CadLotes.findByLocalizacao", query = "SELECT c FROM CadLotes c WHERE c.localizacao = :localizacao")
    , @NamedQuery(name = "CadLotes.findBySala", query = "SELECT c FROM CadLotes c WHERE c.sala = :sala")
    , @NamedQuery(name = "CadLotes.findByEst1", query = "SELECT c FROM CadLotes c WHERE c.est1 = :est1")
    , @NamedQuery(name = "CadLotes.findByEst2", query = "SELECT c FROM CadLotes c WHERE c.est2 = :est2")
    , @NamedQuery(name = "CadLotes.findByEstf", query = "SELECT c FROM CadLotes c WHERE c.estf = :estf")
    , @NamedQuery(name = "CadLotes.findByIdEstoque", query = "SELECT c FROM CadLotes c WHERE c.idEstoque = :idEstoque")
    , @NamedQuery(name = "CadLotes.findByIdFabricante", query = "SELECT c FROM CadLotes c WHERE c.idFabricante = :idFabricante")
    , @NamedQuery(name = "CadLotes.findBySiteFabricante", query = "SELECT c FROM CadLotes c WHERE c.siteFabricante = :siteFabricante")
    , @NamedQuery(name = "CadLotes.findByTelFabricante", query = "SELECT c FROM CadLotes c WHERE c.telFabricante = :telFabricante")
    , @NamedQuery(name = "CadLotes.findByCodQreagente", query = "SELECT c FROM CadLotes c WHERE c.codQreagente = :codQreagente")
    , @NamedQuery(name = "CadLotes.findByFlagToxico", query = "SELECT c FROM CadLotes c WHERE c.flagToxico = :flagToxico")
    , @NamedQuery(name = "CadLotes.findByCaraterReagente", query = "SELECT c FROM CadLotes c WHERE c.caraterReagente = :caraterReagente")
    , @NamedQuery(name = "CadLotes.findByIdLocal", query = "SELECT c FROM CadLotes c WHERE c.idLocal = :idLocal")
    , @NamedQuery(name = "CadLotes.findByLperc", query = "SELECT c FROM CadLotes c WHERE c.lperc = :lperc")
    , @NamedQuery(name = "CadLotes.findByValorCompra", query = "SELECT c FROM CadLotes c WHERE c.valorCompra = :valorCompra")
    , @NamedQuery(name = "CadLotes.findByValorFinalUnd", query = "SELECT c FROM CadLotes c WHERE c.valorFinalUnd = :valorFinalUnd")
    , @NamedQuery(name = "CadLotes.findByTempCondi", query = "SELECT c FROM CadLotes c WHERE c.tempCondi = :tempCondi")
    , @NamedQuery(name = "CadLotes.findByFlagReagenteMat", query = "SELECT c FROM CadLotes c WHERE c.flagReagenteMat = :flagReagenteMat")

    , @NamedQuery(name = "CadLotes.PesquisaLabLocal", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.idLocal = :idLocal") 
    , @NamedQuery(name = "CadLotes.BuscaLote", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.idForcedor = :idForcedor AND c.lote = :lote")  
    , @NamedQuery(name = "CadLotes.LimpaPesquisa", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio")
    , @NamedQuery(name = "CadLotes.zero", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.idCadLotes = :idCadLotes")
    , @NamedQuery(name = "CadLotes.BuscaNotaFiscal", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.numeroNota = :numeroNota")  
    , @NamedQuery(name = "CadLotes.BuscaCodPlanilha", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.codPlanilha = :codPlanilha ") 
    , @NamedQuery(name = "CadLotes.BuscaFornecedorDataCompra", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.dataCompra BETWEEN :dataIni AND :dataFim")    
    , @NamedQuery(name = "CadLotes.BuscaFornecedorDataNota", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.dataNota BETWEEN :dataIni AND :dataFim")
    , @NamedQuery(name = "CadLotes.BuscaLabLote", query = "SELECT c FROM CadLotes c WHERE c.idLaboratorio = :idLaboratorio AND c.lote = :lote")      

})
public class CadLotes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CAD_LOTES")
    private Integer idCadLotes;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "TIPO_MOVIMENTO")
    private String tipoMovimento;
    @Column(name = "NUMERO_NOTA")
    private String numeroNota;
    @Column(name = "SERIE_NOTA")
    private String serieNota;
    @Column(name = "FORNECEDOR")
    private String fornecedor;
    @Column(name = "COD_PLANILHA")
    private String codPlanilha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CONCENTRACAO")
    private Double concentracao;
    @Column(name = "DATA_COMPRA")
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @Column(name = "DATA_NOTA")
    @Temporal(TemporalType.DATE)
    private Date dataNota;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column(name = "QUANT_COMPRA")
    private Integer quantCompra;
    @Column(name = "LOTE")
    private String lote;
    @Column(name = "SERIE_LOTE")
    private String serieLote;
    @Column(name = "VALIDADE_LOTE")
    @Temporal(TemporalType.DATE)
    private Date validadeLote;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Column(name = "ID_FORCEDOR")
    private String idForcedor;
    @Column(name = "ID_LABORATORIO")
    private String idLaboratorio;
    @Column(name = "REAGENTE")
    private String reagente;
    @Column(name = "ID_REAGENTE")
    private String idReagente;
    @Column(name = "FLAG_NOTA")
    private String flagNota;
    @Column(name = "FLAG_LOTE")
    private String flagLote;
    @Column(name = "STATUS_NOTA")
    private String statusNota;
    @Column(name = "STATUS_LOTE")
    private String statusLote;
    @Column(name = "TIPO_REAGENTE")
    private String tipoReagente;
    @Column(name = "FABRICANTE")
    private String fabricante;
    @Lob
    @Column(name = "INCOMPAT")
    private String incompat;
    @Column(name = "TIPO_UND")
    private String tipoUnd;
    @Column(name = "QUANT_UND")
    private String quantUnd;
    @Column(name = "FLAG_FRACIONADO")
    private String flagFracionado;
    @Column(name = "FLAG_REAGENTE")
    private String flagReagente;
    @Column(name = "STATUS_REAGENTE")
    private String statusReagente;
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
    @Column(name = "FLAG_TOXICO")
    private String flagToxico;
    @Column(name = "CARATER_REAGENTE")
    private String caraterReagente;
    @Column(name = "ID_LOCAL")
    private String idLocal;
    @Column(name = "LPERC")
    private Double lperc;
    @Column(name = "VALOR_COMPRA")
    private Double valorCompra;
    @Column(name = "VALOR_FINAL_UND")
    private Double valorFinalUnd;
    @Column(name = "TEMP_CONDI")
    private String tempCondi;
    @Column(name = "FLAG_REAGENTE_MAT")
    private String flagReagenteMat;
    @OneToMany(mappedBy = "idCadLotes")
    private List<MovDet> movDetList;

    public CadLotes() {
    }

    public CadLotes(Integer idCadLotes) {
        this.idCadLotes = idCadLotes;
    }

    public Integer getIdCadLotes() {
        return idCadLotes;
    }

    public void setIdCadLotes(Integer idCadLotes) {
        Integer oldIdCadLotes = this.idCadLotes;
        this.idCadLotes = idCadLotes;
        changeSupport.firePropertyChange("idCadLotes", oldIdCadLotes, idCadLotes);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        String oldTipoMovimento = this.tipoMovimento;
        this.tipoMovimento = tipoMovimento;
        changeSupport.firePropertyChange("tipoMovimento", oldTipoMovimento, tipoMovimento);
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        String oldNumeroNota = this.numeroNota;
        this.numeroNota = numeroNota;
        changeSupport.firePropertyChange("numeroNota", oldNumeroNota, numeroNota);
    }

    public String getSerieNota() {
        return serieNota;
    }

    public void setSerieNota(String serieNota) {
        String oldSerieNota = this.serieNota;
        this.serieNota = serieNota;
        changeSupport.firePropertyChange("serieNota", oldSerieNota, serieNota);
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        String oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public String getCodPlanilha() {
        return codPlanilha;
    }

    public void setCodPlanilha(String codPlanilha) {
        String oldCodPlanilha = this.codPlanilha;
        this.codPlanilha = codPlanilha;
        changeSupport.firePropertyChange("codPlanilha", oldCodPlanilha, codPlanilha);
    }

    public Double getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(Double concentracao) {
        Double oldConcentracao = this.concentracao;
        this.concentracao = concentracao;
        changeSupport.firePropertyChange("concentracao", oldConcentracao, concentracao);
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        Date oldDataCompra = this.dataCompra;
        this.dataCompra = dataCompra;
        changeSupport.firePropertyChange("dataCompra", oldDataCompra, dataCompra);
    }

    public Date getDataNota() {
        return dataNota;
    }

    public void setDataNota(Date dataNota) {
        Date oldDataNota = this.dataNota;
        this.dataNota = dataNota;
        changeSupport.firePropertyChange("dataNota", oldDataNota, dataNota);
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        Date oldDataCadastro = this.dataCadastro;
        this.dataCadastro = dataCadastro;
        changeSupport.firePropertyChange("dataCadastro", oldDataCadastro, dataCadastro);
    }

    public Integer getQuantCompra() {
        return quantCompra;
    }

    public void setQuantCompra(Integer quantCompra) {
        Integer oldQuantCompra = this.quantCompra;
        this.quantCompra = quantCompra;
        changeSupport.firePropertyChange("quantCompra", oldQuantCompra, quantCompra);
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        String oldLote = this.lote;
        this.lote = lote;
        changeSupport.firePropertyChange("lote", oldLote, lote);
    }

    public String getSerieLote() {
        return serieLote;
    }

    public void setSerieLote(String serieLote) {
        String oldSerieLote = this.serieLote;
        this.serieLote = serieLote;
        changeSupport.firePropertyChange("serieLote", oldSerieLote, serieLote);
    }

    public Date getValidadeLote() {
        return validadeLote;
    }

    public void setValidadeLote(Date validadeLote) {
        Date oldValidadeLote = this.validadeLote;
        this.validadeLote = validadeLote;
        changeSupport.firePropertyChange("validadeLote", oldValidadeLote, validadeLote);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        String oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getIdForcedor() {
        return idForcedor;
    }

    public void setIdForcedor(String idForcedor) {
        String oldIdForcedor = this.idForcedor;
        this.idForcedor = idForcedor;
        changeSupport.firePropertyChange("idForcedor", oldIdForcedor, idForcedor);
    }

    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(String idLaboratorio) {
        String oldIdLaboratorio = this.idLaboratorio;
        this.idLaboratorio = idLaboratorio;
        changeSupport.firePropertyChange("idLaboratorio", oldIdLaboratorio, idLaboratorio);
    }

    public String getReagente() {
        return reagente;
    }

    public void setReagente(String reagente) {
        String oldReagente = this.reagente;
        this.reagente = reagente;
        changeSupport.firePropertyChange("reagente", oldReagente, reagente);
    }

    public String getIdReagente() {
        return idReagente;
    }

    public void setIdReagente(String idReagente) {
        String oldIdReagente = this.idReagente;
        this.idReagente = idReagente;
        changeSupport.firePropertyChange("idReagente", oldIdReagente, idReagente);
    }

    public String getFlagNota() {
        return flagNota;
    }

    public void setFlagNota(String flagNota) {
        String oldFlagNota = this.flagNota;
        this.flagNota = flagNota;
        changeSupport.firePropertyChange("flagNota", oldFlagNota, flagNota);
    }

    public String getFlagLote() {
        return flagLote;
    }

    public void setFlagLote(String flagLote) {
        String oldFlagLote = this.flagLote;
        this.flagLote = flagLote;
        changeSupport.firePropertyChange("flagLote", oldFlagLote, flagLote);
    }

    public String getStatusNota() {
        return statusNota;
    }

    public void setStatusNota(String statusNota) {
        String oldStatusNota = this.statusNota;
        this.statusNota = statusNota;
        changeSupport.firePropertyChange("statusNota", oldStatusNota, statusNota);
    }

    public String getStatusLote() {
        return statusLote;
    }

    public void setStatusLote(String statusLote) {
        String oldStatusLote = this.statusLote;
        this.statusLote = statusLote;
        changeSupport.firePropertyChange("statusLote", oldStatusLote, statusLote);
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

    public String getIncompat() {
        return incompat;
    }

    public void setIncompat(String incompat) {
        String oldIncompat = this.incompat;
        this.incompat = incompat;
        changeSupport.firePropertyChange("incompat", oldIncompat, incompat);
    }

    public String getTipoUnd() {
        return tipoUnd;
    }

    public void setTipoUnd(String tipoUnd) {
        String oldTipoUnd = this.tipoUnd;
        this.tipoUnd = tipoUnd;
        changeSupport.firePropertyChange("tipoUnd", oldTipoUnd, tipoUnd);
    }

    public String getQuantUnd() {
        return quantUnd;
    }

    public void setQuantUnd(String quantUnd) {
        String oldQuantUnd = this.quantUnd;
        this.quantUnd = quantUnd;
        changeSupport.firePropertyChange("quantUnd", oldQuantUnd, quantUnd);
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

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        String oldIdLocal = this.idLocal;
        this.idLocal = idLocal;
        changeSupport.firePropertyChange("idLocal", oldIdLocal, idLocal);
    }

    public Double getLperc() {
        return lperc;
    }

    public void setLperc(Double lperc) {
        Double oldLperc = this.lperc;
        this.lperc = lperc;
        changeSupport.firePropertyChange("lperc", oldLperc, lperc);
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        Double oldValorCompra = this.valorCompra;
        this.valorCompra = valorCompra;
        changeSupport.firePropertyChange("valorCompra", oldValorCompra, valorCompra);
    }

    public Double getValorFinalUnd() {
        return valorFinalUnd;
    }

    public void setValorFinalUnd(Double valorFinalUnd) {
        Double oldValorFinalUnd = this.valorFinalUnd;
        this.valorFinalUnd = valorFinalUnd;
        changeSupport.firePropertyChange("valorFinalUnd", oldValorFinalUnd, valorFinalUnd);
    }

    public String getTempCondi() {
        return tempCondi;
    }

    public void setTempCondi(String tempCondi) {
        String oldTempCondi = this.tempCondi;
        this.tempCondi = tempCondi;
        changeSupport.firePropertyChange("tempCondi", oldTempCondi, tempCondi);
    }

    public String getFlagReagenteMat() {
        return flagReagenteMat;
    }

    public void setFlagReagenteMat(String flagReagenteMat) {
        String oldFlagReagenteMat = this.flagReagenteMat;
        this.flagReagenteMat = flagReagenteMat;
        changeSupport.firePropertyChange("flagReagenteMat", oldFlagReagenteMat, flagReagenteMat);
    }

    public List<MovDet> getMovDetList() {
        return movDetList;
    }

    public void setMovDetList(List<MovDet> movDetList) {
        this.movDetList = movDetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadLotes != null ? idCadLotes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadLotes)) {
            return false;
        }
        CadLotes other = (CadLotes) object;
        if ((this.idCadLotes == null && other.idCadLotes != null) || (this.idCadLotes != null && !this.idCadLotes.equals(other.idCadLotes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "<sislab.proteomica.view.lotesNotas.CadLotes[ idCadLotes=" + idCadLotes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
