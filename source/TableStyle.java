/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
        
public class TableStyle extends JTable{
    
    public TableStyle(){
        getTableHeader().setDefaultRenderer(new HeaderStyle());
    }
    
    private class HeaderStyle extends DefaultTableCellRenderer{
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
            Component com = super.getTableCellRendererComponent(jtable, o, bln1, bln1, i, i1);
            com.setBackground(new Color(0,196,204));
            com.setForeground(new Color(255,255,255));
            com.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20));
            return com;
        }
    }
}
