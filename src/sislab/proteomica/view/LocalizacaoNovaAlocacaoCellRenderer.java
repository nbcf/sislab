package sislab.proteomica.view;


import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sislab.proteomica.beans.CadLocalizacao;



public class LocalizacaoNovaAlocacaoCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof CadLocalizacao) {

            CadLocalizacao loc = (CadLocalizacao) value;
            setText(loc.getIdLocalizacao().toString()+"-"+loc.getLocal());
        }
        return this;
    }
}
