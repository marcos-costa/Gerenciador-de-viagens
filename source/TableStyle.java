import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
        
public class TableStyle extends JTable{
    private  HeaderStyle header;
    //private RowStyle cell;
    
    public TableStyle(){
        header = new HeaderStyle();
        //cell = new RowStyle();
        getTableHeader().setDefaultRenderer(new HeaderStyle());
        //setDefaultRenderer(Object.class, new RowStyle());
        //setRowHeight(30);
    }
    
     public void setColumnAlignment(int column, int align) {
        header.setAlignment(column, align);
     }   
    public void newScrollBar(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0,196,204));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(255, 255, 255));
        
    }
    private class HeaderStyle extends DefaultTableCellRenderer{
        private Map <Integer,Integer> alinhamento = new HashMap<>();
        
        public void setAlignment(int column, int align) {
            alinhamento.put(column, align);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column){
            Component com = super.getTableCellRendererComponent(jtable, o, bln1, bln1, row, column);
            com.setBackground(new Color(0,196,204));
            com.setForeground(new Color(255,255,255));
            com.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20));
            if (alinhamento.containsKey(column)) {
                setHorizontalAlignment(alinhamento.get(column));
            } else {
                setHorizontalAlignment(JLabel.CENTER);
            }
            return com;
        }
    }
    
    
}