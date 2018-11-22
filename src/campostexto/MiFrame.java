
package campostexto;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
public class MiFrame extends JFrame { 
private JTextField field_usuario;
private JPasswordField field_contraseña;
private JButton button_Login;
public  String usuario[][]={
            //email, contraseña
            {"daniel","123"},
            {"gustavo", "456"},
            {"elena", "789"}};
//Constructor
@SuppressWarnings("empty-statement")
public MiFrame() {
    super("Prueba de campos de texto");
    setLayout(new FlowLayout());
    //Crea un campo de texzto con 20 columnas
    field_usuario = new JTextField(20);
    add( field_usuario);
    //Crea unncampo con el texto oculto
    field_contraseña = new JPasswordField(20);
    add(field_contraseña);
    //Crea un boton con texto
    button_Login = new JButton("Login");
    button_Login.addActionListener((ActionEvent e) -> {
         System.out.println("usuario: " +
                 field_usuario.getText());
          System.out.println("Contraseña: " +
                 field_contraseña.getText());
   //Llamada al metodo de validacion
   validacion(field_usuario.getText(),
           field_contraseña.getText());
     });
   add(button_Login);       
}
private void validacion(String email, String password) {
    boolean UserEncontrado = false;    
    if( email.equals("") ||  password.equals("") ) {
       JOptionPane.showMessageDialog(null, "Correo y Contraseña Obligatorios");
       return;
	}
    for (int fila = 0; fila < usuario.length; fila++){
		
		if (email.equals(usuario[fila][0]) && password.equals(usuario[fila][1])){
        JOptionPane.showMessageDialog(null, "Usuario y Contraseña correctos");
        UserEncontrado = true;
		}     	
        }
        
  if (UserEncontrado == false) {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos");
            }                       
}
}
    
    
  

  






