/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesstrukdat;

import java.util.Scanner;

/**
 *
 * @author msj
 * 1117048  Juan Wilson Nara
 * 1118009  Michael Septian Jaya
 * 1119001  Dave Nathaniel Kertaatmadja
 * 1119023  Jedediah Fanuel
 * 
 */

public class controller {
    
    public static NodeStudent headStudent = null;
    public static NodeStudent tailStudent = null;
    public static NodeTeacher headTeacher = null;
    public static NodeTeacher tailTeacher = null;
    public static NodePembayaran headPay = null;
    public static NodePembayaran tailPay = null;
    public static NodePenggajian headGaji = null;
    public static NodePenggajian tailGaji = null;
    public static NodePengambilanMatpel headAmbil = null;
    public static NodePengambilanMatpel tailAmbil = null;
    public static Scanner scan = new Scanner(System.in);
    
    
    public static void inisialisasiStudents(){
        NodeStudent s1 = new NodeStudent();
        s1.data.idStudent = "budi1";
        s1.data.noTelepon = "081234214242";
        s1.data.email = "budi@gmail.com";
        s1.data.username = "budi";
        s1.data.password = "1234";
        s1.data.saldo = 35000;
        s1.next = null;
        
        if(headStudent == null){
            headStudent = s1;
            tailStudent = s1;
        }
        NodeStudent s2 = new NodeStudent();
        s2.data.idStudent = "rremar2";
        s2.data.noTelepon = "082125435432";
        s2.data.email = "rremar@gmail.com";
        s2.data.username = "rremar";
        s2.data.password = "3462";
        s2.data.saldo = 50000;
        s2.next = null;
        
        tailStudent.next = s2;
        tailStudent = s2;
        
        NodeStudent s3 = new NodeStudent();
        s3.data.idStudent = "bada3";
        s3.data.noTelepon = "083462462623";
        s3.data.email = "bada@gmail.com";
        s3.data.username = "bada";
        s3.data.password = "1144";
        s3.data.saldo = 70000;
        s3.next = null;
        
        tailStudent.next = s3;
        tailStudent = s3;
    }
    
    public static void inisialisasiPembayaran(){
        
        NodePembayaran pay1 = new NodePembayaran();
        pay1.data.idStudent = "budi1";
        pay1.data.tanggal = 15;
        pay1.data.bulan = 1;
        pay1.data.tahun = 2020;
        pay1.data.pay = 300000;
        pay1.next = null;
        if(headPay == null){
            headPay = pay1;
            tailPay = pay1;
        }
        NodePembayaran pay2 = new NodePembayaran();
        pay2.data.idStudent = "budi1";
        pay2.data.tanggal = 7;
        pay2.data.bulan = 2;
        pay2.data.tahun = 2020;
        pay2.data.pay = 300000;
        pay2.next = null;
        
        tailPay.next = pay2;
        tailPay = pay2;
        
        NodePembayaran pay3 = new NodePembayaran();
        pay3.data.idStudent = "rremar2";
        pay3.data.tanggal = 21;
        pay3.data.bulan = 1;
        pay3.data.tahun = 2020;
        pay3.data.pay = 300000;
        pay3.next = null;
        
        tailPay.next = pay3;
        tailPay = pay3;
        
        NodePembayaran pay4 = new NodePembayaran();
        pay4.data.idStudent = "bada3";
        pay4.data.tanggal = 24;
        pay4.data.bulan = 1;
        pay4.data.tahun = 2020;
        pay4.data.pay = 300000;
        pay4.next = null;
        
        tailPay.next = pay4;
        tailPay = pay4;
        
    }
    
