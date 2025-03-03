package Newpackage;

public class Customer {
    private int cid;
    private String cname;
    private static String bank="SBI";
    private Account account;

    public Customer(int cid,String cname,Account account){
        this.cid=cid;
        this.cname=cname;
        this.account=account;

    }
    public void disp(){
        System.out.println(cid+" "+cname+" "+bank);
        account.getAccountDetails();
    }

    public static void main(String[] args) {
        Account a1=new Account(1122,"Savings",10000);
        Customer c1=new Customer(11,"rohit",a1);
        c1.disp();

    }
}
