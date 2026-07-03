package Pekan7_2511533010;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class InsertionSortGUI_2511533010 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane_3010;
    
    // Deklarasi semua variabel di sini (level class) dengan akhiran _3010
    private int[] array_3010;
    private JLabel[] labelArray_3010;
    private JButton stepButton_3010, resetButton_3010, setButton_3010;
    private JTextField inputField_3010;
    private JPanel panelArray_3010;
    private JTextArea stepArea_3010;
    
    private int i_3010 = 1, j_3010;
    private boolean sorting_3010 = false;
    private int stepCount_3010 = 1;

    /**
     * Create the frame.
     */
    public InsertionSortGUI_2511533010() {
        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_3010 = new JPanel(new FlowLayout());
        inputField_3010 = new JTextField(30);
        setButton_3010 = new JButton("Set Array");
        inputPanel_3010.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_3010.add(inputField_3010);
        inputPanel_3010.add(setButton_3010);

        // Panel array visual
        panelArray_3010 = new JPanel();
        panelArray_3010.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_3010 = new JPanel();
        stepButton_3010 = new JButton("Langkah Selanjutnya");
        resetButton_3010 = new JButton("Reset");
        stepButton_3010.setEnabled(false);
        controlPanel_3010.add(stepButton_3010);
        controlPanel_3010.add(resetButton_3010);
        
        // Area teks untuk log langkah-langkah
        stepArea_3010 = new JTextArea(8, 60);
        stepArea_3010.setEditable(false);
        stepArea_3010.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3010 = new JScrollPane(stepArea_3010);

        // Tambahkan panel ke frame
        add(inputPanel_3010, BorderLayout.NORTH);
        add(panelArray_3010, BorderLayout.CENTER);
        add(controlPanel_3010, BorderLayout.SOUTH);
        add(scrollPane_3010, BorderLayout.EAST);

        // Event Set Array
        setButton_3010.addActionListener(e -> setArrayFromInput_3010());

        // Event Langkah Selanjutnya
        stepButton_3010.addActionListener(e -> performStep_3010());

        // Event Reset
        resetButton_3010.addActionListener(e -> reset_3010());
    }
    
    private void setArrayFromInput_3010() {
        String text_3010 = inputField_3010.getText().trim();
        if (text_3010.isEmpty()) return;
        
        // PERBAIKAN: Split dengan koma, bukan titik koma
        String[] parts_3010 = text_3010.split(",");
        array_3010 = new int[parts_3010.length];
        
        try {
            for (int k_3010 = 0; k_3010 < parts_3010.length; k_3010++) {
                // PERBAIKAN: Trim untuk menghilangkan spasi
                array_3010[k_3010] = Integer.parseInt(parts_3010[k_3010].trim());
            }
        } catch (NumberFormatException e_3010) {
            // PERBAIKAN: Satu pesan error yang jelas
            JOptionPane.showMessageDialog(this, 
                "Masukkan hanya angka yang dipisahkan dengan koma\nContoh: 1, 2, 2354, 12, 24254, 55", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        stepCount_3010 = 1;
        sorting_3010 = true;
        i_3010 = 1; // PERBAIKAN: Reset i_3010 ke 1
        stepButton_3010.setEnabled(true);
        stepArea_3010.setText("");

        // Bersihkan panel array sebelum menambahkan yang baru
        panelArray_3010.removeAll();
        
        labelArray_3010 = new JLabel[array_3010.length];
        for (int k_3010 = 0; k_3010 < array_3010.length; k_3010++) {
            labelArray_3010[k_3010] = new JLabel(String.valueOf(array_3010[k_3010]));
            labelArray_3010[k_3010].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3010[k_3010].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3010[k_3010].setPreferredSize(new Dimension(50, 50));
            labelArray_3010[k_3010].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3010.add(labelArray_3010[k_3010]);
        }

        panelArray_3010.revalidate();
        panelArray_3010.repaint();
        
        // Tampilkan array awal di log
        stepArea_3010.append("Array awal: " + arrayToString_3010(array_3010) + "\n\n");
    }
    
    private void performStep_3010() {
        if (i_3010 < array_3010.length && i_3010 > 0) {
            int key_3010 = array_3010[i_3010];
            j_3010 = i_3010 - 1;
            
            StringBuilder stepLog_3010 = new StringBuilder();
            stepLog_3010.append("Langkah ").append(stepCount_3010).append("\n");
            stepLog_3010.append("Memasukkan ").append(key_3010).append("\n");
            
            while (j_3010 >= 0 && array_3010[j_3010] > key_3010) {
                array_3010[j_3010 + 1] = array_3010[j_3010];
                j_3010--;
            }
            array_3010[j_3010 + 1] = key_3010;
            
            updateLabels_3010();
            stepLog_3010.append("Hasil: ").append(arrayToString_3010(array_3010)).append("\n\n");
            stepArea_3010.append(stepLog_3010.toString());
            i_3010++;
            stepCount_3010++;
        }

        if (i_3010 >= array_3010.length) {
            sorting_3010 = false;
            stepButton_3010.setEnabled(false);
            stepArea_3010.append("Sorting selesai!\n");
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }
    
    private void updateLabels_3010() {
        for (int k_3010 = 0; k_3010 < array_3010.length; k_3010++) {
            labelArray_3010[k_3010].setText(String.valueOf(array_3010[k_3010]));
        }
    }

    private void reset_3010() {
        inputField_3010.setText("");
        panelArray_3010.removeAll();
        panelArray_3010.revalidate();
        panelArray_3010.repaint();
        stepArea_3010.setText("");
        stepButton_3010.setEnabled(false);
        sorting_3010 = false;
        i_3010 = 1;
        j_3010 = 0;
        stepCount_3010 = 1;
        array_3010 = null;
        labelArray_3010 = null;
    }

    private String arrayToString_3010(int[] arr_3010) {
        StringBuilder sb_3010 = new StringBuilder();
        for (int k_3010 = 0; k_3010 < arr_3010.length; k_3010++) {
            sb_3010.append(arr_3010[k_3010]);
            if (k_3010 < arr_3010.length - 1) {
                sb_3010.append(", ");
            }
        }
        return sb_3010.toString();
    }

    public static void main(String[] args_3010) {
        SwingUtilities.invokeLater(() -> {
            InsertionSortGUI_2511533010 gui_3010 = new InsertionSortGUI_2511533010();
            gui_3010.setVisible(true);
        });
    }
}