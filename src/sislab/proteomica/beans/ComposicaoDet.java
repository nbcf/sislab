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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author canep
 */
@Entity
@Table(name = "composicao_det", catalog = "fenyx", schema = "")
@NamedQueries({
    @NamedQuery(name = "ComposicaoDet.findAll", query = "SELECT c FROM ComposicaoDet c")
    , @NamedQuery(name = "ComposicaoDet.findByIdCompDet", query = "SELECT c FROM ComposicaoDet c WHERE c.idCompDet = :idCompDet")
    , @NamedQuery(name = "ComposicaoDet.findByReagente", query = "SELECT c FROM ComposicaoDet c WHERE c.reagente = :reagente")
    , @NamedQuery(name = "ComposicaoDet.findByQuant", query = "SELECT c FROM ComposicaoDet c WHERE c.quant = :quant")
    , @NamedQuery(name = "ComposicaoDet.findByTipoUnd", query = "SELECT c FROM ComposicaoDet c WHERE c.tipoUnd = :tipoUnd")
    , @NamedQuery(name = "ComposicaoDet.findByEst1", query = "SELECT c FROM ComposicaoDet c WHERE c.est1 = :est1")
    , @NamedQuery(name = "ComposicaoDet.findByEst2", query = "SELECT c FROM ComposicaoDet c WHERE c.est2 = :est2")
    , @NamedQuery(name = "ComposicaoDet.findByEst3", query = "SELECT c FROM ComposicaoDet c WHERE c.est3 = :est3")
    , @NamedQuery(name = "ComposicaoDet.findByLocal", query = "SELECT c FROM ComposicaoDet c WHERE c.local = :local")
    , @NamedQuery(name = "ComposicaoDet.findByLab", query = "SELECT c FROM ComposicaoDet c WHERE c.lab = :lab")
    , @NamedQuery(name = "ComposicaoDet.findByQrCod", query = "SELECT c FROM ComposicaoDet c WHERE c.qrCod = :qrCod")})
public class ComposicaoDet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COMP_DET")
    private Integer idCompDet;
    @Column(name = "REAGENTE")
    private String reagente;
    @Column(name = "QUANT")
    private String quant;
    @Column(name = "TIPO_UND")
    private String tipoUnd;
    @Column(name = "EST1")
    private String est1;
    @Column(name = "EST2")
    private String est2;
    @Column(name = "EST3")
    private String est3;
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "LAB")
    private String lab;
    @Column(name = "QR_COD")
    private String qrCod;
    @JoinColumn(name = "ID_COMP_CAB", referencedColumnName = "ID_COMP_CAB")
    @ManyToOne
    private ComposicaoCab idCompCab;

    public ComposicaoDet() {
    }

    public ComposicaoDet(Integer idCompDet) {
        this.idCompDet = idCompDet;
    }

    public Integer getIdCompDet() {
        return idCompDet;
    }

    public void setIdCompDet(Integer idCompDet) {
        Integer oldIdCompDet = this.idCompDet;
        this.idCompDet = idCompDet;
        changeSupport.firePropertyChange("idCompDet", oldIdCompDet, idCompDet);
    }

    public String getReagente() {
        return reagente;
    }

    public void setReagente(String reagente) {
        String oldReagente = this.reagente;
        this.reagente = reagente;
        changeSupport.firePropertyChange("reagente", oldReagente, reagente);
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        String oldQuant = this.quant;
        this.quant = quant;
        changeSupport.firePropertyChange("quant", oldQuant, quant);
    }

    public String getTipoUnd() {
        return tipoUnd;
    }

    public void setTipoUnd(String tipoUnd) {
        String oldTipoUnd = this.tipoUnd;
        this.tipoUnd = tipoUnd;
        changeSupport.firePropertyChange("tipoUnd", oldTipoUnd, tipoUnd);
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

    public String getEst3() {
        return est3;
    }

    public void setEst3(String est3) {
        String oldEst3 = this.est3;
        this.est3 = est3;
        changeSupport.firePropertyChange("est3", oldEst3, est3);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        String oldLocal = this.local;
        this.local = local;
        changeSupport.firePropertyChange("local", oldLocal, local);
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        String oldLab = this.lab;
        this.lab = lab;
        changeSupport.firePropertyChange("lab", oldLab, lab);
    }

    public String getQrCod() {
        return qrCod;
    }

    public void setQrCod(String qrCod) {
        String oldQrCod = this.qrCod;
        this.qrCod = qrCod;
        changeSupport.firePropertyChange("qrCod", oldQrCod, qrCod);
    }

    public ComposicaoCab getIdCompCab() {
        return idCompCab;
    }

    public void setIdCompCab(ComposicaoCab idCompCab) {
        ComposicaoCab oldIdCompCab = this.idCompCab;
        this.idCompCab = idCompCab;
        changeSupport.firePropertyChange("idCompCab", oldIdCompCab, idCompCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompDet != null ? idCompDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComposicaoDet)) {
            return false;
        }
        ComposicaoDet other = (ComposicaoDet) object;
        if ((this.idCompDet == null && other.idCompDet != null) || (this.idCompDet != null && !this.idCompDet.equals(other.idCompDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sislab.proteomica.view.ComposicaoDet[ idCompDet=" + idCompDet + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
