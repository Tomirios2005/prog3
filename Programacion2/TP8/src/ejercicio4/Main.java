package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Tarea t1 = new TareaSimple("guardar",20.4,120);
        Tarea t2 = new TareaSimple("guardar",20.4,120);
        Tarea t3 = new TareaSimple("editar",20.5,123);
        Tarea t4 = new TareaSimple("comprimir",20.4,120);
        TareaCompuesta tCompuesta=new TareaCompuesta("computacion");
        TareaCompuesta tCompuesta2=new TareaCompuesta("computacion");
        TareaCompuesta tCompuesta3=new TareaCompuesta("computacion");
        TareaCompuesta tCompuesta4=new TareaCompuesta("computacion");
        tCompuesta.addTarea(tCompuesta2);
        tCompuesta.addTarea(tCompuesta3);
        tCompuesta.addTarea(tCompuesta4);
        tCompuesta2.addTarea(t1);
        tCompuesta4.addTarea(t2);
        tCompuesta3.addTarea(t3);
        tCompuesta.addTarea(t4);
        System.out.println(tCompuesta.getAcciones());


    }
}
