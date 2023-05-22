package collections;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class MiVentana extends JFrame {

    private JPanel panel;
    private JTextField entrada;
    private JTextArea salida;
    private JButton agregarBoton;
    private JToggleButton toggleBoton;

    public MiVentana() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        entrada = new JTextField();
        entrada.setBounds(20, 20, 200, 30);
        entrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = entrada.getText();
                salida.append(texto + "\n");
                entrada.setText("");
            }
        });
        panel.add(entrada);

        salida = new JTextArea();
        salida.setBounds(20, 60, 200, 200);
        salida.setEditable(false);
        salida.setBackground(Color.BLACK);
        salida.setForeground(Color.WHITE);
        panel.add(salida);

        agregarBoton = new JButton("Agregar");
        agregarBoton.setBounds(20, 270, 100, 30);
        agregarBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = entrada.getText();
                if (!texto.equals("")) {
                    salida.setText(texto + "\n");
                    entrada.setText("");
                }
            }
        });
        panel.add(agregarBoton);

        toggleBoton = new JToggleButton("Cambiar colores");
        toggleBoton.setBounds(130, 270, 120, 30);
        toggleBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (toggleBoton.isSelected()) {
                    salida.setBackground(Color.WHITE);
                    salida.setForeground(Color.BLUE);
                } else {
                    salida.setBackground(Color.BLACK);
                    salida.setForeground(Color.WHITE);
                }
            }
        });
        panel.add(toggleBoton);

        add(panel);
        setSize(300, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiVentana();
    }
}
