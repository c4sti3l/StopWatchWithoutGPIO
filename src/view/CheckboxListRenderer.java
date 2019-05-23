package view;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Starter;

public class CheckboxListRenderer extends JCheckBox implements ListCellRenderer<Starter> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Starter> list, Starter value, int index, boolean isSelected, boolean cellHasFocus) {
        setEnabled(list.isEnabled());
        setSelected(value.isSelected());
        setFont(list.getFont());
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        setText(value.toString());
        return this;
    }
}