    public static void inisialisasiTeacher(){
        NodeTeacher t1 = new NodeTeacher();
        NodeMatpel matpel1 = new NodeMatpel();
        NodeMatpel matpel2 = new NodeMatpel();
        NodeJadwal jadwal1 = new NodeJadwal();
        NodeJadwal jadwal2 = new NodeJadwal();
        NodeJadwal jadwal3 = new NodeJadwal();
        t1.data.idTeacher = "hartono1";
        t1.data.nameTeacher = "hartono";
        t1.data.password = "5253";
        t1.next = null;
        matpel1.data.idMatpel = "matematika0001";
        matpel1.data.namaMatpel = "Matematika";
        
        jadwal1.data.idJadwal = "11.0013.00matematika0001";
        jadwal1.data.idMatpel = "matematika0001";
        jadwal1.data.tanggal = "2-Februari-2020";
        jadwal1.data.jamMulai = "11.00";
        jadwal1.data.jamSelesai = "13.00";
        jadwal1.data.hari = "selasa";
        jadwal1.next = null;
        if(t1.data.headJadwal == null){
            t1.data.headJadwal = jadwal1;
            t1.data.tailJadwal = jadwal1;
        }
        jadwal2.data.idJadwal = "15.0017.00matematika0001";
        jadwal2.data.idMatpel = "matematika0001";
        jadwal2.data.tanggal = "2-Februari-2020";
        jadwal2.data.jamMulai = "15.00";
        jadwal2.data.jamSelesai = "17.00";
        jadwal2.data.hari = "selasa";
        jadwal2.next = null;
        t1.data.tailJadwal.next = jadwal2;
        t1.data.tailJadwal = jadwal2;
        
        matpel1.next = null;
        if(t1.data.headMatpel == null){
            t1.data.headMatpel = matpel1;
            t1.data.tailMatpel = matpel1;
        }
        matpel2.data.idMatpel = "fisika0112";
        matpel2.data.namaMatpel = "Fisika";
        
        jadwal3.data.idJadwal = "9.0011.00fisika0112";
        jadwal3.data.idMatpel = "fisika0112";
        jadwal3.data.tanggal = "2-Februari-2020";
        jadwal3.data.jamMulai = "9.00";
        jadwal3.data.jamSelesai = "11.00";
        jadwal3.data.hari = "selasa";
        jadwal3.next = null;
        t1.data.tailJadwal.next = jadwal3;
        t1.data.tailJadwal = jadwal3;
        
        matpel2.next = null;
        t1.data.tailMatpel.next = matpel2;
        t1.data.tailMatpel = matpel2;
        
        if(headTeacher == null){
            headTeacher = t1;
            tailTeacher = t1;
        }
        
        
        NodeTeacher t2 = new NodeTeacher();
        NodeMatpel matpel4 = new NodeMatpel();
        NodeMatpel matpel5 = new NodeMatpel();
        NodeMatpel matpel8 = new NodeMatpel();
        NodeMatpel matpel9 = new NodeMatpel();
        NodeJadwal jadwal4 = new NodeJadwal();
        NodeJadwal jadwal5 = new NodeJadwal();
        NodeJadwal jadwal9 = new NodeJadwal();
        NodeJadwal jadwal10 = new NodeJadwal();
        NodeJadwal jadwal11 = new NodeJadwal();
        NodeJadwal jadwal12 = new NodeJadwal();
        
        t2.data.idTeacher = "lidya2";
        t2.data.nameTeacher = "lidya";
        t2.data.password = "2522";
        
        matpel4.data.idMatpel = "inggris0123";
        matpel4.data.namaMatpel = "Inggris";
        jadwal4.data.idMatpel = "inggris0123";
        jadwal4.data.idJadwal = "14.0016.00inggris0123";
        jadwal4.data.hari = "Rabu";
        jadwal4.data.tanggal = "3-Februari-2020";
        jadwal4.data.jamMulai = "14.00";
        jadwal4.data.jamSelesai = "16.00";
        if(t2.data.headJadwal == null){
            t2.data.headJadwal = jadwal4;
            t2.data.tailJadwal = jadwal4;
        }
        matpel4.next = null;
        if(t2.data.headMatpel == null){
            t2.data.headMatpel = matpel4;
            t2.data.tailMatpel = matpel4;
        }
        
        matpel5.data.idMatpel = "jerman0213";
        matpel5.data.namaMatpel = "Jerman";
        
        jadwal5.data.idJadwal = "17.0019.00jerman0213";
        jadwal5.data.idMatpel = "jerman0213";
        jadwal5.data.hari = "Kamis";
        jadwal5.data.jamMulai = "17.00";
        jadwal5.data.jamSelesai = "19.00";
        jadwal5.data.tanggal = "4-Februari-2020";
        jadwal5.next = null;
        
        t2.data.tailJadwal.next = jadwal5;
        t2.data.tailJadwal = jadwal5;
        
        matpel5.next = null;
        t2.data.tailMatpel.next = matpel5;
        t2.data.tailMatpel = matpel5;
        matpel8.data.idMatpel = "sunda1113";
        matpel8.data.namaMatpel = "Bahasa Sunda";
        jadwal9.data.idJadwal = "16.0018.00sunda1113";
        jadwal9.data.idMatpel = "sunda1113";
        jadwal9.data.jamMulai = "16.00";
        jadwal9.data.jamSelesai = "19.00";
        jadwal9.data.tanggal = "2-Februari-2020";
        jadwal9.data.hari = "Selasa";
        jadwal9.next = null;
        t2.data.tailJadwal.next = jadwal9;
        t2.data.tailJadwal = jadwal9;
        
        jadwal10.data.idJadwal = "14.0016.00sunda1113";
        jadwal10.data.idMatpel = "sunda1113";
        jadwal10.data.jamMulai = "14.00";
        jadwal10.data.jamSelesai = "16.00";
        jadwal10.data.tanggal = "2-Februari-2020";
        jadwal10.data.hari = "Selasa";
        jadwal10.next = null;
        t2.data.tailJadwal.next = jadwal10;
        t2.data.tailJadwal = jadwal10;
        matpel8.next = null;
        t2.data.tailMatpel.next = matpel8;
        t2.data.tailMatpel = matpel8;
        
        matpel9.data.idMatpel = "indonesia1423";
        matpel9.data.namaMatpel = "Bahasa Indonesia";
        jadwal11.data.idJadwal = "14.0016.00indonesia1423";
        jadwal11.data.idMatpel = "indonesia1423";
        jadwal11.data.jamMulai = "14.00";
        jadwal11.data.jamSelesai = "16.00";
        jadwal11.data.hari = "Jumat";
        jadwal11.data.tanggal = "5-Februari-2020";
        jadwal11.next = null;
        t2.data.tailJadwal.next = jadwal11;
        t2.data.tailJadwal = jadwal11;
        matpel9.next = null;
        t2.data.tailMatpel.next = matpel9;
        t2.data.tailMatpel = matpel9;
        
        t2.next = null;
        tailTeacher.next = t2;
        tailTeacher = t2;
        
        NodeTeacher t3 = new NodeTeacher();
        NodeMatpel matpel6 = new NodeMatpel();
        NodeMatpel matpel7 = new NodeMatpel();
        NodeJadwal jadwal6 = new NodeJadwal();
        NodeJadwal jadwal7 = new NodeJadwal();
        NodeJadwal jadwal8 = new NodeJadwal();
        t3.data.idTeacher = "maman3";
        t3.data.nameTeacher = "maman";
        t3.data.password = "8456";
        t3.next = null;
        
        matpel6.data.idMatpel = "akuntansi0431";
        matpel6.data.namaMatpel = "Akuntansi";
        jadwal6.data.idMatpel = "akuntansi0431";
        jadwal6.data.idJadwal = "15.0017.00akuntansi0431";
        jadwal6.data.hari = "Rabu";
        jadwal6.data.jamMulai = "15.00";
        jadwal6.data.jamSelesai = "17.00";
        jadwal6.data.tanggal = "3-Februari-2020";
        if(t3.data.headJadwal == null){
            t3.data.headJadwal = jadwal6;
            t3.data.tailJadwal = jadwal6;
        }
        jadwal7.data.idJadwal = "14.0016.00akuntansi0431";
        jadwal7.data.idMatpel = "akuntansi0431";
        jadwal7.data.hari = "Jumat";
        jadwal7.data.jamMulai = "14.00";
        jadwal7.data.jamSelesai = "16.00";
        jadwal7.data.tanggal = "5-Februari-2020";
        t3.data.tailJadwal.next = jadwal7;
        t3.data.tailJadwal = jadwal7;
        matpel6.next = null;
        if(t3.data.headMatpel == null){
            t3.data.headMatpel = matpel6;
            t3.data.tailMatpel = matpel6;
        }
        matpel7.data.idMatpel = "geografi1024";
        matpel7.data.namaMatpel = "Geografi";
        jadwal8.data.idJadwal = "13.0015.00geografi1024";
        jadwal8.data.idMatpel = "geografi1024";
        jadwal8.data.jamMulai = "13.00";
        jadwal8.data.jamSelesai = "15.00";
        jadwal8.data.tanggal = "4-Februari-2020";
        jadwal8.data.hari = "Kamis";
        jadwal8.next = null;
        t3.data.tailJadwal.next = jadwal8;
        t3.data.tailJadwal = jadwal8;
        
        matpel7.next = null;
        t3.data.tailMatpel.next = matpel7;
        t3.data.tailMatpel = matpel7;
        tailTeacher.next = t3;
        tailTeacher = t3;
        
       
    }
    
