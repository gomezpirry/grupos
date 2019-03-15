
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class FormularioDemo extends JFrame {
    
    FormularioDemo(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar () ;
        JMenu fileMenu = new JMenu (" File ") ;
        JMenu optionsMenu = new JMenu (" options ") ;
        JMenuItem save = new JMenuItem ("save") ;
        JMenuItem send = new JMenuItem ("send");
        JMenuItem New = new JMenuItem ("new");
        JMenuItem clear = new JMenuItem (" clear ") ;
        JMenuItem fill = new JMenuItem (" fill ") ;
        JMenu help = new JMenu ("help");
        JMenuItem about = new JMenuItem("about");
        JMenuItem credits = new JMenuItem("credits");
        
        JMenuItem quit = new JMenuItem ("quit");
        
      
        
        fileMenu .add ( save );
        fileMenu .add (send);
        fileMenu .add (New);
        fileMenu .addSeparator ();
        fileMenu .add (quit);
        optionsMenu .add( clear ) ;
        optionsMenu .add( fill ) ;
        optionsMenu . addSeparator () ;
        help.add(about);
        help.add(credits);
        menuBar .add ( fileMenu ) ;
        menuBar .add ( optionsMenu ) ;
        menuBar .add ( help ) ;
// add menu bar to frame
        setJMenuBar ( menuBar ) ;
        
        
        GridLayout layoutMain = new GridLayout(5,0,10, 10);
        GridLayout layout1 = new GridLayout(2, 4, 10,10);
        GridLayout layout2 = new GridLayout(4, 3, 10,10);
        GridLayout layout3 = new GridLayout(1, 0, 10, 10);
        GridLayout layout4 = new GridLayout(1, 2, 10, 10);
        GridLayout layout5 = new GridLayout(2, 4, 10, 10);
        
        
        JPanel panelMain = new JPanel(layoutMain);
        JPanel panel1 = new JPanel(layout1);
        JPanel panel2 = new JPanel(layout2);
        JPanel panel3 = new JPanel(layout3);
        JPanel panel4 = new JPanel(layout4);
        JPanel panel5 = new JPanel(layout5);
        JPanel panelCheck = new JPanel();
        panelCheck.setBorder(BorderFactory.createTitledBorder("Intereses"));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel panelDocumento = new JPanel();
        
        JButton cancelar = new JButton ("cancelar");
        JButton enviar = new JButton ("enviar");
        panel4.add(cancelar);
        panel4.add(enviar);
        
        
        String [] departamentos = {"valle del cauca","nariño","choco","cauca"};
        JComboBox comboDpto = new JComboBox (departamentos);
        
        JLabel labelDepartamento = new JLabel ("departamento :");
        
       
        
        JLabel labelNombre = new JLabel("Nombre :");
        JLabel labelApellido = new JLabel("Apellido :");
        JLabel labelTipoDocumento = new JLabel("Tipo Documento: ");
        JLabel labelNumeroDocumento = new JLabel("Numero");
        JLabel labelPerfil = new JLabel("Perfil :");
        
        JLabel labelDireccion = new JLabel("Direccion");
        JLabel labelTelefono = new JLabel("Telefono");
        JLabel labelCelular  = new JLabel("Celular");
        JLabel labelCiudad = new JLabel("Ciudad");
        JLabel labelDepto = new JLabel ("Departamento");
        JLabel labelPais = new JLabel ("Pais");
        
        /*JLabel labelIntereses = new JLabel("Interes");
        labelIntereses.setLayout(new BoxLayout(labelIntereses, BoxLayout.X_AXIS));
        */
        
        ButtonGroup tipoDocumento = new ButtonGroup();
        JRadioButton cedula = new JRadioButton("C.C");
        JRadioButton tarjetaIdentidad = new JRadioButton("T.I");
        JRadioButton registroCivil = new JRadioButton("R.C");
        tipoDocumento.add(cedula);
        tipoDocumento.add(tarjetaIdentidad);
        tipoDocumento.add(registroCivil);
        panelDocumento.add(cedula);
        panelDocumento.add(tarjetaIdentidad);
        panelDocumento.add(registroCivil);
        
        
        
        JTextField textoNombre = new JTextField();
        JTextField textoApellido = new JTextField();
        JTextField textoNumeroDocumento = new JTextField();
        
        JTextField textoDireccion = new JTextField();
        JTextField textoCiudad = new JTextField();
        JTextField textoDepto = new JTextField();
        JTextField textoPais = new JTextField();
        
        JTextArea areaPerfil = new JTextArea();
        JScrollPane scrollPerfil = new JScrollPane(areaPerfil);
        areaPerfil.setLineWrap(true);
        
        JCheckBox checkDeportes  = new JCheckBox("Deportes");
        JCheckBox checkViajar    = new JCheckBox("Viajar");
        JCheckBox checkMusica    = new JCheckBox("Musica");
        JCheckBox checkCine      = new JCheckBox("Cine");
        JCheckBox checkVehiculos = new JCheckBox("Vehiculos");
        JCheckBox checkOtros     = new JCheckBox("Otros");
        
        panelCheck.add(checkDeportes);
        panelCheck.add(checkViajar);
        panelCheck.add(checkMusica);
        panelCheck.add(checkCine);
        panelCheck.add(checkVehiculos);
        panelCheck.add(checkOtros);
        
        
        
        panel1.add(labelNombre);
        panel1.add(textoNombre);
        panel1.add(labelApellido);
        panel1.add(textoApellido);
        panel1.add(labelTipoDocumento);
        panel1.add(panelDocumento);
        panel1.add(labelNumeroDocumento);
        panel1.add(textoNumeroDocumento);
        
        panel5.add(labelDepartamento);
        panel5.add(comboDpto);
        panel5.add(labelPerfil);
        panel5.add(scrollPerfil);
        
        
        
        
        
        
        panel2.add(labelDireccion);
        panel2.add(labelTelefono);
        panel2.add(labelCelular);
        panel2.add(textoDireccion);
        try{
            MaskFormatter m = new MaskFormatter("###-####");
            JFormattedTextField formaTelefono = new JFormattedTextField(m);
            panel2.add(formaTelefono);
        }catch(ParseException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        try{
            MaskFormatter m = new MaskFormatter("###-###-####");
            JFormattedTextField formaCelular = new JFormattedTextField(m);
            panel2.add(formaCelular);
        }catch(ParseException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        
        panel2.add(labelCiudad);
        panel2.add(labelDepto);
        panel2.add(labelPais);
        panel2.add(textoCiudad);
        panel2.add(textoDepto);
        panel2.add(textoPais);
        
        panel3.add(panelCheck);
        
        panelMain.add(panel1);
        panelMain.add(panel5);
        panelMain.add(panel2);
        panelMain.add(panel3);
        panelMain.add(panel4);
      
        
        
        getContentPane().add(panelMain);
        setVisible(true);
        setSize(700, 800);
        
                
    }
    }

