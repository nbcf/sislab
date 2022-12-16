package sislab.proteomica.view.lotesNotas;


import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import sislab.proteomica.beans.Fornecedor;



public class FornecedorCadastroLotesCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Fornecedor) {

            Fornecedor forn = (Fornecedor) value;
            setText(forn.getIdFornecedor().toString()+"-"+forn.getFornecedor());
        }
        return this;
    }
}
