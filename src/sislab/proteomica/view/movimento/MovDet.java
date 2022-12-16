/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.view.movimento;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import sislab.proteomica.view.lotesNotas.CadLotes;

/**
 *
 * @author NILDO
 */
@Entity
@Table(name = "mov_det", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "MovDet.findAll", query = "SELECT m FROM MovDet m")
    , @NamedQuery(name = "MovDet.findByIdMovDet", query = "SELECT m FROM MovDet m WHERE m.idMovDet = :idMovDet")
    , @NamedQuery(name = "MovDet.findByNomeReagente", query = "SELECT m FROM MovDet m WHERE m.nomeReagente = :nomeReagente")
    , @NamedQuery(name = "MovDet.findByCodPlanilha", query = "SELECT m FROM MovDet m WHERE m.codPlanilha = :codPlanilha")
    , @NamedQuery(name = "MovDet.findByConcentracao", query = "SELECT m FROM MovDet m WHERE m.concentracao = :concentracao")
    , @NamedQuery(name = "MovDet.findByTipoReagente", query = "SELECT m FROM MovDet m WHERE m.tipoReagente = :tipoReagente")
    , @NamedQuery(name = "MovDet.findByFabricante", query = "SELECT m FROM MovDet m WHERE m.fabricante = :fabricante")
    , @NamedQuery(name = "MovDet.findByTipoUnd", query = "SELECT m FROM MovDet m WHERE m.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "MovDet.findByQuantUnd", query = "SELECT m FROM MovDet m WHERE m.quantUnd = :quantUnd")
    , @NamedQuery(name = "MovDet.findByQuantRestante", query = "SELECT m FROM MovDet m WHERE m.quantRestante = :quantRestante")
    , @NamedQuery(name = "MovDet.findByFlagFracionado", query = "SELECT m FROM MovDet m WHERE m.flagFracionado = :flagFracionado")
    , @NamedQuery(name = "MovDet.findByFlagReagente", query = "SELECT m FROM MovDet m WHERE m.flagReagente = :flagReagente")
    , @NamedQuery(name = "MovDet.findByStatusReagente", query = "SELECT m FROM MovDet m WHERE m.statusReagente = :statusReagente")
    , @NamedQuery(name = "MovDet.findByNumeroNota", query = "SELECT m FROM MovDet m WHERE m.numeroNota = :numeroNota")
    , @NamedQuery(name = "MovDet.findBySerieNota", query = "SELECT m FROM MovDet m WHERE m.serieNota = :serieNota")
    , @NamedQuery(name = "MovDet.findByDataCompra", query = "SELECT m FROM MovDet m WHERE m.dataCompra = :dataCompra")
    , @NamedQuery(name = "MovDet.findByDataNota", query = "SELECT m FROM MovDet m WHERE m.dataNota = :dataNota")
    , @NamedQuery(name = "MovDet.findByFornecedor", query = "SELECT m FROM MovDet m WHERE m.fornecedor = :fornecedor")
    , @NamedQuery(name = "MovDet.findByNumeroLote", query = "SELECT m FROM MovDet m WHERE m.numeroLote = :numeroLote")
    , @NamedQuery(name = "MovDet.findBySerieLote", query = "SELECT m FROM MovDet m WHERE m.serieLote = :serieLote")
    , @NamedQuery(name = "MovDet.findByDataValidade", query = "SELECT m FROM MovDet m WHERE m.dataValidade = :dataValidade")
    , @NamedQuery(name = "MovDet.findByUsuarioCadastro", query = "SELECT m FROM MovDet m WHERE m.usuarioCadastro = :usuarioCadastro")
    , @NamedQuery(name = "MovDet.findByLaboratorio", query = "SELECT m FROM MovDet m WHERE m.laboratorio = :laboratorio")
    , @NamedQuery(name = "MovDet.findByIdUsuario", query = "SELECT m FROM MovDet m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MovDet.findByIdLab", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab")
    , @NamedQuery(name = "MovDet.findByFlagLote", query = "SELECT m FROM MovDet m WHERE m.flagLote = :flagLote")
    , @NamedQuery(name = "MovDet.findByStatusLote", query = "SELECT m FROM MovDet m WHERE m.statusLote = :statusLote")
    , @NamedQuery(name = "MovDet.findByDataEntradaEstoque", query = "SELECT m FROM MovDet m WHERE m.dataEntradaEstoque = :dataEntradaEstoque")
    , @NamedQuery(name = "MovDet.findByEstoque1", query = "SELECT m FROM MovDet m WHERE m.estoque1 = :estoque1")
    , @NamedQuery(name = "MovDet.findByEstoque2", query = "SELECT m FROM MovDet m WHERE m.estoque2 = :estoque2")
    , @NamedQuery(name = "MovDet.findByEstoque3", query = "SELECT m FROM MovDet m WHERE m.estoque3 = :estoque3")
    , @NamedQuery(name = "MovDet.findByLocalizacao", query = "SELECT m FROM MovDet m WHERE m.localizacao = :localizacao")
    , @NamedQuery(name = "MovDet.findBySala", query = "SELECT m FROM MovDet m WHERE m.sala = :sala")
    , @NamedQuery(name = "MovDet.findByIdEstoque", query = "SELECT m FROM MovDet m WHERE m.idEstoque = :idEstoque")
    , @NamedQuery(name = "MovDet.findByIdLocalizacao", query = "SELECT m FROM MovDet m WHERE m.idLocalizacao = :idLocalizacao")
    , @NamedQuery(name = "MovDet.findByIdUsuarioEmprestimo", query = "SELECT m FROM MovDet m WHERE m.idUsuarioEmprestimo = :idUsuarioEmprestimo")
    , @NamedQuery(name = "MovDet.findByEmprestadoPor", query = "SELECT m FROM MovDet m WHERE m.emprestadoPor = :emprestadoPor")
    , @NamedQuery(name = "MovDet.findByDataEmprestimo", query = "SELECT m FROM MovDet m WHERE m.dataEmprestimo = :dataEmprestimo")
    , @NamedQuery(name = "MovDet.findByHoraEmprestimo", query = "SELECT m FROM MovDet m WHERE m.horaEmprestimo = :horaEmprestimo")
    , @NamedQuery(name = "MovDet.findByEmprestadoPara", query = "SELECT m FROM MovDet m WHERE m.emprestadoPara = :emprestadoPara")
    , @NamedQuery(name = "MovDet.findByEmpContatoIdMvd", query = "SELECT m FROM MovDet m WHERE m.empContatoIdMvd = :empContatoIdMvd")
    , @NamedQuery(name = "MovDet.findByEmpLabMvd", query = "SELECT m FROM MovDet m WHERE m.empLabMvd = :empLabMvd")
    , @NamedQuery(name = "MovDet.findByEmpLabIdMvd", query = "SELECT m FROM MovDet m WHERE m.empLabIdMvd = :empLabIdMvd")
    , @NamedQuery(name = "MovDet.findByEmpResponsavelMvd", query = "SELECT m FROM MovDet m WHERE m.empResponsavelMvd = :empResponsavelMvd")
    , @NamedQuery(name = "MovDet.findByEmpDepMvd", query = "SELECT m FROM MovDet m WHERE m.empDepMvd = :empDepMvd")
    , @NamedQuery(name = "MovDet.findByEmpLocalizacaoMvd", query = "SELECT m FROM MovDet m WHERE m.empLocalizacaoMvd = :empLocalizacaoMvd")
    , @NamedQuery(name = "MovDet.findByEmpSalaMvd", query = "SELECT m FROM MovDet m WHERE m.empSalaMvd = :empSalaMvd")
    , @NamedQuery(name = "MovDet.findByEmpLabTelMvd", query = "SELECT m FROM MovDet m WHERE m.empLabTelMvd = :empLabTelMvd")
    , @NamedQuery(name = "MovDet.findByEmpContatoTelMvd", query = "SELECT m FROM MovDet m WHERE m.empContatoTelMvd = :empContatoTelMvd")
    , @NamedQuery(name = "MovDet.findByEmpVinculacaoMvd", query = "SELECT m FROM MovDet m WHERE m.empVinculacaoMvd = :empVinculacaoMvd")
    , @NamedQuery(name = "MovDet.findByFlagEmprestimo", query = "SELECT m FROM MovDet m WHERE m.flagEmprestimo = :flagEmprestimo")
    , @NamedQuery(name = "MovDet.findByDevolAgendada", query = "SELECT m FROM MovDet m WHERE m.devolAgendada = :devolAgendada")
    , @NamedQuery(name = "MovDet.findByDataDevol", query = "SELECT m FROM MovDet m WHERE m.dataDevol = :dataDevol")
    , @NamedQuery(name = "MovDet.findByHoraDevol", query = "SELECT m FROM MovDet m WHERE m.horaDevol = :horaDevol")
    , @NamedQuery(name = "MovDet.findByAutorizadoPor", query = "SELECT m FROM MovDet m WHERE m.autorizadoPor = :autorizadoPor")
    , @NamedQuery(name = "MovDet.findByUsuarioEmprestimo", query = "SELECT m FROM MovDet m WHERE m.usuarioEmprestimo = :usuarioEmprestimo")
    , @NamedQuery(name = "MovDet.findByIdUsuarioDevolucao", query = "SELECT m FROM MovDet m WHERE m.idUsuarioDevolucao = :idUsuarioDevolucao")
    , @NamedQuery(name = "MovDet.findByUsuarioDevolucao", query = "SELECT m FROM MovDet m WHERE m.usuarioDevolucao = :usuarioDevolucao")
    , @NamedQuery(name = "MovDet.findByStatusReagenteUnd", query = "SELECT m FROM MovDet m WHERE m.statusReagenteUnd = :statusReagenteUnd")
    , @NamedQuery(name = "MovDet.findByFlagReagenteUnd", query = "SELECT m FROM MovDet m WHERE m.flagReagenteUnd = :flagReagenteUnd")
    , @NamedQuery(name = "MovDet.findByCodQrestoque", query = "SELECT m FROM MovDet m WHERE m.codQrestoque = :codQrestoque")
    , @NamedQuery(name = "MovDet.findByCodQreagente", query = "SELECT m FROM MovDet m WHERE m.codQreagente = :codQreagente")
    , @NamedQuery(name = "MovDet.findByCodBar", query = "SELECT m FROM MovDet m WHERE m.codBar = :codBar")
    , @NamedQuery(name = "MovDet.findByUsuarioDescarte", query = "SELECT m FROM MovDet m WHERE m.usuarioDescarte = :usuarioDescarte")
    , @NamedQuery(name = "MovDet.findByIdUsuarioDescarte", query = "SELECT m FROM MovDet m WHERE m.idUsuarioDescarte = :idUsuarioDescarte")
    , @NamedQuery(name = "MovDet.findByDataDescarte", query = "SELECT m FROM MovDet m WHERE m.dataDescarte = :dataDescarte")
    , @NamedQuery(name = "MovDet.findByHoraDescarte", query = "SELECT m FROM MovDet m WHERE m.horaDescarte = :horaDescarte")
    , @NamedQuery(name = "MovDet.findByFlagDescarte", query = "SELECT m FROM MovDet m WHERE m.flagDescarte = :flagDescarte")
    , @NamedQuery(name = "MovDet.findByUsuarioAbertura", query = "SELECT m FROM MovDet m WHERE m.usuarioAbertura = :usuarioAbertura")
    , @NamedQuery(name = "MovDet.findByIdUsAbertura", query = "SELECT m FROM MovDet m WHERE m.idUsAbertura = :idUsAbertura")
    , @NamedQuery(name = "MovDet.findByDataAbertura", query = "SELECT m FROM MovDet m WHERE m.dataAbertura = :dataAbertura")
    , @NamedQuery(name = "MovDet.findByHoraAbertura", query = "SELECT m FROM MovDet m WHERE m.horaAbertura = :horaAbertura")
    , @NamedQuery(name = "MovDet.findByFlagAbertura", query = "SELECT m FROM MovDet m WHERE m.flagAbertura = :flagAbertura")
    , @NamedQuery(name = "MovDet.findByStatusAbertura", query = "SELECT m FROM MovDet m WHERE m.statusAbertura = :statusAbertura")
    , @NamedQuery(name = "MovDet.findByIdReagente", query = "SELECT m FROM MovDet m WHERE m.idReagente = :idReagente")
    , @NamedQuery(name = "MovDet.findByIdFornecedor", query = "SELECT m FROM MovDet m WHERE m.idFornecedor = :idFornecedor")
    , @NamedQuery(name = "MovDet.findByFlagToxico", query = "SELECT m FROM MovDet m WHERE m.flagToxico = :flagToxico")
    , @NamedQuery(name = "MovDet.findByCaraterReagente", query = "SELECT m FROM MovDet m WHERE m.caraterReagente = :caraterReagente")
    , @NamedQuery(name = "MovDet.findByLperc", query = "SELECT m FROM MovDet m WHERE m.lperc = :lperc")
    , @NamedQuery(name = "MovDet.findByValorCompra", query = "SELECT m FROM MovDet m WHERE m.valorCompra = :valorCompra")
    , @NamedQuery(name = "MovDet.findByValorFinalUnd", query = "SELECT m FROM MovDet m WHERE m.valorFinalUnd = :valorFinalUnd")
    , @NamedQuery(name = "MovDet.findBySiglaLab", query = "SELECT m FROM MovDet m WHERE m.siglaLab = :siglaLab")
    , @NamedQuery(name = "MovDet.findByTempCond", query = "SELECT m FROM MovDet m WHERE m.tempCond = :tempCond")
    , @NamedQuery(name = "MovDet.findByFlagMatReagenteDet", query = "SELECT m FROM MovDet m WHERE m.flagMatReagenteDet = :flagMatReagenteDet")
    , @NamedQuery(name = "MovDet.findByFlagVal", query = "SELECT m FROM MovDet m WHERE m.flagVal = :flagVal")
        
    ,@NamedQuery(name = "MovDet.BuscaValidadeTodoLab", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND  m.dataValidade  BETWEEN :dataIni AND :dataFim")
    ,@NamedQuery(name = "MovDet.BuscaValidadeCodBarLocal", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.codBar = :codBar AND m.dataValidade BETWEEN :dataIni AND :dataFim")
    ,@NamedQuery(name = "MovDet.BuscaValidadeDadosNomeData", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.nomeReagente = :nomeReagente AND m.statusReagente = :statusReagente AND m.dataValidade BETWEEN :dataIni AND :dataFim")
    ,@NamedQuery(name = "MovDet.RecarregaBuscaEmprestimoLocal", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.statusReagente = :statusReagente")
    ,@NamedQuery(name = "MovDet.BuscaEmprestimoLocal", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.idLocalizacao = :idLocalizacao AND m.statusReagente = :statusReagente AND m.codBar = :codBar")
    ,@NamedQuery(name = "MovDet.BuscaEmprestimoNome", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.idLocalizacao = :idLocalizacao AND m.statusReagente = :statusReagente AND  m.nomeReagente = :nomeReagente")
    ,@NamedQuery(name = "MovDet.BuscaDataDevolucao", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.statusReagente = :statusReagente AND m.devolAgendada  BETWEEN :dataIni AND :dataFim")    
    ,@NamedQuery(name = "MovDet.BuscaDeolucaoLocal", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.idLocalizacao = :idLocalizacao AND m.statusReagente = :statusReagente")
    ,@NamedQuery(name = "MovDet.BuscarEtiqueta", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab  AND m.codBar = :codBar")
    ,@NamedQuery(name = "MovDet.BuscarLote", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab  AND m.numeroLote = :numeroLote")
    ,@NamedQuery(name = "MovDet.BuscarNota", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab  AND m.numeroNota = :numeroNota") 
    ,@NamedQuery(name = "MovDet.BuscarFabricante", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab  AND m.fabricante = :fabricante")       
    ,@NamedQuery(name = "MovDet.BuscarFornecedor", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab  AND  m.fornecedor = :fornecedor")         
    ,@NamedQuery(name = "MovDet.BuscarLabEmprestado", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab  AND  m.statusReagente = :statusReagente AND m.empLabIdMvd = :empLabIdMvd ")  

        
    ,@NamedQuery(name = "MovDet.findByPesquisaEstaticaStatusLoteStatusReagente", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab AND m.statusLote = :statusLote AND m.statusReagente = :statusReagente")   
    ,@NamedQuery(name = "MovDet.findByPesquisaEstaticaStatusReagente", query = "SELECT m FROM MovDet m WHERE m.idLab = :idLab AND m.statusReagente = :statusReagente")
    ,@NamedQuery(name = "MovDet.VerificaValidadeInicializacao", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.statusReagente = :statusReagente AND m.dataValidade BETWEEN :dataIni AND :dataFim")
    ,@NamedQuery(name = "MovDet.VerificaDevolucaoReagenteEmprestadodeInicializacao", query = "SELECT m FROM MovDet m WHERE  m.idLab = :idLab AND m.statusReagente = :statusReagente")// AND m.devolAgendada BETWEEN :dataIni AND :dataFim")
})
public class MovDet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MOV_DET")
    private Integer idMovDet;
    @Column(name = "NOME_REAGENTE")
    private String nomeReagente;
    @Column(name = "COD_PLANILHA")
    private String codPlanilha;
    @Column(name = "CONCENTRACAO")
    private String concentracao;
    @Column(name = "TIPO_REAGENTE")
    private String tipoReagente;
    @Column(name = "FABRICANTE")
    private String fabricante;
    @Lob
    @Column(name = "INCOMPAT")
    private String incompat;
    @Column(name = "TIPO_UND")
    private String tipoUnd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANT_UND")
    private Double quantUnd;
    @Column(name = "QUANT_RESTANTE")
    private Double quantRestante;
    @Column(name = "FLAG_FRACIONADO")
    private String flagFracionado;
    @Column(name = "FLAG_REAGENTE")
    private String flagReagente;
    @Column(name = "STATUS_REAGENTE")
    private String statusReagente;
    @Column(name = "NUMERO_NOTA")
    private String numeroNota;
    @Column(name = "SERIE_NOTA")
    private String serieNota;
    @Column(name = "DATA_COMPRA")
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @Column(name = "DATA_NOTA")
    @Temporal(TemporalType.DATE)
    private Date dataNota;
    @Column(name = "FORNECEDOR")
    private String fornecedor;
    @Column(name = "NUMERO_LOTE")
    private String numeroLote;
    @Column(name = "SERIE_LOTE")
    private String serieLote;
    @Column(name = "DATA_VALIDADE")
    @Temporal(TemporalType.DATE)
    private Date dataValidade;
    @Column(name = "USUARIO_CADASTRO")
    private String usuarioCadastro;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Column(name = "ID_LAB")
    private String idLab;
    @Column(name = "FLAG_LOTE")
    private String flagLote;
    @Column(name = "STATUS_LOTE")
    private String statusLote;
    @Column(name = "DATA_ENTRADA_ESTOQUE")
    @Temporal(TemporalType.DATE)
    private Date dataEntradaEstoque;
    @Column(name = "ESTOQUE1")
    private String estoque1;
    @Column(name = "ESTOQUE2")
    private String estoque2;
    @Column(name = "ESTOQUE3")
    private String estoque3;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "SALA")
    private String sala;
    @Column(name = "ID_ESTOQUE")
    private String idEstoque;
    @Column(name = "ID_LOCALIZACAO")
    private String idLocalizacao;
    @Column(name = "ID_USUARIO_EMPRESTIMO")
    private String idUsuarioEmprestimo;
    @Column(name = "EMPRESTADO_POR")
    private String emprestadoPor;
    @Column(name = "DATA_EMPRESTIMO")
    @Temporal(TemporalType.DATE)
    private Date dataEmprestimo;
    @Column(name = "HORA_EMPRESTIMO")
    private String horaEmprestimo;
    @Column(name = "EMPRESTADO_PARA")
    private String emprestadoPara;
    @Column(name = "EMP_CONTATO_ID_MVD")
    private String empContatoIdMvd;
    @Column(name = "EMP_LAB_MVD")
    private String empLabMvd;
    @Column(name = "EMP_LAB_ID_MVD")
    private String empLabIdMvd;
    @Column(name = "EMP_RESPONSAVEL_MVD")
    private String empResponsavelMvd;
    @Column(name = "EMP_DEP_MVD")
    private String empDepMvd;
    @Column(name = "EMP_LOCALIZACAO_MVD")
    private String empLocalizacaoMvd;
    @Column(name = "EMP_SALA_MVD")
    private String empSalaMvd;
    @Column(name = "EMP_LAB_TEL_MVD")
    private String empLabTelMvd;
    @Column(name = "EMP_CONTATO_TEL_MVD")
    private String empContatoTelMvd;
    @Lob
    @Column(name = "EMP_OBS_MVD")
    private String empObsMvd;
    @Column(name = "EMP_VINCULACAO_MVD")
    private String empVinculacaoMvd;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @Column(name = "FLAG_EMPRESTIMO")
    private String flagEmprestimo;
    @Column(name = "DEVOL_AGENDADA")
    @Temporal(TemporalType.DATE)
    private Date devolAgendada;
    @Column(name = "DATA_DEVOL")
    @Temporal(TemporalType.DATE)
    private Date dataDevol;
    @Column(name = "HORA_DEVOL")
    private String horaDevol;
    @Column(name = "AUTORIZADO_POR")
    private String autorizadoPor;
    @Column(name = "USUARIO_EMPRESTIMO")
    private String usuarioEmprestimo;
    @Column(name = "ID_USUARIO_DEVOLUCAO")
    private String idUsuarioDevolucao;
    @Column(name = "USUARIO_DEVOLUCAO")
    private String usuarioDevolucao;
    @Column(name = "STATUS_REAGENTE_UND")
    private String statusReagenteUnd;
    @Column(name = "FLAG_REAGENTE_UND")
    private Integer flagReagenteUnd;
    @Column(name = "COD_QRESTOQUE")
    private String codQrestoque;
    @Column(name = "COD_QREAGENTE")
    private String codQreagente;
    @Column(name = "COD_BAR")
    private String codBar;
    @Column(name = "USUARIO_DESCARTE")
    private String usuarioDescarte;
    @Column(name = "ID_USUARIO_DESCARTE")
    private String idUsuarioDescarte;
    @Column(name = "DATA_DESCARTE")
    @Temporal(TemporalType.DATE)
    private Date dataDescarte;
    @Column(name = "HORA_DESCARTE")
    private String horaDescarte;
    @Column(name = "FLAG_DESCARTE")
    private String flagDescarte;
    @Column(name = "USUARIO_ABERTURA")
    private String usuarioAbertura;
    @Column(name = "ID_US_ABERTURA")
    private String idUsAbertura;
    @Column(name = "DATA_ABERTURA")
    @Temporal(TemporalType.DATE)
    private Date dataAbertura;
    @Column(name = "HORA_ABERTURA")
    private String horaAbertura;
    @Column(name = "FLAG_ABERTURA")
    private String flagAbertura;
    @Column(name = "STATUS_ABERTURA")
    private String statusAbertura;
    @Column(name = "ID_REAGENTE")
    private String idReagente;
    @Column(name = "ID_FORNECEDOR")
    private String idFornecedor;
    @Column(name = "FLAG_TOXICO")
    private String flagToxico;
    @Column(name = "CARATER_REAGENTE")
    private String caraterReagente;
    @Column(name = "LPERC")
    private Double lperc;
    @Column(name = "VALOR_COMPRA")
    private Double valorCompra;
    @Column(name = "VALOR_FINAL_UND")
    private Double valorFinalUnd;
    @Column(name = "SIGLA_LAB")
    private String siglaLab;
    @Column(name = "TEMP_COND")
    private String tempCond;
    @Column(name = "FLAG_MAT_REAGENTE_DET")
    private String flagMatReagenteDet;
    @Column(name = "FLAG_VAL")
    private String flagVal;
    @JoinColumn(name = "ID_CAD_LOTES", referencedColumnName = "ID_CAD_LOTES")
    @ManyToOne
    private CadLotes idCadLotes;

    public MovDet() {
    }

    public MovDet(Integer idMovDet) {
        this.idMovDet = idMovDet;
    }

    public Integer getIdMovDet() {
        return idMovDet;
    }

    public void setIdMovDet(Integer idMovDet) {
        Integer oldIdMovDet = this.idMovDet;
        this.idMovDet = idMovDet;
        changeSupport.firePropertyChange("idMovDet", oldIdMovDet, idMovDet);
    }

    public String getNomeReagente() {
        return nomeReagente;
    }

    public void setNomeReagente(String nomeReagente) {
        String oldNomeReagente = this.nomeReagente;
        this.nomeReagente = nomeReagente;
        changeSupport.firePropertyChange("nomeReagente", oldNomeReagente, nomeReagente);
    }

    public String getCodPlanilha() {
        return codPlanilha;
    }

    public void setCodPlanilha(String codPlanilha) {
        String oldCodPlanilha = this.codPlanilha;
        this.codPlanilha = codPlanilha;
        changeSupport.firePropertyChange("codPlanilha", oldCodPlanilha, codPlanilha);
    }

    public String getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(String concentracao) {
        String oldConcentracao = this.concentracao;
        this.concentracao = concentracao;
        changeSupport.firePropertyChange("concentracao", oldConcentracao, concentracao);
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

    public Double getQuantUnd() {
        return quantUnd;
    }

    public void setQuantUnd(Double quantUnd) {
        Double oldQuantUnd = this.quantUnd;
        this.quantUnd = quantUnd;
        changeSupport.firePropertyChange("quantUnd", oldQuantUnd, quantUnd);
    }

    public Double getQuantRestante() {
        return quantRestante;
    }

    public void setQuantRestante(Double quantRestante) {
        Double oldQuantRestante = this.quantRestante;
        this.quantRestante = quantRestante;
        changeSupport.firePropertyChange("quantRestante", oldQuantRestante, quantRestante);
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

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        String oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        String oldNumeroLote = this.numeroLote;
        this.numeroLote = numeroLote;
        changeSupport.firePropertyChange("numeroLote", oldNumeroLote, numeroLote);
    }

    public String getSerieLote() {
        return serieLote;
    }

    public void setSerieLote(String serieLote) {
        String oldSerieLote = this.serieLote;
        this.serieLote = serieLote;
        changeSupport.firePropertyChange("serieLote", oldSerieLote, serieLote);
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        Date oldDataValidade = this.dataValidade;
        this.dataValidade = dataValidade;
        changeSupport.firePropertyChange("dataValidade", oldDataValidade, dataValidade);
    }

    public String getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(String usuarioCadastro) {
        String oldUsuarioCadastro = this.usuarioCadastro;
        this.usuarioCadastro = usuarioCadastro;
        changeSupport.firePropertyChange("usuarioCadastro", oldUsuarioCadastro, usuarioCadastro);
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        String oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        changeSupport.firePropertyChange("laboratorio", oldLaboratorio, laboratorio);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        String oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        String oldIdLab = this.idLab;
        this.idLab = idLab;
        changeSupport.firePropertyChange("idLab", oldIdLab, idLab);
    }

    public String getFlagLote() {
        return flagLote;
    }

    public void setFlagLote(String flagLote) {
        String oldFlagLote = this.flagLote;
        this.flagLote = flagLote;
        changeSupport.firePropertyChange("flagLote", oldFlagLote, flagLote);
    }

    public String getStatusLote() {
        return statusLote;
    }

    public void setStatusLote(String statusLote) {
        String oldStatusLote = this.statusLote;
        this.statusLote = statusLote;
        changeSupport.firePropertyChange("statusLote", oldStatusLote, statusLote);
    }

    public Date getDataEntradaEstoque() {
        return dataEntradaEstoque;
    }

    public void setDataEntradaEstoque(Date dataEntradaEstoque) {
        Date oldDataEntradaEstoque = this.dataEntradaEstoque;
        this.dataEntradaEstoque = dataEntradaEstoque;
        changeSupport.firePropertyChange("dataEntradaEstoque", oldDataEntradaEstoque, dataEntradaEstoque);
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        String oldSala = this.sala;
        this.sala = sala;
        changeSupport.firePropertyChange("sala", oldSala, sala);
    }

    public String getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(String idEstoque) {
        String oldIdEstoque = this.idEstoque;
        this.idEstoque = idEstoque;
        changeSupport.firePropertyChange("idEstoque", oldIdEstoque, idEstoque);
    }

    public String getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(String idLocalizacao) {
        String oldIdLocalizacao = this.idLocalizacao;
        this.idLocalizacao = idLocalizacao;
        changeSupport.firePropertyChange("idLocalizacao", oldIdLocalizacao, idLocalizacao);
    }

    public String getIdUsuarioEmprestimo() {
        return idUsuarioEmprestimo;
    }

    public void setIdUsuarioEmprestimo(String idUsuarioEmprestimo) {
        String oldIdUsuarioEmprestimo = this.idUsuarioEmprestimo;
        this.idUsuarioEmprestimo = idUsuarioEmprestimo;
        changeSupport.firePropertyChange("idUsuarioEmprestimo", oldIdUsuarioEmprestimo, idUsuarioEmprestimo);
    }

    public String getEmprestadoPor() {
        return emprestadoPor;
    }

    public void setEmprestadoPor(String emprestadoPor) {
        String oldEmprestadoPor = this.emprestadoPor;
        this.emprestadoPor = emprestadoPor;
        changeSupport.firePropertyChange("emprestadoPor", oldEmprestadoPor, emprestadoPor);
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        Date oldDataEmprestimo = this.dataEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        changeSupport.firePropertyChange("dataEmprestimo", oldDataEmprestimo, dataEmprestimo);
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        String oldHoraEmprestimo = this.horaEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        changeSupport.firePropertyChange("horaEmprestimo", oldHoraEmprestimo, horaEmprestimo);
    }

    public String getEmprestadoPara() {
        return emprestadoPara;
    }

    public void setEmprestadoPara(String emprestadoPara) {
        String oldEmprestadoPara = this.emprestadoPara;
        this.emprestadoPara = emprestadoPara;
        changeSupport.firePropertyChange("emprestadoPara", oldEmprestadoPara, emprestadoPara);
    }

    public String getEmpContatoIdMvd() {
        return empContatoIdMvd;
    }

    public void setEmpContatoIdMvd(String empContatoIdMvd) {
        String oldEmpContatoIdMvd = this.empContatoIdMvd;
        this.empContatoIdMvd = empContatoIdMvd;
        changeSupport.firePropertyChange("empContatoIdMvd", oldEmpContatoIdMvd, empContatoIdMvd);
    }

    public String getEmpLabMvd() {
        return empLabMvd;
    }

    public void setEmpLabMvd(String empLabMvd) {
        String oldEmpLabMvd = this.empLabMvd;
        this.empLabMvd = empLabMvd;
        changeSupport.firePropertyChange("empLabMvd", oldEmpLabMvd, empLabMvd);
    }

    public String getEmpLabIdMvd() {
        return empLabIdMvd;
    }

    public void setEmpLabIdMvd(String empLabIdMvd) {
        String oldEmpLabIdMvd = this.empLabIdMvd;
        this.empLabIdMvd = empLabIdMvd;
        changeSupport.firePropertyChange("empLabIdMvd", oldEmpLabIdMvd, empLabIdMvd);
    }

    public String getEmpResponsavelMvd() {
        return empResponsavelMvd;
    }

    public void setEmpResponsavelMvd(String empResponsavelMvd) {
        String oldEmpResponsavelMvd = this.empResponsavelMvd;
        this.empResponsavelMvd = empResponsavelMvd;
        changeSupport.firePropertyChange("empResponsavelMvd", oldEmpResponsavelMvd, empResponsavelMvd);
    }

    public String getEmpDepMvd() {
        return empDepMvd;
    }

    public void setEmpDepMvd(String empDepMvd) {
        String oldEmpDepMvd = this.empDepMvd;
        this.empDepMvd = empDepMvd;
        changeSupport.firePropertyChange("empDepMvd", oldEmpDepMvd, empDepMvd);
    }

    public String getEmpLocalizacaoMvd() {
        return empLocalizacaoMvd;
    }

    public void setEmpLocalizacaoMvd(String empLocalizacaoMvd) {
        String oldEmpLocalizacaoMvd = this.empLocalizacaoMvd;
        this.empLocalizacaoMvd = empLocalizacaoMvd;
        changeSupport.firePropertyChange("empLocalizacaoMvd", oldEmpLocalizacaoMvd, empLocalizacaoMvd);
    }

    public String getEmpSalaMvd() {
        return empSalaMvd;
    }

    public void setEmpSalaMvd(String empSalaMvd) {
        String oldEmpSalaMvd = this.empSalaMvd;
        this.empSalaMvd = empSalaMvd;
        changeSupport.firePropertyChange("empSalaMvd", oldEmpSalaMvd, empSalaMvd);
    }

    public String getEmpLabTelMvd() {
        return empLabTelMvd;
    }

    public void setEmpLabTelMvd(String empLabTelMvd) {
        String oldEmpLabTelMvd = this.empLabTelMvd;
        this.empLabTelMvd = empLabTelMvd;
        changeSupport.firePropertyChange("empLabTelMvd", oldEmpLabTelMvd, empLabTelMvd);
    }

    public String getEmpContatoTelMvd() {
        return empContatoTelMvd;
    }

    public void setEmpContatoTelMvd(String empContatoTelMvd) {
        String oldEmpContatoTelMvd = this.empContatoTelMvd;
        this.empContatoTelMvd = empContatoTelMvd;
        changeSupport.firePropertyChange("empContatoTelMvd", oldEmpContatoTelMvd, empContatoTelMvd);
    }

    public String getEmpObsMvd() {
        return empObsMvd;
    }

    public void setEmpObsMvd(String empObsMvd) {
        String oldEmpObsMvd = this.empObsMvd;
        this.empObsMvd = empObsMvd;
        changeSupport.firePropertyChange("empObsMvd", oldEmpObsMvd, empObsMvd);
    }

    public String getEmpVinculacaoMvd() {
        return empVinculacaoMvd;
    }

    public void setEmpVinculacaoMvd(String empVinculacaoMvd) {
        String oldEmpVinculacaoMvd = this.empVinculacaoMvd;
        this.empVinculacaoMvd = empVinculacaoMvd;
        changeSupport.firePropertyChange("empVinculacaoMvd", oldEmpVinculacaoMvd, empVinculacaoMvd);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    public String getFlagEmprestimo() {
        return flagEmprestimo;
    }

    public void setFlagEmprestimo(String flagEmprestimo) {
        String oldFlagEmprestimo = this.flagEmprestimo;
        this.flagEmprestimo = flagEmprestimo;
        changeSupport.firePropertyChange("flagEmprestimo", oldFlagEmprestimo, flagEmprestimo);
    }

    public Date getDevolAgendada() {
        return devolAgendada;
    }

    public void setDevolAgendada(Date devolAgendada) {
        Date oldDevolAgendada = this.devolAgendada;
        this.devolAgendada = devolAgendada;
        changeSupport.firePropertyChange("devolAgendada", oldDevolAgendada, devolAgendada);
    }

    public Date getDataDevol() {
        return dataDevol;
    }

    public void setDataDevol(Date dataDevol) {
        Date oldDataDevol = this.dataDevol;
        this.dataDevol = dataDevol;
        changeSupport.firePropertyChange("dataDevol", oldDataDevol, dataDevol);
    }

    public String getHoraDevol() {
        return horaDevol;
    }

    public void setHoraDevol(String horaDevol) {
        String oldHoraDevol = this.horaDevol;
        this.horaDevol = horaDevol;
        changeSupport.firePropertyChange("horaDevol", oldHoraDevol, horaDevol);
    }

    public String getAutorizadoPor() {
        return autorizadoPor;
    }

    public void setAutorizadoPor(String autorizadoPor) {
        String oldAutorizadoPor = this.autorizadoPor;
        this.autorizadoPor = autorizadoPor;
        changeSupport.firePropertyChange("autorizadoPor", oldAutorizadoPor, autorizadoPor);
    }

    public String getUsuarioEmprestimo() {
        return usuarioEmprestimo;
    }

    public void setUsuarioEmprestimo(String usuarioEmprestimo) {
        String oldUsuarioEmprestimo = this.usuarioEmprestimo;
        this.usuarioEmprestimo = usuarioEmprestimo;
        changeSupport.firePropertyChange("usuarioEmprestimo", oldUsuarioEmprestimo, usuarioEmprestimo);
    }

    public String getIdUsuarioDevolucao() {
        return idUsuarioDevolucao;
    }

    public void setIdUsuarioDevolucao(String idUsuarioDevolucao) {
        String oldIdUsuarioDevolucao = this.idUsuarioDevolucao;
        this.idUsuarioDevolucao = idUsuarioDevolucao;
        changeSupport.firePropertyChange("idUsuarioDevolucao", oldIdUsuarioDevolucao, idUsuarioDevolucao);
    }

    public String getUsuarioDevolucao() {
        return usuarioDevolucao;
    }

    public void setUsuarioDevolucao(String usuarioDevolucao) {
        String oldUsuarioDevolucao = this.usuarioDevolucao;
        this.usuarioDevolucao = usuarioDevolucao;
        changeSupport.firePropertyChange("usuarioDevolucao", oldUsuarioDevolucao, usuarioDevolucao);
    }

    public String getStatusReagenteUnd() {
        return statusReagenteUnd;
    }

    public void setStatusReagenteUnd(String statusReagenteUnd) {
        String oldStatusReagenteUnd = this.statusReagenteUnd;
        this.statusReagenteUnd = statusReagenteUnd;
        changeSupport.firePropertyChange("statusReagenteUnd", oldStatusReagenteUnd, statusReagenteUnd);
    }

    public Integer getFlagReagenteUnd() {
        return flagReagenteUnd;
    }

    public void setFlagReagenteUnd(Integer flagReagenteUnd) {
        Integer oldFlagReagenteUnd = this.flagReagenteUnd;
        this.flagReagenteUnd = flagReagenteUnd;
        changeSupport.firePropertyChange("flagReagenteUnd", oldFlagReagenteUnd, flagReagenteUnd);
    }

    public String getCodQrestoque() {
        return codQrestoque;
    }

    public void setCodQrestoque(String codQrestoque) {
        String oldCodQrestoque = this.codQrestoque;
        this.codQrestoque = codQrestoque;
        changeSupport.firePropertyChange("codQrestoque", oldCodQrestoque, codQrestoque);
    }

    public String getCodQreagente() {
        return codQreagente;
    }

    public void setCodQreagente(String codQreagente) {
        String oldCodQreagente = this.codQreagente;
        this.codQreagente = codQreagente;
        changeSupport.firePropertyChange("codQreagente", oldCodQreagente, codQreagente);
    }

    public String getCodBar() {
        return codBar;
    }

    public void setCodBar(String codBar) {
        String oldCodBar = this.codBar;
        this.codBar = codBar;
        changeSupport.firePropertyChange("codBar", oldCodBar, codBar);
    }

    public String getUsuarioDescarte() {
        return usuarioDescarte;
    }

    public void setUsuarioDescarte(String usuarioDescarte) {
        String oldUsuarioDescarte = this.usuarioDescarte;
        this.usuarioDescarte = usuarioDescarte;
        changeSupport.firePropertyChange("usuarioDescarte", oldUsuarioDescarte, usuarioDescarte);
    }

    public String getIdUsuarioDescarte() {
        return idUsuarioDescarte;
    }

    public void setIdUsuarioDescarte(String idUsuarioDescarte) {
        String oldIdUsuarioDescarte = this.idUsuarioDescarte;
        this.idUsuarioDescarte = idUsuarioDescarte;
        changeSupport.firePropertyChange("idUsuarioDescarte", oldIdUsuarioDescarte, idUsuarioDescarte);
    }

    public Date getDataDescarte() {
        return dataDescarte;
    }

    public void setDataDescarte(Date dataDescarte) {
        Date oldDataDescarte = this.dataDescarte;
        this.dataDescarte = dataDescarte;
        changeSupport.firePropertyChange("dataDescarte", oldDataDescarte, dataDescarte);
    }

    public String getHoraDescarte() {
        return horaDescarte;
    }

    public void setHoraDescarte(String horaDescarte) {
        String oldHoraDescarte = this.horaDescarte;
        this.horaDescarte = horaDescarte;
        changeSupport.firePropertyChange("horaDescarte", oldHoraDescarte, horaDescarte);
    }

    public String getFlagDescarte() {
        return flagDescarte;
    }

    public void setFlagDescarte(String flagDescarte) {
        String oldFlagDescarte = this.flagDescarte;
        this.flagDescarte = flagDescarte;
        changeSupport.firePropertyChange("flagDescarte", oldFlagDescarte, flagDescarte);
    }

    public String getUsuarioAbertura() {
        return usuarioAbertura;
    }

    public void setUsuarioAbertura(String usuarioAbertura) {
        String oldUsuarioAbertura = this.usuarioAbertura;
        this.usuarioAbertura = usuarioAbertura;
        changeSupport.firePropertyChange("usuarioAbertura", oldUsuarioAbertura, usuarioAbertura);
    }

    public String getIdUsAbertura() {
        return idUsAbertura;
    }

    public void setIdUsAbertura(String idUsAbertura) {
        String oldIdUsAbertura = this.idUsAbertura;
        this.idUsAbertura = idUsAbertura;
        changeSupport.firePropertyChange("idUsAbertura", oldIdUsAbertura, idUsAbertura);
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        Date oldDataAbertura = this.dataAbertura;
        this.dataAbertura = dataAbertura;
        changeSupport.firePropertyChange("dataAbertura", oldDataAbertura, dataAbertura);
    }

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        String oldHoraAbertura = this.horaAbertura;
        this.horaAbertura = horaAbertura;
        changeSupport.firePropertyChange("horaAbertura", oldHoraAbertura, horaAbertura);
    }

    public String getFlagAbertura() {
        return flagAbertura;
    }

    public void setFlagAbertura(String flagAbertura) {
        String oldFlagAbertura = this.flagAbertura;
        this.flagAbertura = flagAbertura;
        changeSupport.firePropertyChange("flagAbertura", oldFlagAbertura, flagAbertura);
    }

    public String getStatusAbertura() {
        return statusAbertura;
    }

    public void setStatusAbertura(String statusAbertura) {
        String oldStatusAbertura = this.statusAbertura;
        this.statusAbertura = statusAbertura;
        changeSupport.firePropertyChange("statusAbertura", oldStatusAbertura, statusAbertura);
    }

    public String getIdReagente() {
        return idReagente;
    }

    public void setIdReagente(String idReagente) {
        String oldIdReagente = this.idReagente;
        this.idReagente = idReagente;
        changeSupport.firePropertyChange("idReagente", oldIdReagente, idReagente);
    }

    public String getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(String idFornecedor) {
        String oldIdFornecedor = this.idFornecedor;
        this.idFornecedor = idFornecedor;
        changeSupport.firePropertyChange("idFornecedor", oldIdFornecedor, idFornecedor);
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

    public String getSiglaLab() {
        return siglaLab;
    }

    public void setSiglaLab(String siglaLab) {
        String oldSiglaLab = this.siglaLab;
        this.siglaLab = siglaLab;
        changeSupport.firePropertyChange("siglaLab", oldSiglaLab, siglaLab);
    }

    public String getTempCond() {
        return tempCond;
    }

    public void setTempCond(String tempCond) {
        String oldTempCond = this.tempCond;
        this.tempCond = tempCond;
        changeSupport.firePropertyChange("tempCond", oldTempCond, tempCond);
    }

    public String getFlagMatReagenteDet() {
        return flagMatReagenteDet;
    }

    public void setFlagMatReagenteDet(String flagMatReagenteDet) {
        String oldFlagMatReagenteDet = this.flagMatReagenteDet;
        this.flagMatReagenteDet = flagMatReagenteDet;
        changeSupport.firePropertyChange("flagMatReagenteDet", oldFlagMatReagenteDet, flagMatReagenteDet);
    }

    public String getFlagVal() {
        return flagVal;
    }

    public void setFlagVal(String flagVal) {
        String oldFlagVal = this.flagVal;
        this.flagVal = flagVal;
        changeSupport.firePropertyChange("flagVal", oldFlagVal, flagVal);
    }

    public CadLotes getIdCadLotes() {
        return idCadLotes;
    }

    public void setIdCadLotes(CadLotes idCadLotes) {
        CadLotes oldIdCadLotes = this.idCadLotes;
        this.idCadLotes = idCadLotes;
        changeSupport.firePropertyChange("idCadLotes", oldIdCadLotes, idCadLotes);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovDet != null ? idMovDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovDet)) {
            return false;
        }
        MovDet other = (MovDet) object;
        if ((this.idMovDet == null && other.idMovDet != null) || (this.idMovDet != null && !this.idMovDet.equals(other.idMovDet))) {
            return false;
        }
        return true;
    }
 @Override
    public String toString() {
        return "sislab.proteomica.view.movimento.MovDet[ idMovDet=" + idMovDet + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
