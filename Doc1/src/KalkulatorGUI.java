import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorGUI extends JFrame implements ActionListener {
    private JTextField input1, input2, output;
    private JButton tambah, kurang, kali, bagi;
    private JLabel label1, label2, labelHasil;
    
    public KalkulatorGUI() {
        // Set frame layout dan properti
        setTitle("Kalkulator Sederhana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Komponen GUI
        label1 = new JLabel("Angka Pertama:");
        label2 = new JLabel("Angka Kedua:");
        labelHasil = new JLabel("Hasil:");

        input1 = new JTextField();
        input2 = new JTextField();
        output = new JTextField();
        output.setEditable(false);

        // Tombol operasi
        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");

        // Tambahkan komponen ke frame
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);
        add(labelHasil);
        add(output);

        // Event handling untuk tombol
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);

        // Tampilkan frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Ambil input dari user
            double angka1 = Double.parseDouble(input1.getText());
            double angka2 = Double.parseDouble(input2.getText());
            double hasil = 0;

            // Tentukan operasi berdasarkan tombol yang ditekan
            if (e.getSource() == tambah) {
                hasil = angka1 + angka2;
            } else if (e.getSource() == kurang) {
                hasil = angka1 - angka2;
            } else if (e.getSource() == kali) {
                hasil = angka1 * angka2;
            } else if (e.getSource() == bagi) {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Pembagian dengan nol tidak diperbolehkan!");
                    return;
                }
            }

            // Tampilkan hasil di text field hasil
            output.setText(String.valueOf(hasil));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Masukkan angka yang valid!");
        }
    }

    public static void main(String[] args) {
        new KalkulatorGUI();
    }
}
