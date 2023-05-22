/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES_GRAFICAS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gh extends JFrame implements ActionListener {

    private JLabel lblNumero1, lblNumero2, lblResultado;
    private JTextField txtNumero1, txtNumero2, txtResultado;
    private JButton btnSuma, btnResta, btnMultiplicacion, btnDivision;

    public gh() {
        super("Calculadora");

        // Crear componentes GUI
        lblNumero1 = new JLabel("Primer número:");
        lblNumero2 = new JLabel("Segundo número:");
        lblResultado = new JLabel("Resultado:");
        txtNumero1 = new JTextField(10);
        txtNumero2 = new JTextField(10);
        txtResultado = new JTextField(10);
        txtResultado.setEditable(false); // El resultado no se puede editar directamente
        btnSuma = new JButton("Suma");
        btnResta = new JButton("Resta");
        btnMultiplicacion = new JButton("Multiplicación");
        btnDivision = new JButton("División");

        // Añadir componentes GUI al contenedor
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(5, 2));
        contenedor.add(lblNumero1);
        contenedor.add(txtNumero1);
        contenedor.add(lblNumero2);
        contenedor.add(txtNumero2);
        contenedor.add(btnSuma);
        contenedor.add(btnResta);
        contenedor.add(btnMultiplicacion);
        contenedor.add(btnDivision);
        contenedor.add(lblResultado);
        contenedor.add(txtResultado);

        // Asignar manejadores de eventos a los botones
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnDivision.addActionListener(this);

        // Configurar la ventana
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        try {
            // Obtener los números ingresados por el usuario
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = 0;

            // Realizar la operación correspondiente
            if (evento.getSource() == btnSuma) {
                resultado = numero1 + numero2;
            } else if (evento.getSource() == btnResta) {
                resultado = numero1 - numero2;
            } else if (evento.getSource() == btnMultiplicacion) {
                resultado = numero1 * numero2;
            } else if (evento.getSource() == btnDivision) {
                if (numero2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                resultado = numero1 / numero2;
            }

            // Mostrar el resultado
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new gh();
    }
}
