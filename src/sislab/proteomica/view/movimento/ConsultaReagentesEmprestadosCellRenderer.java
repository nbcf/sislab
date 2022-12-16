package sislab.proteomica.view.movimento;


import sislab.proteomica.view.*;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sislab.proteomica.pds.Pds;




public class ConsultaReagentesEmprestadosCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Pds) {

            Pds pds = (Pds) value;
            setText(pds.getIdPds().toString()+"-"+pds.getNomePds());
        }
        return this;
    }
}
