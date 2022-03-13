/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesstrukdat;

/**
 *
 * @author msj
 * 1117048  Juan Wilson Nara
 * 1118009  Michael Septian Jaya
 * 1119001  Dave Nathaniel Kertaatmadja
 * 1119023  Jedediah Fanuel
 * 
 */
class Student {
    String idStudent;
    String username;
    String noTelepon;
    String password;
    String email;
    int saldo;
}

public class NodeStudent {
    Student data = new Student();
    NodeStudent next;
}
