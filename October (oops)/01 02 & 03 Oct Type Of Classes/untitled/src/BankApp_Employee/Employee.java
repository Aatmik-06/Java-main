package BankApp_Employee;

public class Employee {
    public String name;
    String addr;
    int cust_id=0;

    public int gen_customer_id(String cust_name){
        if (cust_name.equals("")){
            return 0;
        }
        else {
            cust_id++;
        }
    }


}
