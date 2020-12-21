


/**
 *
 * @author gabbo
 */
public class Triangolo {
    protected double l1;
    protected double l2;
    protected double l3;
    

    public Triangolo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
     
    }
    public String getType(){
    String type = "scaleno";
        if(l1 == l2){
        type = "isoscele";
        if(l2 == l3){
        type = "equilatero";
        }
        }else if(l2 == l3){
        type = "isoscele";
        }
        if(l1*l1+l2*l2 == l3*l3){
        type= "rettangolo";
        }else if(l2*l2+l3*l3 == l1*l1){
        type= "rettangolo";
        }else if(l1*l1+l3*l3 == l2*l2){
        type= "rettangolo"; }
        return type;
    
    }
    public double getPerimetro(){
        return l1+l2+l3;
    }
    
    public double getArea(){
    double s=(l1+l2+l3)/2;
        return Math.sqrt(s*((s-l1)*(s-l2)*(s-l3)));
    }
}
