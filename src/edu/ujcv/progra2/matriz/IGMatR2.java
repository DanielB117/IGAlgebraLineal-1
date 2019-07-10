package edu.ujcv.progra2.matriz;
import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {
    private IGVecR2 colX;
    private IGVecR2 colY;


    public IGMatR2() {
        colX = new IGVecR2(1, 0);
        colY = new IGVecR2(0, 1);
    }

    public IGMatR2(IGVecR2 colX, IGVecR2 colY) {
        this.colX = new IGVecR2(colX);
        this.colY = new IGVecR2(colY);

    }

    public IGMatR2(IGMatR2 b) {
        this.colX = new IGVecR2(b.colX);
        this.colY = new IGVecR2(b.colY);
    }


  public IGMatR2 mul(IGMatR2 b){
IGMatR2 Resul = new IGMatR2();
Resul.setColX(new IGVecR2(this.getFilaX().productoPunto(b.colX),this.getFilaY().productoPunto(b.colX)));
Resul.setColY(new IGVecR2(this.getFilaX().productoPunto(b.colX),this.getFilaY().productoPunto(b.colY)));
return Resul;
    }

  public IGVecR2 colXMat(IGVecR2 fila){
       IGVecR2 Resul = new IGVecR2();
       Resul.setx(fila.productoPunto(this.getFilaX()));
       Resul.setY(fila.productoPunto(this.getFilaY()));
       return Resul;

}
    public IGMatR2 suma (IGMatR2 b) {
        IGMatR2 Resul = new IGMatR2();
        Resul.setColX(this.colX.suma(b.colX));
        Resul.setColY(this.colY.suma(b.colY));
        return Resul;
    }



   public IGMatR2 resta (IGMatR2 b){
       IGMatR2 Resul = new IGMatR2();
       Resul.setColX(this.colX.resta(b.colX));
       Resul.setColY(this.colY.resta(b.colY));
       return Resul;
    }
 public IGMatR2 escalarXmat(double escalar){
    IGMatR2 Resul = new IGMatR2();
    Resul.colX.setx(this.colX.getX()* escalar);
     Resul.colX.setY(this.colX.getY()* escalar);
     Resul.colY.setx(this.colY.getX()* escalar);
     Resul.colY.setY(this.colY.getY()* escalar);
     return Resul;
    }
        public IGVecR2 rotacion (double angulo, IGVecR2 fila){
            IGVecR2 Resul = new IGVecR2();
            Resul.setx(fila.productoPunto(this.getFilaX()));
            Resul.setY(fila.productoPunto(this.getFilaY()));
            return  Resul;
    }

    public IGVecR2 getColX(){
        return colX;
    }

    public void setColX(IGVecR2 colX) {
        this.colX = colX;
    }

    public IGVecR2 getColY() {
        return colY;
    }

    public void setColY(IGVecR2 colY) {
        this.colY = colY;
    }
    public IGVecR2 getFilaX(){
        return new IGVecR2(colX.getX(),colY.getY());
    }
    public IGVecR2 getFilaY(){
        return new IGVecR2(colX.getY(),colY.getY());
    }
}