    public static void inisialisasiPengambilanMatkul(){
        NodePengambilanMatpel ambil1 = new NodePengambilanMatpel();
        NodePengambilanMatpel ambil2 = new NodePengambilanMatpel();
        NodePengambilanMatpel ambil3 = new NodePengambilanMatpel();
        NodePengambilanMatpel ambil4 = new NodePengambilanMatpel();
        NodePengambilanMatpel ambil5 = new NodePengambilanMatpel();
        NodePengambilanMatpel ambil6 = new NodePengambilanMatpel();
        
        ambil1.data.idTeacher = "hartono1";
        ambil1.data.idStudent = "rremar2";
        ambil1.data.idMatpel = "fisika0112";
        ambil1.data.jadwal = "9.0011.00fisika0112";
        ambil1.next = null;
        if(headAmbil == null){
            headAmbil = ambil1;
            tailAmbil = ambil1;
        }
        ambil2.data.idTeacher = "hartono1";
        ambil2.data.idStudent = "rremar2";
        ambil2.data.idMatpel = "matematika0001";
        ambil2.data.jadwal = "11.0013.00matematika0001";
        ambil2.next = null;
        tailAmbil.next = ambil2;
        tailAmbil = ambil2;
        
        ambil3.data.idTeacher = "hartono1";
        ambil3.data.idStudent = "budi1";
        ambil3.data.idMatpel = "matematika0001";
        ambil3.data.jadwal = "11.0013.00matematika0001";
        ambil3.next = null;
        tailAmbil.next = ambil3;
        tailAmbil = ambil3;
        
        ambil4.data.idTeacher = "maman3";
        ambil4.data.idStudent = "budi1";
        ambil4.data.idMatpel = "akuntansi0431";
        ambil4.data.jadwal = "15.0017.00akuntansi0431";
        ambil4.next = null;
        tailAmbil.next = ambil4;
        tailAmbil = ambil4;
        
        ambil5.data.idTeacher = "lidya2";
        ambil5.data.idStudent = "budi1";
        ambil5.data.idMatpel = "sunda1113";
        ambil5.data.jadwal = "14.0016.00sunda1113";
        ambil5.next = null;
        tailAmbil.next = ambil5;
        tailAmbil = ambil5;
        
        ambil6.data.idTeacher = "lidya2";
        ambil6.data.idStudent = "bada3";
        ambil6.data.idMatpel = "jerman0213";
        ambil6.data.jadwal = "17.0019.00jerman0213";
        ambil6.next = null;
        tailAmbil.next = ambil6;
        tailAmbil = ambil6;
        
    }
    
    public static Admin inisialisasiAdmin(){
        Admin adm = new Admin();
        adm.biayaPerSatuMatpel = 150000;
        adm.Gaji = 100000;
        
        return adm;
    }
    
    public static void inisialisasiPenggajian(){
        NodePenggajian p1 = new NodePenggajian();
        NodePenggajian p2 = new NodePenggajian();
        NodePenggajian p3 = new NodePenggajian();
        NodePenggajian p4 = new NodePenggajian();
        
        p1.data.idTeacher = "hartono1";
        p1.data.gaji = 300000;
        p1.data.tanggal = 20;
        p1.data.bulan = 1;
        p1.data.tahun = 2020;
        p1.next = null;
        if(headGaji == null){
            headGaji = p1;
            tailGaji = p1;
        }
        
        p2.data.idTeacher = "hartono1";
        p2.data.gaji = 300000;
        p2.data.tanggal = 15;
        p2.data.bulan = 2;
        p2.data.tahun = 2020;
        p2.next = null;
        
        tailGaji.next = p2;
        tailGaji = p2;
        
        p3.data.idTeacher = "lidya2";
        p3.data.gaji = 200000;
        p3.data.tanggal = 15;
        p3.data.bulan = 1;
        p3.data.tahun = 2020;
        p3.next = null;
        tailGaji.next = p3;
        tailGaji = p3;
        
        p4.data.idTeacher = "maman3";
        p4.data.gaji = 100000;
        p4.data.tanggal = 15;
        p4.data.bulan = 1;
        p4.data.tahun = 2020;
        p4.next = null;
        tailGaji.next = p4;
        tailGaji = p4;
        
    }
    
