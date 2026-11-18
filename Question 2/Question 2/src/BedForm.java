

/**
 *
 * @author jeandrevisagie
 */
import java.awt.GridLayout;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class BedForm extends JFrame {
    private final JComboBox <String> cmbMattress =
            new JComboBox <> (new String[] {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"});
    private final JTextField txtNumberOfBeds = new JTextField (12);
    private final JTextField txtBedPrice = new JTextField (12);
    private final JTextArea txaReport = new JTextArea (7,28);
    private final MattressData mattressData = new mattressData ();
    
    public BedReportForm() {
        super ("BED REPORT");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        txaReport.setEditable(false);
        
        JPanel form = new JPanel (new GridLayout(4,2,5,8));
        form.add(new JLabel("NAME:"));
        form.add(cmbName);
    }
}
