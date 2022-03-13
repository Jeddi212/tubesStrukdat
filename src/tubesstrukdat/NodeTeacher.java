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
class Teacher {
    String idTeacher;
    String nameTeacher;
    String password;
    NodeJadwal headJadwal;
    NodeJadwal tailJadwal;
    NodeMatpel headMatpel;
    NodeMatpel tailMatpel;
}

public class NodeTeacher {
    Teacher data = new Teacher();
    NodeTeacher next;
}