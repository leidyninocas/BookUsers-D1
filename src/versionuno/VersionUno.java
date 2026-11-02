package versionuno;

import javax.swing.*;


public class VersionUno {

    private JPanel Principal;
    private JLabel lblUsuario;
    private JTextField txtNombre;
    private JButton btnGuardar;
    private JLabel lblMensaje;

    //METODO VACIO
    private void createUIComponents() {
        // TODO: place custom component creation code here

        // CONSTRUCTOR DEL JBUTTON
    }

        public VersionUno () {
        btnGuardar.addActionListener(e-> {
        String nombre = txtNombre.getText();
        lblMensaje.setText("¡Bienvenido " + nombre + "!" );
        lblMensaje.revalidate();
        lblMensaje.repaint();

        });
        }

            // METODO MAIN

                public static void main(String[] args) {
                JFrame frame = new JFrame("BookUsers v1");
                frame.setContentPane(new VersionUno().Principal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(400, 250);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

}
}
