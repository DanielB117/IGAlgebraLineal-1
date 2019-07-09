package edu.ujcv.progra2.vector;
public class IGVecR3 {
    private double x;
    private double y;
    private double z;
    public IGVecR3(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public IGVecR3(double x,double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public IGVecR3 (IGVecR3 b){
        this.x=b.x;
        this.y=b.y;
        this.z=b.z;
    }
    public IGVecR3 suma(IGVecR3 b){
        IGVecR3  Resul = new IGVecR3();
        Resul.x = x + b.x;
        Resul.y= y + b.y;
        Resul.z= z + b.z;
        return Resul;
        //TODO: implementar
    }
    public IGVecR3 resta(IGVecR3 b){
        IGVecR3  Resul = new IGVecR3();
        Resul.x = x - b.x;
        Resul.y= y - b.y;
        Resul.z= z - b.z;
        return Resul;
        //TODO: implementar
    }
    //producto.
    public  IGVecR3 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR3();
    }
    public double productoPunto(IGVecR3 b){
        IGVecR3 Resul = new IGVecR3();
        Resul.x = x*b.x;
        Resul.y = y*b.y;
        Resul.z = z*b.z;
        double a = Resul.x + Resul.y + Resul.z;
        return a;

        //TODO: implementar

    }
    public IGVecR3 productoCruz(IGVecR3 b){
        IGVecR3 Resul = new IGVecR3();
        Resul.x=(b.z*y)-(b.y*z);
        Resul.y=(b.x*z)-(b.z*x);
        Resul.z=(b.y*x)-(b.x*y);

        return Resul;
    }
    public double determinante(){
        //TODO: implementar
        return 0.0;
    }
    public double angulo(IGVecR3 b){
        //TODO: implementar
        return 0.0;
    }
    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
