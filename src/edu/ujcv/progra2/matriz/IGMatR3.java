package edu.ujcv.progra2.matriz;
import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {


    private IGVecR3 colX;
    private IGVecR3 colY;
    private IGVecR3 colZ;

    public IGMatR3() {
        colX = new IGVecR3(1, 0,0);
        colY = new IGVecR3(0, 1,0);
        colY = new IGVecR3(0, 1,0);
    }

    public IGMatR3(IGVecR3 colX, IGVecR3 colY, IGVecR3 colZ) {
        this.colX = new IGVecR3(colX);
        this.colY = new IGVecR3(colY);
        this.colZ = new IGVecR3(colZ);
    }

    public IGMatR3(IGMatR3 b) {
        this.colX = new IGVecR3(b.colX);
        this.colY = new IGVecR3(b.colY);
        this.colZ = new IGVecR3(b.colZ);
    }
    public IGMatR3 suma (IGMatR3 b){
        IGMatR3 Resul = new IGMatR3();
        Resul.setColX(this.colX.suma(b.colX));
        Resul.setColY(this.colY.suma(b.colY));
        Resul.setColZ(this.colZ.suma(b.colZ));
return Resul;
    }
        public IGMatR3 resta (IGMatR3 b){
            IGMatR3 Resul = new IGMatR3();
            Resul.setColX(this.colX.resta(b.colX));
            Resul.setColY(this.colY.resta(b.colY));
            Resul.setColZ(this.colZ.resta(b.colZ));
            return Resul;
    }
    public IGMatR3 mul(IGMatR3 b){
        IGMatR3 Resul = new IGMatR3();
        Resul.setColX(new IGVecR3(this.getFilaX().productoPunto(b.colX),this.getFilaY().productoPunto(b.colX),this.getFilaZ().productoPunto(b.colX)));
        Resul.setColY(new IGVecR3(this.getFilaX().productoPunto(b.colY),this.getFilaY().productoPunto(b.colY),this.getFilaZ().productoPunto(b.colY)));
        Resul.setColZ(new IGVecR3(this.getFilaX().productoPunto(b.colZ),this.getFilaY().productoPunto(b.colZ),this.getFilaZ().productoPunto(b.colZ)));
        return Resul;


    }

    public IGVecR3 colXMat(IGVecR3 fila){
        IGVecR3 Resul = new IGVecR3();
        Resul.setx(fila.productoPunto(this.getFilaX()));
        Resul.setY(fila.productoPunto(this.getFilaY()));
        Resul.setZ(fila.productoPunto(this.getFilaZ()));
        return Resul;
}


  public IGMatR3 escalarXmat(double escalar){
IGMatR3 Resul = new IGMatR3();
Resul.colX.setx(this.colX.getX()* escalar);
      Resul.colX.setY(this.colX.getY()* escalar);
      Resul.colX.setZ(this.colX.getZ()* escalar);

      Resul.colY.setx(this.colY.getX()* escalar);
      Resul.colY.setY(this.colY.getY()* escalar);
      Resul.colY.setZ(this.colY.getZ()* escalar);

      Resul.colZ.setx(this.colZ.getX()* escalar);
      Resul.colZ.setY(this.colZ.getY()* escalar);
      Resul.colZ.setZ(this.colZ.getZ()* escalar);
      return Resul;
    }

// public static IGVecR3 rotacionZ (double angulo, IGVecR3 vector){
//IGVecR3 Resul=new IGVecR3();

//     public static IGVecR3 rotacionX (double angulo, IGVecR3 vector){
//    }
//    public static IGVecR3 rotacionY (double angulo, IGVecR3 vector){
//    }
public IGVecR3 getColX(){
    return colX;
}

    public void setColX(IGVecR3 colX) {
        this.colX = colX;
    }

    public IGVecR3 getColY() {
        return colY;
    }

    public void setColY(IGVecR3 colY) {
        this.colY = colY;
    }
    public IGVecR3 getColZ(){
        return colZ;
    }
    public void setColZ (IGVecR3 colZ){
    this.colZ=colZ;
    }
    public IGVecR3 getFilaX(){
        return new IGVecR3(colX.getX(),colY.getY(),colZ.getZ());
    }
    public IGVecR3 getFilaY(){
        return new IGVecR3(colX.getY(),colY.getY(),colZ.getZ());
    }
    public IGVecR3 getFilaZ(){
        return new IGVecR3(colX.getZ(),colY.getY(),colZ.getZ());
    }
}
