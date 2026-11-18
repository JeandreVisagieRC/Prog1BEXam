

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
        form.add(new JLabel("NUMBER OF BEDS:"));
        form.add(txtNumberOfBeds);
        form.add(new JLabel("BED PRICE:"));
        form.add(txtBedPrice);
        form.add(new JLabel("REPORT:"));

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        main.add(form);
        main.add(new JScrollPane(txaReport));
        add(main);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem ExitMenuItem = new JMenuItem("Exit");
        JMenuItem ProcessMenuItem = new JMenuItem("Process");
        JMenuItem clearItem = new JMenuItem("Clear");
        ExitMenuItem.addActionListener(e -> System.exit(0));
        processItem.addActionListener(e -> processData());
        clearItem.addActionListener(e -> clearForm());
        fileMenu.add(ExitMenuItem);
        toolsMenu.add(processItem);
        toolsMenu.add(clearItem);
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }
    private void process() {
        String mattressName = (String) cmbMattress.getSelectedItem();
        int numberOfBeds = Integer.parseInt(txtNumberOfBeds.getText());
        double bedPrice = Double.parseDouble(txtBedPrice.getText());
        double totalPrice = numberOfBeds * bedPrice;
        String report = "Mattress Name: " + mattressName + "\n" +
                        "Number of Beds: " + numberOfBeds + "\n" +
                        "Bed Price: " + bedPrice + "\n" +
                        "Total Price: " + totalPrice;
        txaReport.setText(report);
        try (FileWriter writer = new FileWriter("bed_report.txt")) {
            writer.write(report);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
