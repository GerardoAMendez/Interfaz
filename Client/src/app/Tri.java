package app;


public class Tri extends Figura implements Calcular{
    public Tri() {
        super();
    }

    @Override
    public Float calcular() {
        // TODO Implement this method
        return (this.getAltura()*this.getBase())/2;
    }

    @Override
    public void entrarAltura(Float a) {
        // TODO Implement this method
    }

    @Override
    public void entrarBase(Float b) {
        // TODO Implement this method
    }
}
