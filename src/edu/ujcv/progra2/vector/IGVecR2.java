package edu.ujcv.progra2.vector;
public class IGVecR2 {
    private double x;
    private double y;
    public IGVecR2(){
        this.x=0;
        this.y=0;
    }
    public IGVecR2(double x,double y){
        this.x=x;
        this.y=y;
    }
    public IGVecR2 (IGVecR2 b){
        this.x=b.x;
        this.y=b.y;
    }
    public IGVecR2 suma(IGVecR2 b){
      IGVecR2  Resul = new IGVecR2();
        Resul.x = x + b.x;
        Resul.y= y+ b.y;
        return Resul;
        //TODO: implementar
    }
    public IGVecR2 resta(IGVecR2 b){
        IGVecR2 Resul  = new IGVecR2();
        Resul.x = x - b.x;
        Resul.y= y - b.y;
        return Resul;
        //TODO: implementar
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        IGVecR2 Resul = new IGVecR2();
        Resul.x = alpha * x;
                Resul.y= alpha *y;

      return Resul;
      //TODO: implementar
    }

    public double productoPunto(IGVecR2 b){
        IGVecR2 Resul= new IGVecR2();
        Resul.x = x*b.x;
        Resul.y = y *b.y;
        double a = Resul.x = Resul.y;
        return a;
        //TODO: implementar
    }
    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){
    //}

    public double angulo(IGVecR2 b){
        IGVecR2 Resul = new IGVecR2();
        Resul.x = x*b.x;
        Resul.y = y *b.y;
        double a = Resul.x + Resul.y;
        double c= Math.sqrt(((Math.pow(b.x,2)+Math.pow(b.y,2))));
        double f=  Math.sqrt(((Math.pow(x,2)+Math.pow(y,2))));
        double d=Math.toDegrees(Math.acos((a/(c*f))));
        return d;
        //TODO: implementar
    }
    public double magnitud(IGVecR2 b){
        IGVecR2 Resul = new IGVecR2();
        Resul.x = (b.x)-x;
        Resul.y = (b.y)-y;
        double a = Math.pow(Resul.x, 2)+ Math.pow(Resul.y,2);
        return Math.sqrt(a);
    }

//    privado los datos
//     un escalar que represente 'x' y 'y' los componentes del vector
//contencion
//     publico los constructores por defecto, copia, y conveniencia, recuerden a bob
//     publico accesoras y mutadoras
//    publico interfase
//    this es el vector a
//     c.x = a.x + b.x
//     c.y = a.y + b.y
public double getY() {
        return y;
        }

public void setY(double y) {
        this.y = y;
        }


public double getX() {
        return x;
        }

public void setx(double x) {
        this.x = x;
        }
}

