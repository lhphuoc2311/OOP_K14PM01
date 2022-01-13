/*
*  created date: Jan 13, 2022
*  author: cgm
*/
package oo;

public class BankTestDrive {

    public static void main(String[] args) {
        
        
        //nhân viên
        Employee employee;

        employee = new Employee();
        employee.getEmName();
        employee.getSalary();

        
        //khách hàng
        Customer customer = new Customer();
        customer.getAddress();
        customer.getPhone();

        //Tiền

        Account account = new Account();
        account.show();








    }
    
}
