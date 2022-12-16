package sislab.proteomica.engine;


import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sislab.proteomica.beans.CadLaboratorio;


public class LoginLabCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof CadLaboratorio) {

            CadLaboratorio lab = (CadLaboratorio) value;
            setText(lab.getIdLab().toString()+"-"+lab.getSigla());
        }
        return this;
    }
}
