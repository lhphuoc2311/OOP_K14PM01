/*
*  created date: Jan 11, 2022
*  author: cgm
*/
package oo;

public class AccountTestDrive {
    public static void main(String[] args) {
        //Bien tham chieu doi tuong
        Account account;

        account = new Account();

        account.show();
        account.depoist();
        account.show();

        account.withdraw();
        account.show();
    }
    
}
