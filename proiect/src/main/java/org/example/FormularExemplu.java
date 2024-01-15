import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class FormularExemplu extends JFrame {
    private JTextField textField1, textField2;
    private JCheckBox checkBox;
    private JRadioButton radioButton1, radioButton2;
    private JComboBox<String> comboBox;

    public FormularExemplu() {
        setTitle("Formular Exemplu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel label1 = new JLabel("Text 1:");
        textField1 = new JTextField();

        JLabel label2 = new JLabel("Text 2:");
        textField2 = new JTextField();

        JLabel label3 = new JLabel("Checkbox:");
        checkBox = new JCheckBox();

        JLabel label4 = new JLabel("Radio:");
        radioButton1 = new JRadioButton("Optiune 1");
        radioButton2 = new JRadioButton("Optiune 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        JLabel label5 = new JLabel("ComboBox:");
        String[] options = {"Optiune 1", "Optiune 2", "Optiune 3"};
        comboBox = new JComboBox<>(options);

        JButton saveButton = new JButton("Salvare");
        JButton cancelButton = new JButton("Anulare");

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvareInJSON();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(label3);
        add(checkBox);
        add(label4);
        add(radioButton1);
        add(new JLabel(""));
        add(radioButton2);
        add(label5);
        add(comboBox);
        add(saveButton);
        add(cancelButton);

        setVisible(true);
    }

    private void salvareInJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Camp1", textField1.getText());
        jsonObject.put("Camp2", textField2.getText());
        jsonObject.put("Checkbox", checkBox.isSelected());
        jsonObject.put("Radio", radioButton1.isSelected() ? "Optiune 1" : "Optiune 2");
        jsonObject.put("ComboBox", comboBox.getSelectedItem());

        try (FileWriter file = new FileWriter("date.json", true)) {
            file.write(jsonObject.toJSONString() + "\n");
            file.flush();
            JOptionPane.showMessageDialog(this, "Datele au fost salvate cu succes in fisierul JSON.");
            clearForm();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Eroare la salvare.");
        }
    }

    private void clearForm() {
        textField1.setText("");
        textField2.setText("");
        checkBox.setSelected(false);
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        comboBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularExemplu();
            }
        });
    }
}
