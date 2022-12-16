package sislab.proteomica.view.estoque;


import sislab.proteomica.engine.*;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sislab.proteomica.view.estoque.CadEstoque;
import sislab.proteomica.beans.CadLocalizacao;



public class TipoEstoqueCellRenderer extends DefaultListCellRenderer {

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
