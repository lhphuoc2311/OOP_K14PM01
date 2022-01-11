/*
*  created date: Jan 11, 2022
*  author: cgm
*/
package structured;

import java.util.Scanner;

public class BankStructured {
    // toan cuc: global
    static int account_number = 12345;
    static int account_banlance = 0;
    static Scanner input;


    //data Employee
    static String emName;// ten nhan vien
    static double salary;//luong

    //data Customer

    static String cusName;// ten khach
    static String address;//dia chi

    public static void main(String[] args) {
        // data:
        // khai bao 2 bien local: cuc bo
        // data Employee
        // data Customer
        // hanh dong thao tac len data

        input = new Scanner(System.in);

        // show
        show();//make function call
        depoist();
        withdraw();

    }

    static void withdraw() {
        System.out.print("Nhap vao so tien can rut > ");
        int withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;// thao tac len data
        // account_banlance = account_banlance - withdrawAmount;
    }

    static void depoist() {
        // gui tien: deposit
        System.out.print("Nhap vao so tien gui > ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount;// thao tac len data
    }

    static void show() {
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);
    }

    static void getEmName(){

        emName = "";
        cusName = "ABC";//ko duoc quyen dung cham den du lieu cua Cusomter
    }

    static void getSalary(){
        salary = 500;
    }

    static String getCusInfo(){//Khach hang cusomter
        account_banlance = 0;// VO TINH HAY CO Y THAO TAC TEN DU LIEU MA DANG LE FUNCTION KHONG DUOC/NEN DUNG CHAM DEN CAI DATA DO
        return cusName + address;
    }


}
