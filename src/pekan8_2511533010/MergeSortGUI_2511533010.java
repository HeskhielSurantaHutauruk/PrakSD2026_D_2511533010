package pekan8_2511533010;
import pekan8_2511533010.Constants.Angka;
import pekan8_2511533010.Constants.Bernama;
import pekan8_2511533010.Constants.GuiCostants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511533010 extends JFrame {
    private static final long serialVersionUID = 1L;

    private int[] array_3010;
    private JLabel[] labelArray_3010;
    private JButton stepButton_3010, resetButton_3010, setButton_3010;
    private JTextField inputField_3010;
    private JPanel panelArray_3010;
    private JTextArea stepArea_3010;
    private Queue<int[]> mergeQueue_3010 = new LinkedList<>();
    private int stepCount_3010 = 1;
    private boolean isMerging_3010 = false;
    private boolean copying_3010 = false;
    private int[] temp_3010;
    private int left_3010, mid_3010, right_3010;
    private int i_3010, j_3010, k_3010;

    public MergeSortGUI_2511533010() {
        setTitle("Merge Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // panel input
        JPanel inputPanel_3010 = new JPanel(new FlowLayout());
        inputField_3010 = new JTextField(GuiCostants.TEXT_FIELD_COL_SIZE);
        setButton_3010 = new JButton(Bernama.SET_ARRAY);
        inputPanel_3010.add(new JLabel(Bernama.MASUKAN_ANGKA));
        inputPanel_3010.add(inputField_3010);
        inputPanel_3010.add(setButton_3010);

        // panel array visual
        panelArray_3010 = new JPanel();
        panelArray_3010.setLayout(new FlowLayout());

        // panel kontrol
        JPanel controlPanel_3010 = new JPanel();
        stepButton_3010 = new JButton(Bernama.MASUKAN_ANGKA);
        resetButton_3010 = new JButton(Bernama.RESET);
        controlPanel_3010.add(stepButton_3010);
        controlPanel_3010.add(resetButton_3010);

        // area text untuk log langkah langkah
        stepArea_3010 = new JTextArea(GuiCostants.TEXT_AREA_ROW_SIZE, GuiCostants.TEXT_AREA_COL_SIZE);
        stepArea_3010.setEditable(false);
        stepArea_3010.setFont(new Font(Bernama.MONOSPACE, Font.PLAIN, GuiCostants.FONT_SIZE_SMALL));
        JScrollPane scrollPane_3010 = new JScrollPane(stepArea_3010);

        // tambahkan panel ke frame
        add(inputPanel_3010, BorderLayout.NORTH);
        add(panelArray_3010, BorderLayout.CENTER);
        add(controlPanel_3010, BorderLayout.SOUTH);
        add(scrollPane_3010, BorderLayout.EAST);

        // event set array
        setButton_3010.addActionListener(e -> setArrayFromInput_3010());
        // event selanjutnya
        stepButton_3010.addActionListener(e -> performStep_3010());
        // event reset
        resetButton_3010.addActionListener(e -> reset_3010());
    }

    private void setArrayFromInput_3010() {
        String text_3010 = inputField_3010.getText().trim();
        if (text_3010.isEmpty()) return;

        String[] parts_3010 = text_3010.split(",");
        array_3010 = new int[parts_3010.length];

        try {
            for (int k = 0; k < parts_3010.length; k++) {
                array_3010[k] = Integer.parseInt(parts_3010[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
                    Bernama.ERROR, JOptionPane.ERROR_MESSAGE);
            return;
        }

        labelArray_3010 = new JLabel[array_3010.length];
        panelArray_3010.removeAll();
        for (int k = 0; k < array_3010.length; k++) {
            labelArray_3010[k] = new JLabel(String.valueOf(array_3010[k]));
            labelArray_3010[k].setFont(new Font(Bernama.MONOSPACE, Font.BOLD, GuiCostants.FONT_SIZE_MEDIUM));
            labelArray_3010[k].setOpaque(true);
            labelArray_3010[k].setBackground(Color.WHITE);
            labelArray_3010[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3010[k].setPreferredSize(new Dimension(GuiCostants.LABEL_WIDTH, GuiCostants.LABEL_HEIGHT));
            labelArray_3010[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3010.add(labelArray_3010[k]);
        }

        mergeQueue_3010.clear();
        generateMergeSteps_3010(Angka.NOL, array_3010.length - Angka.SATU);
        stepButton_3010.setEnabled(true);
        stepArea_3010.setText("");
        stepCount_3010 = Angka.SATU;
        isMerging_3010 = false;

        panelArray_3010.revalidate();
        panelArray_3010.repaint();
    }

    private void generateMergeSteps_3010(int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / Angka.DUA;
        generateMergeSteps_3010(left, mid);
        generateMergeSteps_3010(mid + Angka.SATU, right);
        mergeQueue_3010.add(new int[]{left, mid, right});
    }

    private void performStep_3010() {
        resetHighlights_3010();

        if (!isMerging_3010 && !mergeQueue_3010.isEmpty()) {
            int[] range_3010 = mergeQueue_3010.poll();
            left_3010 = range_3010[Angka.NOL];
            mid_3010 = range_3010[Angka.SATU];
            right_3010 = range_3010[Angka.DUA];
            temp_3010 = new int[right_3010 - left_3010 + Angka.SATU];
            i_3010 = left_3010;
            j_3010 = mid_3010 + Angka.SATU;
            k_3010 = Angka.NOL;
            copying_3010 = false;
            isMerging_3010 = true;

            stepArea_3010.append("Langkah " + stepCount_3010++ +
                    ": Mulai merge dari " + left_3010 + " ke " + right_3010 + "\n");
            return;
        }

        if (isMerging_3010 && !copying_3010) {
            if (i_3010 <= mid_3010 && j_3010 <= right_3010) {
                labelArray_3010[i_3010].setBackground(Color.CYAN);
                labelArray_3010[j_3010].setBackground(Color.CYAN);

                if (array_3010[i_3010] <= array_3010[j_3010]) {
                    temp_3010[k_3010++] = array_3010[i_3010++];
                } else {
                    temp_3010[k_3010++] = array_3010[j_3010++];
                }
                stepArea_3010.append("Langkah " + stepCount_3010++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i_3010 <= mid_3010) {
                temp_3010[k_3010++] = array_3010[i_3010++];
                stepArea_3010.append("Langkah " + stepCount_3010++ + ": Salin sisa kiri\n");
                return;
            } else if (j_3010 <= right_3010) {
                temp_3010[k_3010++] = array_3010[j_3010++];
                stepArea_3010.append("Langkah " + stepCount_3010++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying_3010 = true;
                k_3010 = Angka.NOL;
                return;
            }
        }

        if (copying_3010 && k_3010 < temp_3010.length) {
            array_3010[left_3010 + k_3010] = temp_3010[k_3010];
            labelArray_3010[left_3010 + k_3010].setText(String.valueOf(temp_3010[k_3010]));
            labelArray_3010[left_3010 + k_3010].setBackground(Color.GREEN);
            k_3010++;
            stepArea_3010.append("Langkah " + stepCount_3010++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_3010 && k_3010 == temp_3010.length) {
            isMerging_3010 = false;
            copying_3010 = false;
        }

        if (mergeQueue_3010.isEmpty() && !isMerging_3010) {
            stepArea_3010.append("Selesai.\n");
            stepButton_3010.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_3010() {
        if (labelArray_3010 == null) return;
        for (JLabel label : labelArray_3010) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_3010() {
        inputField_3010.setText("");
        panelArray_3010.removeAll();
        panelArray_3010.revalidate();
        panelArray_3010.repaint();
        stepArea_3010.setText("");
        stepButton_3010.setEnabled(false);
        mergeQueue_3010.clear();
        isMerging_3010 = false;
        stepCount_3010 = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511533010 gui = new MergeSortGUI_2511533010();
            gui.setVisible(true);
        });
    }
}