/*
*  created date: Jan 11, 2022
*  author: cgm
*/
package non_structured;

import java.util.Scanner;

public class Bank_NonStructured {

    public static void main(String[] args) {
        
        //data:
        //khai bao 2 bien
        int account_number = 12345;
        int account_banlance = 0;

        //data Employee


        //data Customer

        //hanh dong thao tac len data
        Scanner input;
        input = new Scanner(System.in);

        //gui tien: deposit
        System.out.print("Nhap vao so tien gui > ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount;// thao tac len data

        //show
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);


        //rut tien; withdraw
        System.out.print("Nhap vao so tien can rut > ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;// thao tac len data
        //account_banlance = account_banlance - withdrawAmount;
        //show
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);


        //rut tien; withdraw
        System.out.print("Nhap vao so tien can rut > ");
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;// thao tac len data
        //account_banlance = account_banlance - withdrawAmount;
        //show
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);


        //rut tien; withdraw
        System.out.print("Nhap vao so tien can rut > ");
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;// thao tac len data
        //account_banlance = account_banlance - withdrawAmount;
        //show
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);


        //Employee: hanh dong thao len data của Employee



        //Customer: hanh dong thao len data của Customer
        



    }
    
}
