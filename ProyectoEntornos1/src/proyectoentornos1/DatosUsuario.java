/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentornos1;

/**
 *
 * @author PabloLopez
 */
class DatosUsuario {
    
        public static boolean DatosUsuario(String Nombre, String dni, String email, String n_introducido, String dni_introducido, String email_introducido) {
            boolean valido = false;
            if(Nombre.equals(n_introducido) && dni.equals(dni_introducido) && email.equals(email_introducido)){
                valido = true;
            }
            return valido;
        }
    }

