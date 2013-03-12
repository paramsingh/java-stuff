public class Personal {
    String Name, Pan;
    double basic_pay;
    int acc_no;
    Personal(String n, String p, double b, int a) {
        //parametrized constructor
        Name = n;
        Pan = p;
        basic_pay = b;
        acc_no = a;
    }
    void display(){
        System.out.println("Name : "+Name);
        System.out.println("PAN Number : "+Pan);
        System.out.println("Basic pay : "+basic_pay);
        System.out.println("Account Number : "+acc_no);
    }
}
        
