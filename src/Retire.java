class Retire extends Personal {
    int Yrs;
    double Pf,Grat;
    Retire( String n, String p, double b, int a, int y){
        //using super() to call constructor of previous class
        super(n,p,b,a);
        Yrs = y;
    }
    void provident(){
        //calculate pf
        Pf = 0.02*basic_pay*Yrs;
    }        
    void gratuity(){
        if( Yrs>=10 ){
            Grat = 12*basic_pay;
        }
        else
            Grat = 0;
    }
    void display1(){
        //cal display() of previous class
        display();
        System.out.println("Years: "+y);
        System.out.println(Pf);
        System.out.println(Grat);
    }
}
        
