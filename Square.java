package lab22;
public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    public double getDiagonalLength() {
        return Math.sqrt(2) * side;
    }
    public boolean equals(Object obj) {
        boolean r = false;
        if(obj == null){
           return r;  
        }
        if ( obj instanceof Square ){
            Square obj1 = (Square) obj;
            if ( getArea()==obj1.getArea()) r = true;
        }
       return r;
   }
}
