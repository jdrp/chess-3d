package rendering.model.piece;

import rendering.model.ChessPiece3D;
import rendering.util.Util;

import java.awt.Color;

public class King3D extends ChessPiece3D {
    public King3D(Color color) {
        super("k", color, Util.readMeshFromObjFile("/3d/pieces/king.obj", color));
    }
}
