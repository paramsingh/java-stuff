class Circle {
    double radius;
    Circle(){
        radius = 0;
    }
    Circle(double r){
        radius = r;
    }
    double findArea(){
        return 3.14* radius * radius;
    }
    double findCircumference(){
        return 2*3.14*radius;
    }
}
