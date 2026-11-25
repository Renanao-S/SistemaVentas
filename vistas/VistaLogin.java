package vistas;
import javax.swing.JFrame;

public class VistaLogin extends JFrame {
    public VistaLogin(){
        JFrame login = new JFrame("Sistema de Ventas-Básico");
        login.setBounds(10,30,800,600);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
