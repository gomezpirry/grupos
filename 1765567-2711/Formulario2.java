/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author juan pablo
 */
public class Formulario extends JFrame {
   
     
     Formulario(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout layoutMain = new GridLayout(5, 0);
        GridLayout layout1    = new GridLayout(2, 4);
        GridLayout layout2    = new GridLayout(4, 3);
        GridLayout layout3    = new GridLayout(1, 0);
        GridLayout layout4    = new GridLayout(1, 2);
        GridLayout layout5    = new GridLayout(1, 2);
        
        JPanel panelMain = new JPanel(layoutMain);
        JPanel panelA = new JPanel(layout1);
        JPanel panelB = new JPanel(layout2);
        JPanel panelC = new JPanel(layout3);
        JPanel panelD = new JPanel(layout4);
        JPanel panelE = new JPanel(layout5);
        
        
        JPanel panelCheck = new JPanel();
      
        JPanel panelDocumento = new JPanel();
        JLabel labelNombre = new JLabel("Nombre :");
        JLabel labelApellido = new JLabel("Apellido :");
        JLabel labelTipoDocumento = new JLabel("Tipo Documento : ");
        JLabel labelNumeroDocumento = new JLabel("Numero :");
        JLabel labelPerfil = new JLabel("Perfil :");
        JLabel Departamentos = new JLabel ("Departamento");
        
        JLabel labelDireccion = new JLabel("Direccion");
        JLabel labelTelefono = new JLabel("Telefono");
        JLabel labelCelular  = new JLabel("Celular");
        JLabel labelCiudad = new JLabel("Ciudad");
        JLabel labelDepartamento = new JLabel ("Departamento");
        JLabel labelPais = new JLabel ("Pais");
        
              
                
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
        JTextField textoDepartamento = new JTextField();
        JTextField textoPais = new JTextField();
        
        JTextArea areaPerfil = new JTextArea();
        JScrollPane scrollPerfil = new JScrollPane(areaPerfil);
        areaPerfil.setLineWrap(true);
        
        JCheckBox checkPeliculas   = new JCheckBox("Peliculas");
        JCheckBox checkVideojuegos = new JCheckBox("Videojuegos");
        JCheckBox checkViajes      = new JCheckBox("Viajes");
        JCheckBox checkEducacion   = new JCheckBox("Educacion");
        JCheckBox checkCompras     = new JCheckBox("Compras");
        JCheckBox checkVehiculos   = new JCheckBox("vehiculos");
        JCheckBox checkNegocios    = new JCheckBox("Negocios");
        JCheckBox checkOtros       = new JCheckBox("Otros");   
        
        panelCheck.setLayout(new GridLayout(2, 4, 10 ,10));
        panelCheck.add(checkPeliculas);
        panelCheck.add(checkVideojuegos);
        panelCheck.add(checkViajes);
        panelCheck.add(checkEducacion);
        panelCheck.add(checkCompras);
        panelCheck.add(checkVehiculos);
        panelCheck.add(checkNegocios);
        panelCheck.add(checkOtros);
        
        JButton buttonCancelar = new JButton("Cancelar");
        JButton buttonEnviar   = new JButton("Enviar");   
        
        String [] lang = {"valle del cauca", "choco", "cauca", "nariño"};
        JComboBox Dpto = new JComboBox (lang) ;
        
        panelA.add(labelNombre);
        panelA.add(textoNombre);
        panelA.add(labelApellido);
        panelA.add(textoApellido);
        panelA.add(labelTipoDocumento);
        panelA.add(panelDocumento);
        panelA.add(labelNumeroDocumento);
        panelA.add(textoNumeroDocumento);
        panelE.add(labelPerfil);
        panelE.add(scrollPerfil);
        panelE.add(Departamentos);
        panelE.add(Dpto);
        
        panelB.add(labelDireccion);
        panelB.add(labelTelefono);
        panelB.add(labelCelular);
        panelB.add(textoDireccion);
        try{
            MaskFormatter m = new MaskFormatter("###-####");
            JFormattedTextField formaTelefono = new JFormattedTextField(m);
            panelB.add(formaTelefono);
        }catch(ParseException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        try{
            MaskFormatter m = new MaskFormatter("###-###-####");
            JFormattedTextField formaCelular = new JFormattedTextField(m);
            panelB.add(formaCelular);
        }catch(ParseException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        
        panelB.add(labelCiudad);
        panelB.add(labelDepartamento);
        panelB.add(labelPais);
        panelB.add(textoCiudad);
        panelB.add(textoDepartamento);
        panelB.add(textoPais);
        
        panelC.add(panelCheck);
        
        panelD.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelD.add(buttonCancelar);
        panelD.add(buttonEnviar);
        
        panelMain.add(panelA);
        panelMain.add(panelE);
        panelMain.add(panelB);
        panelMain.add(panelC);
        panelMain.add(panelD);
        
        
        getContentPane().add(panelMain);
        setVisible(true);
        pack();
        
        JMenuBar menuBar = new JMenuBar () ;
        JMenu file = new JMenu (" File ") ;
        JMenu options = new JMenu (" options ") ;
        JMenu help = new JMenu ("help");
        JMenuItem NEW = new JMenuItem ("New");
        JMenuItem save = new JMenuItem ("save");
        JMenuItem send = new JMenuItem ("send");
        JMenuItem clear = new JMenuItem ("clear");
        JMenuItem fill = new JMenuItem ("fill");
        JMenuItem about = new JMenuItem ("about");
        JMenuItem credits = new JMenuItem ("credits");
        JMenuItem quit = new JMenuItem ("quit");
                  
        
        file.add(NEW) ;
        file.add(save);
        file.add(send);
        file.addSeparator();
        file.add(quit);
        
        options.add(clear);
        options.add(fill);
        
        help.add(about);
        help.add(credits);
        
        menuBar.add(file);
        menuBar.add(options);
        menuBar.add(help);
        
        setJMenuBar ( menuBar ) ;

        
                
    }}

    
    
       
        
       
    

