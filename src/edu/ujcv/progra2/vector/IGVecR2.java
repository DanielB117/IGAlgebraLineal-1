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
      IGVecR2  wea = new IGVecR2();
      wea.x = x + b.x;
        wea.y= y+ b.y;
        return wea;
        //TODO: implementar
    }





    public IGVecR2 resta(IGVecR2 b){

        IGVecR2  wea = new IGVecR2();
        wea.x = x - b.x;
        wea.y= y - b.y;
        return wea;
        //TODO: implementar
    }




    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR2();
    }




    public double productoPunto(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }
    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){
    //}
    public double determinante(){
        //TODO: implementar
        return 0.0;
    }
    public double angulo(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }
    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
// getter and setter
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





//    privado los datos
//     un escalar que represente 'x' y 'y' los componentes del vector
//contencion
//     publico los constructores por defecto, copia, y conveniencia, recuerden a bob
//     publico accesoras y mutadoras
//    publico interfase
//    this es el vector a
//     c.x = a.x + b.x
//     c.y = a.y + b.y