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
    












//    public IGMatR2 mul(IGMatR3 b){
////
//    }
//    //
//    public IGVecR3 colXMat(IGVecR3 col){
////
//    }
//    public IGMatR3 suma (IGMatR3 b){
////
//    }
//    public IGMatR2 resta (IGMatR2 b){
////
//    }
//    public IGMatR3 escalarXmat(double escalar){
////
//    }
//
//     public static IGVecR3 rotacionZ (double angulo, IGVecR3 vector){
////
//  }
//     public static IGVecR3 rotacionX (double angulo, IGVecR3 vector){
//    }
//    public static IGVecR3 rotacionY (double angulo, IGVecR3 vector){
//    }
}
