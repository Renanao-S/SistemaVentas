import javax.swing.JFrame;

import vistas.VistaLogin;

public class main{
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);

        VistaLogin vistaLogin =  new VistaLogin();
        vistaLogin.setVisible(false);
        frame.add(vistaLogin);
    }
}