    public static void cekJadwalStudent(String id){
            NodePengambilanMatpel p = headAmbil;
            NodeTeacher q = headTeacher;
            NodeStudent j = headStudent;
            NodeJadwal k = q.data.headJadwal;
            NodeMatpel l = q.data.headMatpel;
            boolean found = false;
            
                while (p != null) {
                    if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                        q = headTeacher;
                        while (q != null) {
                            if(q.data.idTeacher == null ? p.data.idTeacher == null : q.data.idTeacher.equals(p.data.idTeacher)){
                                System.out.println("Pengajar "+q.data.nameTeacher);
                                l = q.data.headMatpel;
                                while (l != null) {
                                    if(l.data.idMatpel == null ? p.data.idMatpel == null : l.data.idMatpel.equals(p.data.idMatpel)){
                                        System.out.println("Matkul: "+l.data.namaMatpel);
                                        k = q.data.headJadwal;
                                            while (k != null) {
                                                if(k.data.idJadwal == null ? p.data.jadwal == null : k.data.idJadwal.equals(p.data.jadwal)){
                                                    System.out.println(k.data.hari+", "+k.data.tanggal);
                                                    System.out.println(k.data.jamMulai+" - "+k.data.jamSelesai);
                                                    System.out.println("---------------------------");
                                                    k = k.next;
                                                }else{
                                                    k = k.next;
                                                }
                                            }
                                            l = l.next;
                                    }else{
                                        l = l.next;
                                    }
                                }
                                q = q.next;
                            }else{
                                q = q.next;
                            }
                        }
                        p = p.next;
                    }else{
                        p = p.next;
                    }
                }
                p = headAmbil;
                while (p != null && !found) {
                    if(p.data.idStudent == id){
                        found = true;
                    }else{
                        p = p.next;
                    }
                }
                
