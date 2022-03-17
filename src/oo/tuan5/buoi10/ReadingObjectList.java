/*
*  created date: Mar 17, 2022
*  author: cgm
*/
package oo.tuan5.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import oo.tuan4.buoi8.HangThucPham;

public class ReadingObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.
        FileInputStream inFile = new FileInputStream("data.dat");

        //2.
        ObjectInputStream objIn = new ObjectInputStream(inFile);

        //3. Read Object stream
       List<HangThucPham> list = (List) objIn.readObject();

       for (HangThucPham hangThucPham : list) {
           if(hangThucPham.getTenHang().trim().equalsIgnoreCase("Mi Gau Do"))
                System.out.println(hangThucPham);
       }

       objIn.close();
    }
    
}
