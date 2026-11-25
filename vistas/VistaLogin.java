package vistas;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaLogin extends JFrame {
    private JTextField txtUsuario;
    private JTextField txtContraseña;
    //BOTONES
    private JButton btnLogin;
    private JButton btnRegistrar;

    public VistaLogin(){
        setTitle("Sistema de Ventas");
        setBounds(10,30,800,500);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //TITULO --Sweet Moment-
        JLabel titulo = new JLabel("Bienvenido/a a Sweet Moment!");
        titulo.setBounds(250,20,500,100);
        Font fuenteTitulo = new Font("Arial", Font.BOLD, 20);
        titulo.setFont(fuenteTitulo);
        add(titulo);

        //Fuente general para todos los label
        Font fuenteLabel = new Font("Arial", Font.BOLD, 17);

        //Label usuario
        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(120,150,100,50);
        lblUsuario.setFont(fuenteLabel);
        add(lblUsuario);

        //TextField usuario
        txtUsuario = new JTextField();
        txtUsuario.setBounds(220,150,400,50);
        add(txtUsuario);

        //Label contraseña
        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setBounds(90,250,120,50);
        lblContraseña.setFont(fuenteLabel);
        add(lblContraseña);

        //TextField contraseña
        txtContraseña = new JTextField();
        txtContraseña.setBounds(220,250,400,50);
        add(txtContraseña);

        //Botones
        btnLogin = new JButton("Iniciar Sesión");
        btnLogin.setBounds(180,350,180,50);
        add(btnLogin);

        JLabel miniTexto = new JLabel("¿No tienes cuenta?");
        miniTexto.setBounds(455,300,180,50);
        miniTexto.setForeground(new Color(112, 112, 112));
        add(miniTexto);
        btnRegistrar = new JButton("Registrate");
        btnRegistrar.setBounds(420,350,180,50);
        add(btnRegistrar);

    }
}