                if(!found){
                    System.out.println("Belum ada jadwal");
                    System.out.println("------------------");
                }
    }
    
    public static boolean validasiLogInStudent(String username,String password){
        NodeStudent p = headStudent;
        boolean found = false;
            while (p != null && !found) {
                if((p.data.username == null ? username == null : p.data.username.equals(username)) && (p.data.password == null ? password == null : p.data.password.equals(password))){
                    found = true;
                }else{
                    p = p.next;
                }
            }
        return(found);
    }
    
    public static boolean validasiLogInTeacher(String username,String password){
        NodeTeacher p = headTeacher;
        boolean found = false;
            while (p != null && !found) {
                if((p.data.nameTeacher == null ? username == null : p.data.nameTeacher.equals(username)) && (p.data.password == null ? password == null : p.data.password.equals(password))){
                    found = true;
                }else{
                    p = p.next;
                }
            }
            return(found);
    }
    
    public static String getIdStudent(String username,String password){
        NodeStudent p = headStudent;
        boolean found = false;
            while (p != null && !found) {
                if((p.data.username == null ? username == null : p.data.username.equals(username)) && (p.data.password == null ? password == null : p.data.password.equals(password))){
                    found = true;
                }else{
                    p = p.next;
                }
            }
        return(p.data.idStudent);
    }
    
    public static String getIdTeacher(String username,String password){
        NodeTeacher p = headTeacher;
        boolean found = false;
            while (p != null && !found) {
                if((p.data.nameTeacher == null ? username == null : p.data.nameTeacher.equals(username)) && p.data.password.equals(password)){
                    found = true;
                }else{
                    p = p.next;
                }
            }
        return(p.data.idTeacher);
    }
    
    public static void topUp(String idStudent, int nominalTopUp){
       NodeStudent p = headStudent;
        boolean found = false;
        while (p != null && !found) {
            if(p.data.idStudent == null ? idStudent == null : p.data.idStudent.equals(idStudent)){
                found = true;
            }else{
                p = p.next;
            }
        }
        p.data.saldo += nominalTopUp;
        System.out.println("Saldo kamu saat ini adalah Rp"+p.data.saldo);
    }
    
    public static int cekSaldo(String id){
        NodeStudent p = headStudent;
        boolean found = false;
        
        while (p != null && !found) {
            if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                found = true;
            }else{
                p = p.next;
            }
        }
        return(p.data.saldo);
    }
    
    public static String getNameStudent(String idStudent){
        String name = " ";
        boolean found = false;
        NodeStudent p = headStudent;
        while (p != null && !found) {
            if(p.data.idStudent == null ? idStudent == null : p.data.idStudent.equals(idStudent)){
                found = true;
                name = p.data.username;
            }else{
                p = p.next;
            }
        }
        return name;
    }
    
    public static void retrieveStudent(){
            NodeStudent p = headStudent;
            int i = 1;
            System.out.println("------------");
            System.out.println("Data Student");
            System.out.println("------------");
            while (p != null) {
                System.out.println(i+". "+p.data.username+" - "+p.data.noTelepon+" - "+p.data.email+" - "+p.data.idStudent);
                i++;
                p = p.next;
            }
    }
    
    public static boolean cekPembayaran(String id,int bulan,int tahun){
        NodePembayaran p = headPay;
        boolean found = false;
        while (p != null && !found) {
            if(p.data.bulan == bulan && p.data.tahun == tahun && (p.data.idStudent == null ? id == null : p.data.idStudent.equals(id))){
                found = true;
            }else{
                p = p.next;
            }
        }
            return (found);
        
        
    }
    
    public static void retrieveSemuaPembayaran(){
            NodePembayaran p = headPay;
            int i = 1;
            System.out.println("----------------");
            System.out.println("Daftar Transaksi");
            System.out.println("----------------");
            while (p != null) {
                System.out.println(i+". "+getNameStudent(p.data.idStudent)+" - "+p.data.tanggal+"-"+getMonth(p.data.bulan)+"-"+p.data.tahun+" - "+p.data.pay);
                i++;
                p = p.next;
            }
    }
    
    public static void retrieveTeacher(){
        NodeTeacher p = headTeacher;
            int i = 1;
            System.out.println("------------");
            System.out.println("Data Teacher");
            System.out.println("------------");
            System.out.println("No  Nama    idTeacher");
            while (p != null) {
                System.out.println(i+". "+getNameTeacher(p.data.idTeacher)+" - "+p.data.idTeacher);
                i++;
                p = p.next;
            }
    }
    
    public static String getNameTeacher(String id){
        String name = " ";
        boolean found = false;
        NodeTeacher p = headTeacher;
        while (p != null && !found) {
            if(p.data.idTeacher == null ? id == null : p.data.idTeacher.equals(id)){
                found = true;
                name = p.data.nameTeacher;
            }else{
                p = p.next;
            }
        }
        return name;
    }
    
    public static void aboutUs(){
        System.out.println("Bimbel Harapan Bangsa");
        System.out.println("Jl.Bubur Ayam Enak No.743");
        System.out.println("Telp 022-640244");
        System.out.println("Visi: Menghasilkan generasi-generasi unggulan");
        System.out.println("Misi : Mendidik para pelajar sesuai kurikulum yang up to date");
    }
    
    public static String getMonth(int bulan){
        String month="";
        switch (bulan) {
            case 1:
                month = "Januari";
                break;
            case 2:
                month = "Februari";
                break;
            case 3:
                month = "Maret";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "Mei";
                break;
            case 6:
                month = "Juni";
                break;
            case 7:
                month = "Juli";
                break;
            case 8:
                month = "Agustus";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "Oktober";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "Desember";
                break;
            default:
                throw new AssertionError();
        }
        return(month);
    }
    
    public static int cekBulanTertinggi(String id){
        NodePembayaran p = headPay;
        int bulanTerakhir = 0;
        while (p != null) {
            if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                if(bulanTerakhir < p.data.bulan){
                    bulanTerakhir = p.data.bulan;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return bulanTerakhir;
    }
    
    public static int cekTahunTertinggi(String id){
        NodePembayaran p = headPay;
        int tahunTerakhir = 0;
        while (p != null) {
            if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                if(tahunTerakhir < p.data.tahun){
                    tahunTerakhir = p.data.tahun;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return tahunTerakhir;
    }
    public static void historyPembayaranPerStudent(String id){
        NodePembayaran p = headPay;
        int i = 1;
        System.out.println("History Pembayaran");
        while (p != null) {
            if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                System.out.println(i+". "+p.data.tanggal+" - "+getMonth(p.data.bulan)+" - "+p.data.tahun+" - "+p.data.pay);
                p = p.next;
            }else{
                p = p.next;
            }
        }
    }
    
    public static void pembayaranBimbel(String id, int tanggal, int bulan, int tahun, int total){
        NodePembayaran p = new NodePembayaran();
        p.data.idStudent = id;
        p.data.tanggal = tanggal;
        p.data.bulan = bulan;
        p.data.tahun = tahun;
        p.data.pay = total;
        tailPay.next = p;
        tailPay = p;
        System.out.println("Pembayaran berhasil!! Terima Kasih");
    }
    
    public static int hitungPengambilanMatpel(String id){
        NodePengambilanMatpel p = headAmbil;
        int pengambilanMatpel = 0;
        while (p != null) {
            if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                pengambilanMatpel++;
                p = p.next;
            }else{
                p = p.next;
            }
        }
        return pengambilanMatpel;
    }
    
    public static void inisialisasi(){
        inisialisasiAdmin();
        inisialisasiStudents();
        inisialisasiTeacher();
        inisialisasiPengambilanMatkul();
        inisialisasiPembayaran();
        inisialisasiPenggajian();
    }
    
    public static void penguranganSaldo(String id, int biaya){
        NodeStudent p = headStudent;
        boolean found = false;
        
        while (p != null && !found) {
            if(p.data.idStudent == null ? id == null : p.data.idStudent.equals(id)){
                found = true;
            }else{
                p = p.next;
            }
            
        }
            p.data.saldo = p.data.saldo - biaya;
        
        System.out.println("Saldo kamu sekarang Rp"+p.data.saldo);
    }
    
    public static void pengambilanMatpel(String id){
        int pilihGuru, pilihMatpel, pilihJadwal;
        boolean foundGuru = false;
        boolean foundMatpel = false;
        boolean foundJadwal = false;
        NodeTeacher t = headTeacher;
        NodeMatpel m = t.data.headMatpel;
        NodeJadwal s = t.data.headJadwal;
        int i = 1;
        int j = 1;
        int k = 1;
        
        while (t != null) {
            System.out.println("----------------");
            System.out.println(i+". Nama Pengajar: "+t.data.nameTeacher);
            System.out.println("----------------");
            m = t.data.headMatpel;
            j = 1;
            while (m != null) {
                System.out.println("    "+j+". Nama Mata Pelajaran: "+m.data.namaMatpel);
                System.out.println("        --Jadwal--");
                k = 1;
                s = t.data.headJadwal;
                while (s != null) {
                    if(m.data.idMatpel == null ? s.data.idMatpel == null : m.data.idMatpel.equals(s.data.idMatpel)){
                        System.out.println("        "+k+". "+s.data.jamMulai+" - "+s.data.jamSelesai+"("+s.data.hari+","+s.data.tanggal+")");
                        s = s.next;
                        k++;
                    }else{
                        s = s.next;
                    }
                }
                m = m.next;
                j++;
            }
            t = t.next;
            i++;
        }
        
        System.out.print("Masukkan angka untuk memilih guru: ");
        pilihGuru = scan.nextInt();
        System.out.print("Masukkan angka untuk memilih Matpel: ");
        pilihMatpel = scan.nextInt();
        System.out.print("Masukkan angka untuk memilih Jadwal: ");
        pilihJadwal = scan.nextInt();
        
        t = headTeacher;
        m = t.data.headMatpel;
        s = t.data.headJadwal;
        i = 1;
        j = 1;
        k = 1;
        while (t != null && !foundGuru) {
            if(i == pilihGuru){
                m = t.data.headMatpel;
                while (m != null && !foundMatpel) {
                    if(j == pilihMatpel){
                        s = t.data.headJadwal;
                        while (s != null && !foundJadwal) {
                            if(s.data.idMatpel == null ? m.data.idMatpel == null : s.data.idMatpel.equals(m.data.idMatpel)){
                                if(k == pilihJadwal){
                                    foundJadwal = true;
                                }else{
                                    k++;
                                    s = s.next;
                                }
                            }else{
                                s = s.next;
                            }
                        }
                        foundMatpel = true;
                    }else{
                        j++;
                        m = m.next;
                    }
                }
                foundGuru = true;
            }else{
                i++;
                t = t.next;
            }
        }
        NodePengambilanMatpel pm = new NodePengambilanMatpel();
        pm.data.idMatpel = m.data.idMatpel;
        pm.data.idStudent = id;
        pm.data.idTeacher = t.data.idTeacher;
        pm.data.jadwal = s.data.idJadwal;
        pm.next = null;
        tailAmbil.next = pm;
        tailAmbil = pm;
    }
    
    public static void penguranganMatpel(String id){
        NodePengambilanMatpel pm = headAmbil;
        boolean foundAmbil = false;
        int i = 0, choice;
        
        while (pm != null) {
            if(pm.data.idStudent == null ? id == null : pm.data.idStudent.equals(id)){
                System.out.println((i+1)+". "+pm.data.idMatpel);
                pm = pm.next;
                i++;
            }else{
                pm = pm.next;
            }
        }
        
        if(i==0){
            System.out.println("Belum ada mata pelajaran yang diambil!!");
            System.out.println("---------------------------------------");
        }else{
            System.out.print("Masukkan urutan matpel yang mau di hapus");
            choice = scan.nextInt();

            pm = headAmbil;
            NodePengambilanMatpel temp = new NodePengambilanMatpel();
            i = 1;
            while (pm != null && !foundAmbil) {
                if(pm.data.idStudent == null ? id == null : pm.data.idStudent.equals(id)){
                    if(choice == i){
                        foundAmbil = true;
                    }else{
                        i++;
                        temp = pm;
                        pm = pm.next;
                    }
                }else{
                    temp = pm;
                    pm = pm.next;
                }
            }
            System.out.println(pm.data.idMatpel+" telah dihapus dari jadwal pembelajaran");
            if(pm == headAmbil && pm == tailAmbil){
                headAmbil = null;
                tailAmbil = null;
                pm = null;
            }else if(pm == headAmbil){
                headAmbil = pm.next;
                pm = null;
            }else if(pm == tailAmbil){
                tailAmbil = temp;
                pm = null;
            }else{
                temp.next = pm.next;
                pm = null;
            }
        }
        
    }
    
    public static void perubahanMataPelajaran(String idStudent){
        int choice = 0;
        while (choice != 3) {
            System.out.println("1.Nambah Mata pelajaran");
            System.out.println("2.Ngurangin Mata Pelajaran");
            System.out.println("3.Exit");
            System.out.print("--->");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    pengambilanMatpel(idStudent);
                    break;
                case 2:
                    penguranganMatpel(idStudent);
                    break;
            }
        }
    }
    
    public static void retrieveJadwal(){
            NodeTeacher p = headTeacher;
            NodeJadwal j = p.data.headJadwal;
            NodeMatpel m = p.data.headMatpel;
            int i = 1;

            System.out.println("--Jadwal--");
            while (p != null ) {
                System.out.println(i+". "+p.data.nameTeacher);
                m = p.data.headMatpel;
                while (m != null) {
                        System.out.println("Matkul : "+m.data.namaMatpel);
                        j = p.data.headJadwal;
                        while (j != null) {
                            if(m.data.idMatpel == null ? j.data.idMatpel == null : m.data.idMatpel.equals(j.data.idMatpel)){
                                System.out.println("    "+j.data.hari+", "+j.data.tanggal);
                                System.out.println("    Waktu: "+j.data.jamMulai+" - "+j.data.jamSelesai);
                                System.out.println("----------------------");
                                j = j.next;
                            }else{
                                j = j.next;
                            }
                        }
                        m = m.next;
                    }
                p = p.next;
                i++;
                }
    }
    
    public static void register(int i, String username, String password){
        String noTelp,email,topup;
        int topupSaldo;
        NodeStudent stdnt = tailStudent;
        NodeStudent s = new NodeStudent();
        
        System.out.print("Masukkan email: ");
        email = scan.next();
        System.out.print("Masukkan no telepon: ");
        noTelp = scan.next();
        System.out.print("Mau topup saldo sekarang?(y/n) ");
        topup = scan.next();
        if("n".equals(topup)){
            s.data.idStudent = username+i;
            s.data.username = username;
            s.data.password = password;
            s.data.noTelepon = noTelp;
            s.data.email = email;
            s.data.saldo = 0;
            s.next = null;
            tailStudent.next = s;
            tailStudent = s;
            System.out.println("---Data Murid Baru---");
            System.out.println(s.data.username+" - "+s.data.noTelepon+" - "+s.data.email+" - mendapat id: "+s.data.idStudent);
            
        }else if("y".equals(topup)){
            System.out.print("Mau topup berapa? ");
            topupSaldo = scan.nextInt();
            s.data.idStudent = username+i;
            s.data.username = username;
            s.data.password = password;
            s.data.noTelepon = noTelp;
            s.data.email = email;
            s.next = null;
            tailStudent.next = s;
            tailStudent = s;
            System.out.println("---Data Murid Baru---");
            System.out.println(s.data.username+" - "+s.data.noTelepon+" - "+s.data.email+" - mendapat id: "+s.data.idStudent);
            s.data.saldo = topupSaldo;
        }
        
    }
    
    public static void jadwalMengajar(String id){
        NodeTeacher p = headTeacher;
            NodeJadwal j = p.data.headJadwal;
            NodeMatpel m = p.data.headMatpel;

            System.out.println("--Jadwal--");
            while (p != null ) {
                if(p.data.idTeacher == null ? id == null : p.data.idTeacher.equals(id)){
                    m = p.data.headMatpel;
                    while (m != null) {
                            System.out.println("Matkul : "+m.data.namaMatpel);
                            j = p.data.headJadwal;
                            while (j != null) {
                                if(m.data.idMatpel == null ? j.data.idMatpel == null : m.data.idMatpel.equals(j.data.idMatpel)){
                                    System.out.println("    "+j.data.hari+", "+j.data.tanggal);
                                    System.out.println("    Waktu: "+j.data.jamMulai+" - "+j.data.jamSelesai);
                                    System.out.println("----------------------");
                                    j = j.next;
                                }else{
                                    j = j.next;
                                }
                            }
                            m = m.next;
                        }
                    p = p.next;
                }else{
                    p = p.next;
                }
            }
        
        
    }
    
    public static void printDataStudent(String idStudent){
        NodeStudent p = headStudent;
        boolean found = false;
        
        while (p != null && !found) {
            if(p.data.idStudent == null ? idStudent == null : p.data.idStudent.equals(idStudent)){
                found = true;
            }else{
                p = p.next;
            }
        }
        
        System.out.println(p.data.username+"     "+p.data.noTelepon+"     "+p.data.email);
    }
    
    public static void retrieveMuridYangDiajar(String id){
        NodePengambilanMatpel pm = headAmbil;
        String nama="";
        int i = 1;
        
        System.out.println("---Daftar Murid yang di ajar "+getNameTeacher(id)+"---");
        System.out.println("No  Nama        NoTelepon   Email");
        while (pm != null) {
            if(pm.data.idTeacher == null ? id == null : pm.data.idTeacher.equals(id)){
                if(getNameStudent(pm.data.idStudent) == null ? nama == null : getNameStudent(pm.data.idStudent).equals(nama)){
                    pm = pm.next;
                }else{
                    nama = getNameStudent(pm.data.idStudent);
                    System.out.print(i+". ");
                    printDataStudent(pm.data.idStudent);
                    pm = pm.next;
                    i++;
                }
            }else{
                pm = pm.next;
            }
        }
        System.out.println("--------------");
    }
    
    public static void perubahanJadwal(String id){
        NodeTeacher t = headTeacher;
        NodeJadwal j = t.data.headJadwal;
        NodeMatpel m = t.data.headMatpel;
        int i = 1;
        int f = 1;
        int k = 1;
        int choiceMatpel, choiceJadwal; 
        String tanggal, jamMulai, jamSelesai, hari;
        boolean foundMatpel= false, foundJadwal = false;
        
        while (t != null ) {
            if(t.data.idTeacher == null ? id == null : t.data.idTeacher.equals(id)){
                m = t.data.headMatpel;
                while (m != null) {
                    System.out.println(i+". "+m.data.namaMatpel);
                    j = t.data.headJadwal;
                    f = 1;
                    while (j != null) {
                        if(m.data.idMatpel == null ? j.data.idMatpel == null : m.data.idMatpel.equals(j.data.idMatpel)){
                            System.out.println("    "+f+". Tanggal: "+j.data.hari+", "+j.data.tanggal);
                            System.out.println("         Waktu: "+j.data.jamMulai+" - "+j.data.jamSelesai);
                            j = j.next;
                            f++;
                        }else{
                            j = j.next;
                        }
                    }
                    m = m.next;
                    i++;
                }
                t = t.next;
            }else{
                t = t.next;
            }
        }
        
        System.out.print("Matpel keberapa yang akan diubah: ");
        choiceMatpel = scan.nextInt();
        System.out.print("Jadwal yang mana? ");
        choiceJadwal = scan.nextInt();
        
        
        t = headTeacher;
        m = t.data.headMatpel;
        j = t.data.headJadwal;
        i = 1;
        f = 1;
        while (t != null ) {
            if(t.data.idTeacher == null ? id == null : t.data.idTeacher.equals(id)){
                    m = t.data.headMatpel;
                    while (m != null && !foundMatpel) {
                        if(choiceMatpel == i){
                            j = t.data.headJadwal;
                            f = 1;
                            while (j != null && !foundJadwal) {
                                if(m.data.idMatpel == null ? j.data.idMatpel == null : m.data.idMatpel.equals(j.data.idMatpel)){
                                    if(choiceJadwal == f){
                                        foundJadwal = true;
                                    }else{
                                        j = j.next;
                                        f++;
                                    }
                                }else{
                                    j = j.next;
                                }
                            }
                            foundMatpel = true;
                        }else{
                            m = m.next;
                            i++;
                        }
                    }
                t = t.next;
            }else{
                t = t.next;
            }
        }
        
        System.out.print("Masukkan tanggal yang baru: ");
        tanggal = scan.next();
        System.out.print("Masukkan hari: ");
        hari = scan.next();
        System.out.print("Masukkan Jam Mulai: ");
        jamMulai = scan.next();
        System.out.print("Masukkan Jam Selesai: ");
        jamSelesai = scan.next();
        
        j.data.hari = hari;
        j.data.jamMulai = jamMulai;
        j.data.jamSelesai = jamSelesai;
        j.data.tanggal = tanggal;
        
        System.out.println("--Jadwal telah berhasil diganti!--");
    }
    
    public static void penggajianTeacher(int gaji){
        int tanggal, bulan, tahun, totalGaji = 0, choiceTeacher, i;
        boolean foundTeacher = false;
        int murid = 0;
        
        retrieveTeacher();
        
        System.out.print("Urutan keberapa yang akan di gaji? ");
        choiceTeacher = scan.nextInt();
        
        i=1;
        NodeTeacher t = headTeacher;
        while (t != null && !foundTeacher) {
            if(choiceTeacher == i){
                foundTeacher = true;
            }else{
                t = t.next;
                i++;
            }
        }
        NodePengambilanMatpel pm = headAmbil;
        
        while (pm != null) {
            if(pm.data.idTeacher == null ? t.data.idTeacher == null : pm.data.idTeacher.equals(t.data.idTeacher)){
                murid++;
                pm = pm.next;
            }else{
                pm = pm.next;
            }
        }
        
        System.out.print("Penggajian bulan berapa? ");
        bulan = scan.nextInt();
        System.out.print("Tahun? ");
        tahun = scan.nextInt();
        
        if(tahun<2020){
            System.out.println("Sekarang sudah tahun 2020");
        }else if(cekPenggajian(t.data.idTeacher, bulan, tahun)){
            System.out.println("Sudah digaji!!");
        }else if(cekTahunTertinggiTeacher(t.data.idTeacher)>tahun){
            System.out.println("sudah digaji");
        }else if(cekBulanTertinggiTeacher(t.data.idTeacher)>bulan){
            System.out.println("Sudah digaji");
        }else{
            System.out.print("Tanggal berapa? ");
            tanggal = scan.nextInt();
            if(tahun>2020){
                    totalGaji = gaji*murid*(12-cekBulanTertinggiTeacher(t.data.idTeacher)+bulan);
                    NodePenggajian p = new NodePenggajian();
                    p.data.idTeacher = t.data.idTeacher;
                    p.data.gaji = totalGaji;
                    p.data.tanggal = tanggal;
                    p.data.bulan = bulan;
                    p.data.tahun = tahun;
                    p.next = null;

                    tailGaji.next = p;
                    tailGaji = p;
                }else{
                    totalGaji = gaji*murid*(bulan - cekBulanTertinggiTeacher(t.data.idTeacher));
                    NodePenggajian p = new NodePenggajian();
                    p.data.idTeacher = t.data.idTeacher;
                    p.data.gaji = totalGaji;
                    p.data.tanggal = tanggal;
                    p.data.bulan = bulan;
                    p.data.tahun = tahun;
                    p.next = null;

                    tailGaji.next = p;
                    tailGaji = p;
                }
                    System.out.println("------------------------------------------");
                    System.out.println("Gaji perBulan "+gaji);
                    System.out.println(getNameTeacher(tailGaji.data.idTeacher)+" memiliki murid sebanyak "+murid);
                    System.out.println("    Gaji telah diterima Rp"+tailGaji.data.gaji+" pada tanggal "+tailGaji.data.tanggal+" - "+getMonth(tailGaji.data.bulan)+" - "+tailGaji.data.tahun);
                    System.out.println("------------------------------------------");
            }
    }
    
    public static int cekBulanTertinggiTeacher(String id){
        NodePenggajian p = headGaji;
        int bulan = 1;
        while (p != null) {
            if(p.data.idTeacher == null ? id == null : p.data.idTeacher.equals(id)){
                if(p.data.bulan>bulan){
                    bulan = p.data.bulan;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return bulan;
    }
    
    public static int cekTahunTertinggiTeacher(String id){
        NodePenggajian p = headGaji;
        int tahun = 0;
        while (p != null) {
            if(p.data.idTeacher == null ? id == null : p.data.idTeacher.equals(id)){
                if(tahun<p.data.tahun){
                    tahun = p.data.tahun;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return tahun;
    }
    
    public static boolean cekPenggajian(String id, int bulan, int tahun){
        NodePenggajian p = headGaji;
        boolean found = false;
        while (p != null && !found) {
            if(p.data.bulan == bulan && p.data.tahun==tahun && (p.data.idTeacher == null ? id == null : p.data.idTeacher.equals(id))){
                found = true;
            }else{
                p = p.next;
            }
        }
        return found;
    }
    public static void cekGajiSatuTeacher(String idTeacher){
        NodePenggajian p = headGaji;
        int i = 1;
        System.out.println("Data gaji "+getNameTeacher(idTeacher));
        while (p != null) {
            if(p.data.idTeacher == null ? idTeacher == null : p.data.idTeacher.equals(idTeacher)){
                System.out.println(i+". "+getNameTeacher(idTeacher)+" - "+p.data.tanggal+" - "+getMonth(p.data.bulan)+" - "+p.data.tahun+" - Rp"+p.data.gaji);
                i++;
                p = p.next;
            }else{
                p = p.next;
            }
        }
    }
    
    public static void retrieveSemuaGaji(){
        NodePenggajian p = headGaji;
        int i = 1;
        System.out.println("Data gaji semua guru");
        while (p != null) {
            System.out.println(i+". "+getNameTeacher(p.data.idTeacher)+" - "+p.data.tanggal+" - "+getMonth(p.data.bulan)+" - "+p.data.tahun+" - "+p.data.gaji);
            i++;
            p = p.next;
        }
        
    }
    
}
