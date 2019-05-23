
import controller.MainController;
import controller.StarterController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import view.CheckboxListItem;
import view.CheckboxListRenderer;

public class Main {

    public static void main(String[] args) {
        MainController controller = new MainController();
        System.out.println("lol");
        controller.init();

//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create a list containing CheckboxListItem's
//        JList<CheckboxListItem> list = new JList<CheckboxListItem>(
//                new CheckboxListItem[]{new CheckboxListItem("apple"),
//                    new CheckboxListItem("orange"),
//                    new CheckboxListItem("mango"),
//                    new CheckboxListItem("paw paw"),
//                    new CheckboxListItem("banana")});
//
//        // Use a CheckboxListRenderer (see below)
//        // to renderer list cells
//        list.setCellRenderer(new CheckboxListRenderer());
//        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//
//        // Add a mouse listener to handle changing selection
//        list.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent event) {
//                JList<CheckboxListItem> list
//                        = (JList<CheckboxListItem>) event.getSource();
//
//                // Get index of item clicked
//                int index = list.locationToIndex(event.getPoint());
//                CheckboxListItem item = (CheckboxListItem) list.getModel()
//                        .getElementAt(index);
//
//                // Toggle selected state
//                item.setSelected(!item.isSelected());
//
//                // Repaint cell
//                list.repaint(list.getCellBounds(index, index));
//            }
//        });
//
//        frame.getContentPane().add(new JScrollPane(list));
//        frame.pack();
//        frame.setVisible(true);
    }
}
