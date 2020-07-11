import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class GuiApl extends JDialog {
    private JPanel contentPane;
    private JTextField didectoryTextField;
    private JButton selectFileButton;
    private JButton checkFileIbanButton;
    private JButton checkIbanButton;
    private JTextField typeInIbanTextField;
    private JTextPane IbanBoolean;


    GuiApl() {
        setContentPane(contentPane);
        setModal(true);

        checkIbanButton.addActionListener(e -> {
            IbanBoolean.setText(String.valueOf(IbanValidation.validateIban(typeInIbanTextField.getText())));
        });
        selectFileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(false);
            int rVal = fileChooser.showOpenDialog(null);
            if (rVal == JFileChooser.APPROVE_OPTION) {
                didectoryTextField.setText(fileChooser.getSelectedFile().toString());
            }
        });
        checkFileIbanButton.addActionListener(e -> {
            try {
                if(!didectoryTextField.getText().isEmpty() &&  FileHandler.fileCheck(new File(didectoryTextField.getText()))) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Viskas atlikata sekmingai perziurekite rezultatus faile '.out");
                }else {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Kazkur įsivėlė klaida",
                            "Atsiprašome už patirtus nepatogumus",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }


        });
    }

    public static void main(String[] args) {
        GuiApl dialog = new GuiApl();
        dialog.pack();
        dialog.setTitle("SEB Iban tiktinimas Lukas Povilonis");
        dialog.setVisible(true);
        System.exit(0);
    }
}