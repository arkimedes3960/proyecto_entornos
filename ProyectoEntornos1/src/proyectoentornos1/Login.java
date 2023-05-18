/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentornos1;


/**
 *
 * @author PabloLopez
 */
public class Login {

    public static boolean login(String Pass, String Introducido) {
        boolean valido=false;
        if(Pass.equals(Introducido)){
            valido=true;
        }
        return valido;
    }
}
