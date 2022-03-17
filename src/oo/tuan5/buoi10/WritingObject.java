/*
*  created date: Mar 17, 2022
*  author: cgm
*/
package oo.tuan5.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import oo.tuan4.buoi8.HangThucPham;

public class WritingObject {

    public static void main(String[] args) throws IOException {
        //1.
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //2.
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //HangThucPham
        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(), new Date());

        HangThucPham htp2 = new HangThucPham("HTP02", "Mi Gau Do ", 4_000, new Date(), new Date());

        //3.
        objOut.writeObject(htp);
        objOut.writeObject(htp2);

        System.out.println(htp);

        //4. 
        objOut.close();
    }
    
}
