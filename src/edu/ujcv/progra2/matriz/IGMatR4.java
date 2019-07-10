package edu.ujcv.progra2.matriz;
import edu.ujcv.progra2.vector.IGVecR4;

public class IGMatR4 {
    private IGVecR4 colX;
    private IGVecR4 colY;
    private IGVecR4 colZ;
    private IGVecR4 colW;

    public IGMatR4() {
        colX = new IGVecR4(1, 0,0,0);
        colY = new IGVecR4(0, 1,0,0);
        colY = new IGVecR4(0, 0,1,0);
        colW = new IGVecR4(0, 0,0,1);
    }

    public IGMatR4(IGVecR4 colX, IGVecR4 colY, IGVecR4 colZ, IGVecR4 colW) {
        this.colX = new IGVecR4(colX);
        this.colY = new IGVecR4(colY);
        this.colZ = new IGVecR4(colZ);
        this.colW = new IGVecR4(colW);

    }

    public IGMatR4(IGMatR4 b) {
        this.colX = new IGVecR4(b.colX);
        this.colY = new IGVecR4(b.colY);
        this.colZ = new IGVecR4(b.colZ);
        this.colW = new IGVecR4(b.colW);
    }


    public IGMatR4 mul(IGMatR4 b){
IGMatR4 Resul = new IGMatR4();
Resul.setColX(new IGVecR4(this.getFilaX().productoPunto(b.colX),this.getColY().productoPunto(b.colX),this.getFilaZ().productoPunto(b.colX),this.getFilaW().productoPunto(b.colX)));
        Resul.setColY(new IGVecR4(this.getFilaX().productoPunto(b.colY),this.getColY().productoPunto(b.colY),this.getFilaZ().productoPunto(b.colY),this.getFilaW().productoPunto(b.colY)));
        Resul.setColZ(new IGVecR4(this.getFilaX().productoPunto(b.colZ),this.getColY().productoPunto(b.colZ),this.getFilaZ().productoPunto(b.colZ),this.getFilaW().productoPunto(b.colZ)));
        Resul.setColW(new IGVecR4(this.getFilaX().productoPunto(b.colW),this.getColY().productoPunto(b.colW),this.getFilaZ().productoPunto(b.colW),this.getFilaW().productoPunto(b.colW)));
   return Resul;
    }

  public IGVecR4 colXMat(IGVecR4 col){
        IGVecR4 Resul = new IGVecR4();
        Resul.setx(col.productoPunto(this.getFilaX()));
      Resul.setY(col.productoPunto(this.getFilaY()));
      Resul.setZ(col.productoPunto(this.getFilaZ()));
      Resul.setw(col.productoPunto(this.getFilaW()));
      return Resul;
    }
public IGMatR4 suma (IGMatR4 b){
        IGMatR4 Resul = new IGMatR4();
        Resul.setColX(this.colX.suma(b.colX));
    Resul.setColY(this.colY.suma(b.colY));
    Resul.setColZ(this.colZ.suma(b.colZ));
    Resul.setColW(this.colW.suma(b.colW));
    return Resul;

    }
  public IGMatR4 resta (IGMatR4 b){
      IGMatR4 Resul = new IGMatR4();
      Resul.setColX(this.colX.resta(b.colX));
      Resul.setColY(this.colY.resta(b.colY));
      Resul.setColZ(this.colZ.resta(b.colZ));
      Resul.setColW(this.colW.resta(b.colW));
      return Resul;
    }
  public IGMatR4 escalarXmat(double escalar){
        IGMatR4 Resul = new IGMatR4();
      Resul.colX.setx(this.colX.getX()* escalar);
      Resul.colX.setY(this.colX.getY()* escalar);
      Resul.colX.setZ(this.colX.getZ()* escalar);
      Resul.colX.setw(this.colX.getw()* escalar);

      Resul.colY.setx(this.colY.getX()* escalar);
      Resul.colY.setY(this.colY.getY()* escalar);
      Resul.colY.setZ(this.colY.getZ()* escalar);
      Resul.colY.setw(this.colY.getw()* escalar);

      Resul.colZ.setx(this.colZ.getX()* escalar);
      Resul.colZ.setY(this.colZ.getY()* escalar);
      Resul.colZ.setZ(this.colZ.getZ()* escalar);
      Resul.colZ.setw(this.colZ.getw()* escalar);

      Resul.colW.setx(this.colW.getX()* escalar);
      Resul.colW.setY(this.colW.getY()* escalar);
      Resul.colW.setZ(this.colW.getZ()* escalar);
      Resul.colW.setw(this.colW.getw()* escalar);
      return Resul;

  }
//     public static IGVecR4 rotacionZ (double angulo, IGVecR4 vector){
//  }
//     public static IGVecR4 rotacionX (double angulo, IGVecR4 vector){
//  }
//     public static IGVecR4 rotacionY (double angulo, IGVecR4 vector){
//
//    }
//     public static IGVecR4 rotacionw (double angulo, IGVecR4 vector){
//
//    }
  public IGVecR4 getColX(){
      return colX;
  }

    public void setColX(IGVecR4 colX) {
        this.colX = colX;
    }

    public IGVecR4 getColY() {
        return colY;
    }

    public void setColY(IGVecR4 colY) {
        this.colY = colY;
    }
    public IGVecR4 getColZ(){
        return colZ;
    }
    public void setColZ (IGVecR4 colZ){
        this.colZ=colZ;
    }
    public IGVecR4 getColW(){
        return colW;
    }
    public void setColW (IGVecR4 colW){
        this.colW=colW;

    }
    public IGVecR4 getFilaX(){
        return new IGVecR4(colX.getX(),colY.getY(),colZ.getZ(),colW.getw());
    }
    public IGVecR4 getFilaY(){
        return new IGVecR4(colX.getY(),colY.getY(),colZ.getZ(),colW.getw());
    }
    public IGVecR4 getFilaZ(){
        return new IGVecR4(colX.getZ(),colY.getY(),colZ.getZ(),colW.getw());
    }
    public IGVecR4 getFilaW(){
        return new IGVecR4(colX.getZ(),colY.getY(),colZ.getZ(),colW.getw());
    }
}


