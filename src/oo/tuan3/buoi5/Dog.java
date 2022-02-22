/*
*  created date: Feb 22, 2022
*  author: cgm
*/
package oo.tuan3.buoi5;

public class Dog {

    //attribute - data - field
    private int size; //implementation
    /**default - mặc định */ String name;//interface
    /**default - mặc định */ public String breed;//interface

    //methods
    //interface
    public void setSize(int size){
        //viết code để ràng buộc size không bao giờ được âm
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("Size unvalid (không hợp lệ)!!");
        }
        
    }

    //interface
    public int getSize(){
        return this.size;
    }
    
}
