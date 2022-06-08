package vista;

import app.Rec;

import app.Tri;

import org.w3c.dom.css.Rect;

public class EntrarSistema {
    public EntrarSistema() {
        super();
    }

    private static Rec rec= new Rec();
    private static Tri tri= new Tri();//creo objeto de rec
    public static void main(String[] args) {
        EntrarSistema entrarSistema = new EntrarSistema();
        
        Rec rec = new Rec();//llamo el constructor
        
        System.out.println(rec.calcular());
        System.out.println(tri.calcular());
    }
}
