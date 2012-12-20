class Cylinder extends Circle {
    double height;
    Cylinder(){
        super();
        height = 0;
    }
    Cylinder( double r, double h ){
        super(r);
        height = h;
    }
    double findCSA(){
        //returns curved surface area of the cylinder
        return 2*3.14*radius*height;
    }
    double findTotalArea(){
        return findArea() + findCSA();
    }
    public static void main(String[] args){
        Cylinder a = new Cylinder(5,10);
        System.out.println("Base area = "+ a.findArea()+" sq.units");
        System.out.println("Curved Surface Area = "+ a.findCSA()+" sq.units") - ;
        System.out.println("Total Area = "+a.findTotalArea()+" sq.units");
    }
}   
