package ejercicio4;

public class CondicionFortalezaMayor extends Condicion{
    private int fortaleza;
    public CondicionFortalezaMayor(int fortaleza){
        this.fortaleza=fortaleza;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return this.fortaleza<ficha.getFortaleza();
    }
}
