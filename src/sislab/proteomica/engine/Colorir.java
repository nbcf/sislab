/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engine;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author NILDO
 */
public class Colorir extends JLabel implements TableCellRenderer
{
		public Component getTableCellRendererComponent(JTable masterTable,Object value,boolean isSelected,boolean hasFocus,int row,int column, Date vencida )
		{
                                Date dataHoje = new Date();
				if(dataHoje.after(vencida))
			{
				setForeground(Color.RED);	
			}
			else
			{
				setForeground(Color.BLACK);		
			}
 
				setText(value.toString());
 	
			return this;   	
		}

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	}