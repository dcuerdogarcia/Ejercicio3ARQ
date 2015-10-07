/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class CopyBytesImaxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    FileInputStream entrada = new FileInputStream("/home/oracle/Desktop/foto.jpg");
        FileOutputStream fsalida = new FileOutputStream("/home/oracle/Desktop/foto2.jpg", true);
        BufferedInputStream Entrada2 = new BufferedInputStream(entrada);
        BufferedOutputStream Salida2 = new BufferedOutputStream(fsalida);
        /*     int b = fregis.read();
         while (b != -1) {
         fsalida.write(b);
         b = fregis.read();

         }

         fsalida.flush();
         fsalida.close();
         fregis.close();

         */

        int b1 = Entrada2.read();
        while (b1 != -1) {
            Salida2.write(b1);
            b1 = Entrada2.read();

        }

        Salida2.flush();
        Salida2.close();
        Entrada2.close();

    }
}