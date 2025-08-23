public class CondicionAnd extends Condicion{
   private Condicion c1;
   private Condicion c2;

    @Override
    public boolean cumple(ArchivoGenerico aa) {
        return c1.cumple(aa)&&c2.cumple(aa);
    }
}
