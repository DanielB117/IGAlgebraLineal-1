package edu.ujcv.progra2.vector;

public class IGVecR4 {
    private double x;
    private double y;
    private double z;
    private double w;

    public IGVecR4(){
        this.x=0;
        this.y=0;
        this.z=0;
        this.w=0;
    }

    public IGVecR4(double x,double y, double z,double w){
        this.x=x;
        this.y=y;
        this.z=z;
        this.w=0;
    }
    public IGVecR4 (IGVecR4 b){
        this.x=b.x;
        this.y=b.y;
        this.z=b.z;
        this.w=b.w;
    }









    
    public IGVecR4 suma(IGVecR4 b){
        IGVecR4  Resul = new IGVecR4();
        Resul.x = x + b.x;
        Resul.y= y + b.y;
        Resul.z= z + b.z;
        Resul.w= w + b.w;
        return Resul;
        //TODO: implementar
    }

    public IGVecR4 resta(IGVecR4 b){
        IGVecR4  Resul = new IGVecR4();
        Resul.x = x - b.x;
        Resul.y= y - b.y;
        Resul.z= z - b.z;
        Resul.w= w -b.w;
        return Resul;
        //TODO: implementar
    }











    //producto.
    public  IGVecR4 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR4();
    }

    public double productoPunto(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
